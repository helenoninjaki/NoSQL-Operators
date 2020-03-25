package gr.ds.unipi.noda.api.core.operators;

import gr.ds.unipi.noda.api.core.operators.filterOperators.FilterOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.comparisonOperators.ComparisonOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.Coordinates;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geoSpatialOperators.GeoSpatialOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geoTemporalOperators.GeoTemporalOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geoTemporalOperators.temporal.TemporalBounds;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geometries.*;
import gr.ds.unipi.noda.api.core.operators.filterOperators.logicalOperators.LogicalOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.textualOperators.TextualOperator;

import java.util.Date;

public class FilterOperators {

    public static FilterOperator and(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        return LogicalOperator.logicalOperator.newOperatorAnd(filterOperator1, filterOperator2, filterOperators);
    }

    public static FilterOperator or(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        return LogicalOperator.logicalOperator.newOperatorOr(filterOperator1, filterOperator2, filterOperators);
    }

    public static FilterOperator gte(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, boolean fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, String fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, boolean fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, String fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator inGeoPolygon(String fieldName, Coordinates coordinates1, Coordinates coordinates2, Coordinates coordinates3, Coordinates... coordinates) {
        return GeoSpatialOperator.geoSpatialOperator.newOperatorInGeoPolygon(fieldName, Polygon.newPolygon(coordinates1, coordinates2, coordinates3, coordinates));
    }

    public static FilterOperator inGeoRectangle(String fieldName, Coordinates lowerBoundPoint, Coordinates upperBoundPoint) {
        return GeoSpatialOperator.geoSpatialOperator.newOperatorInGeoRectangle(fieldName, Rectangle.newRectangle(lowerBoundPoint, upperBoundPoint));
    }

    public static FilterOperator inGeoCircleKm(String fieldName, Coordinates point, double radius) {
        return GeoSpatialOperator.geoSpatialOperator.newOperatorInGeoCircleKm(fieldName, Circle.newCircle(point, radius * 1000));
    }

    public static FilterOperator inGeoCircleMeters(String fieldName, Coordinates point, double radius) {
        return GeoSpatialOperator.geoSpatialOperator.newOperatorInGeoCircleMeters(fieldName, Circle.newCircle(point, radius));
    }

    public static FilterOperator inGeoCircleMiles(String fieldName, Coordinates point, double radius) {
        return GeoSpatialOperator.geoSpatialOperator.newOperatorInGeoCircleMiles(fieldName, Circle.newCircle(point, radius * 1609.344));
    }

    public static FilterOperator geoNearestNeighbors(String fieldName, Coordinates point, int neighbors) {
        return GeoSpatialOperator.geoSpatialOperator.newOperatorGeoNearestNeighbors(fieldName, Point.newPoint(point), neighbors);
    }

    public static FilterOperator inGeoTemporalPolygon(String fieldName, String fieldTemporalName, Date lowerBoundDate, Date upperBoundDate, Coordinates coordinates1, Coordinates coordinates2, Coordinates coordinates3, Coordinates... coordinates) {
        return GeoTemporalOperator.geoTemporalOperator.newOperatorInGeoTemporalPolygon(fieldName,  Polygon.newPolygon(coordinates1, coordinates2, coordinates3, coordinates), fieldTemporalName, TemporalBounds.newTemporalBounds(lowerBoundDate, upperBoundDate));
    }

    public static FilterOperator inGeoTemporalRectangle(String fieldName, Coordinates lowerBoundPoint, Coordinates upperBoundPoint, String fieldTemporalName, Date lowerBoundDate, Date upperBoundDate) {
        return GeoTemporalOperator.geoTemporalOperator.newOperatorInGeoTemporalRectangle(fieldName, Rectangle.newRectangle(lowerBoundPoint, upperBoundPoint), fieldTemporalName, TemporalBounds.newTemporalBounds(lowerBoundDate, upperBoundDate));
    }

    public static FilterOperator inGeoTemporalCircleKm(String fieldName, Coordinates point, double radius, String fieldTemporalName, Date lowerBoundDate, Date upperBoundDate) {
        return GeoTemporalOperator.geoTemporalOperator.newOperatorInGeoTemporalCircleKm(fieldName, Circle.newCircle(point, radius * 1000), fieldTemporalName, TemporalBounds.newTemporalBounds(lowerBoundDate, upperBoundDate));
    }

    public static FilterOperator inGeoTemporalCircleMeters(String fieldName, Coordinates point, double radius, String fieldTemporalName, Date lowerBoundDate, Date upperBoundDate) {
        return GeoTemporalOperator.geoTemporalOperator.newOperatorInGeoTemporalCircleMeters(fieldName, Circle.newCircle(point, radius), fieldTemporalName, TemporalBounds.newTemporalBounds(lowerBoundDate, upperBoundDate));
    }

    public static FilterOperator inGeoTemporalCircleMiles(String fieldName, Coordinates point, double radius, String fieldTemporalName, Date lowerBoundDate, Date upperBoundDate) {
        return GeoTemporalOperator.geoTemporalOperator.newOperatorInGeoTemporalCircleMiles(fieldName, Circle.newCircle(point, radius * 1609.344), fieldTemporalName, TemporalBounds.newTemporalBounds(lowerBoundDate, upperBoundDate));
    }

    public static FilterOperator geoTemporalNearestNeighbors(String fieldName, Coordinates point, String fieldTemporalName, Date date, int neighbors) {
        return GeoTemporalOperator.geoTemporalOperator.newOperatorGeoTemporalNearestNeighbors(fieldName, Point.newPoint(point), neighbors);
    }

    public static FilterOperator anyKeywords(String fieldName, String keyword, String... keywords){
        return TextualOperator.textualOperator.newOperatorAnyKeywords(fieldName, keyword, keywords);
    }

    public static FilterOperator allKeywords(String fieldName, String keyword1, String keyword2, String... keywords){
        return TextualOperator.textualOperator.newOperatorAllKeywords(fieldName, keyword1, keyword2, keywords);
    }

}