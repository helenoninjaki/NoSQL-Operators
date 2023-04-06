package gr.ds.unipi.noda.api.couchdb;

import gr.ds.unipi.noda.api.core.nosqldb.NoSqlDbConnector;
import gr.ds.unipi.noda.api.core.nosqldb.modifications.FieldValue;
import gr.ds.unipi.noda.api.core.nosqldb.modifications.NoSqlDbUpdates;
import gr.ds.unipi.noda.api.core.operators.filterOperators.FilterOperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

final class CouchDBUpdates extends NoSqlDbUpdates {
    private final CouchDBConnectionManager couchDBConnectionManager = CouchDBConnectionManager.getInstance();
    private final List<Update> updates;

    private CouchDBUpdates(NoSqlDbConnector noSqlDbConnector, String dataCollection) {
        super(noSqlDbConnector, dataCollection);
        updates = Collections.emptyList();
    }

    private CouchDBUpdates(CouchDBUpdates self, List<Update> updates) {
        super(self.getNoSqlDbConnector(), self.getDataCollection());
        this.updates = updates;
    }

    public static NoSqlDbUpdates newCouchDbUpdates(CouchDBConnector connector, String s) {
        return new CouchDBUpdates(connector, s);
    }

    @Override
    public NoSqlDbUpdates flush() {
        if (updates.isEmpty()) {
            return this;
        }

        CouchDBConnector.CouchDBConnection connection = couchDBConnectionManager.getConnection(getNoSqlDbConnector());

        for (Update update : updates) {
            View.Response res = connection.execute(update.viewBuilder.build());

            List<Map<String, Object>> docs = res.rows.stream().map(row -> {
                for (FieldValue<?> fv : update.fieldValues) {
                    if (row.doc.containsKey(fv.getField())) {
                        row.doc.replace(fv.getField(), fv.getValue());
                    } else {
                        row.doc.put(fv.getField(), fv.getValue());
                    }
                }

                return row.doc;
            }).collect(Collectors.toList());

            connection.bulkDocs(getDataCollection(), docs);
        }

        return this;
    }

    @Override
    public NoSqlDbUpdates update(FilterOperator filterOperator, FieldValue fv, FieldValue... fvs) {
        List<FieldValue> fieldValues = new ArrayList<>();
        fieldValues.add(fv);
        Collections.addAll(fieldValues, fvs);

        View.Builder viewBuilder = new View.Builder(getDataCollection());
        viewBuilder.addFilter((String) filterOperator.getOperatorExpression());

        List<Update> updates = new ArrayList<>(this.updates);
        updates.add(new Update(viewBuilder, fieldValues));

        return new CouchDBUpdates(this, updates);
    }

    private static class Update {
        private final View.Builder viewBuilder;
        private final List<FieldValue> fieldValues;

        private Update(View.Builder viewBuilder, List<FieldValue> fieldValues) {
            this.viewBuilder = viewBuilder;
            this.fieldValues = fieldValues;
        }
    }
}
