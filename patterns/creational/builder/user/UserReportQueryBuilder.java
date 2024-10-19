package user;
import commons.Filter;
import commons.IQueryBuilder;
import commons.Pagination;
import commons.Sort;
import java.util.List;

public class UserReportQueryBuilder implements IQueryBuilder{

    UserReport userReport;

    public UserReportQueryBuilder(){
        this.userReport = new UserReport();
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
        this.userReport = new UserReport();
    }

    public UserReport getUserReport(){
        UserReport userReport = this.userReport;
        reset(); //Reset the existing user report
        return userReport;
    }

    public String getUserReportQuery(UserReport userReport){
        String query = null;
        //Build a query
        return query;
    }

    private void validateFieldExistence(List<String> fields) {
        //Check if all the fields specified exist in the UserReport
    }
    
}
