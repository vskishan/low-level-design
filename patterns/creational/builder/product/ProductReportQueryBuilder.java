package product;

import java.util.List;

import commons.Filter;
import commons.IQueryBuilder;
import commons.Pagination;
import commons.Sort;

public class ProductReportQueryBuilder implements IQueryBuilder{

    ProductReport productReport;

    public ProductReportQueryBuilder(){
        this.productReport = new ProductReport();
    }

    @Override
    public void setFields(List<String> fields) {
        validateFieldExistence(fields);
        //Set all the fields
    }

    @Override
    public void setFilters(List<Filter> filters) {
        //Set filters
    }

    @Override
    public void setSortByParams(List<Sort> sort) {
        //Set sortby params
    }

    @Override
    public void setPaginationParams(Pagination pagination) {
        //Set pagination params
    }

    @Override
    public void reset(){
        this.productReport = new ProductReport();
    }

    public ProductReport getProductReport(){
        ProductReport productReport = new ProductReport();
        reset(); //Reset the existing product report
        return productReport;
    }

    public String getProductReportQuery(ProductReport productReport){
        String query = null;
        //Build a query
        return query;
    }

    private void validateFieldExistence(List<String> fields) {
        //Check if all the fields specified exist in the UserReport
    }
    
}
