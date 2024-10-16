public class PostgresConnectionFactory extends DriverManager {
    
    @Override
    public Connection getConnection(String url, String username, String password){
        //Mocking logic to obtain Postgres DB Connection
        return new PostgresConnection(url, username, password);
    }
}
