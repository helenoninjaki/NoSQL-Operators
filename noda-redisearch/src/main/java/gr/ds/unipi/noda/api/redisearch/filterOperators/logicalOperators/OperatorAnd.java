package gr.ds.unipi.noda.api.redisearch.filterOperators.logicalOperators;

import gr.ds.unipi.noda.api.core.constants.StringPool;
import gr.ds.unipi.noda.api.core.operators.filterOperators.FilterOperator;

final class OperatorAnd extends LogicalOperator {

    private OperatorAnd(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        super(filterOperator1, filterOperator2, filterOperators);
    }

    @Override
    protected String getOperatorField() {
        return StringPool.SPACE;
    }
    protected String getPostOperatorField() {
        return StringPool.DOUBLE_AMPERSAND;
    }

    static OperatorAnd newOperatorAnd(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        return new OperatorAnd(filterOperator1, filterOperator2, filterOperators);
    }
}
