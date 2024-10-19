import commons.Filter;
import commons.Pagination;
import commons.Sort;
import java.util.List;
import product.ProductReportQueryBuilder;

public class App {
    
    public static void main(String[] args) {
        
        //Building and executing a product search query
        ProductReportQueryBuilder productReportQueryBuilder = new ProductReportQueryBuilder();
        
        productReportQueryBuilder.setFields(List.of("productName", "productId"));

        Filter productNameFilter = new Filter();
        productNameFilter.fieldName = "productName";
        productNameFilter.fieldValue = "Apple";

        productReportQueryBuilder.setFilters(List.of(productNameFilter));

        Sort sortParams = new Sort();
        sortParams.fieldName = "productId";
        sortParams.sortOrder = "ASC";

        productReportQueryBuilder.setSortByParams(List.of(sortParams));

        Pagination pagination = new Pagination();
        pagination.pageNumber = 1;
        pagination.offset = 5;

        String query = productReportQueryBuilder.getProductReportQuery(
            productReportQueryBuilder.getProductReport()
        );

        QueryExecutor queryExecutor = new QueryExecutor();
        queryExecutor.executeSearchQuery(query);
    }
}
