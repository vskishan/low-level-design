public class App {

    public static void main(String[] args) {
        
        DriverManager driverManager = DriverManager.getDriverManager("jdbc:postgresql://host:port/database");
        Connection connection = driverManager.getConnection("jdbc:postgresql://host:port/database", "sample", "1234");
        connection.executeStatement("SELECT * FROM employees");
    }
}
