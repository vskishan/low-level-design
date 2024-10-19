package commons;
import java.util.List;

public interface IQueryBuilder {
    
    public void setFields(List<String> fields);

    public void setFilters(List<Filter> filters);

    public void setSortByParams(List<Sort> sortParams);

    public void setPaginationParams(Pagination pagination);

    public void reset();
}
