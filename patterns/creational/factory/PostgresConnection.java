public class PostgresConnection extends Connection {

    public PostgresConnection(String url, String username, String password){
        super(url, username, password);
    }
    
    @Override
    public void executeStatement(String statement){
        //Logic to fire a query to postgres DB
    }
}
