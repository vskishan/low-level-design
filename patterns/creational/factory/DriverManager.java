public abstract class DriverManager {

    public static DriverManager getDriverManager(String url) {
        if (url.startsWith("jdbc:mysql")) {
            return new MySQLConnectionFactory();
        } else if (url.startsWith("jdbc:postgresql")) {
            return new PostgresConnectionFactory();
        } else {
            throw new IllegalArgumentException("Unsupported database type.");
        }
    }

    //Factory method
    public abstract Connection getConnection(String url, String username, String password);
    
}
