public class MySQLConnectionFactory extends DriverManager {
    
    @Override
    public Connection getConnection(String url, String username, String password){
        //Mocking logic to obtain MySQL DB Connection
        return new MySQLConnection(url, username, password);
    }
}
