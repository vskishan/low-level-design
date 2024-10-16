public abstract class Connection {

    public String statement;
    public String url;
    public String username;
    public String password;

    public Connection(String url, String username, String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    public abstract void executeStatement(String statement);
}
