package db;

public class ConnectionManager {
    private static ConnectionManager instance = null;

    private final String USERNAME = "dbuser";
    private final String PASSWORD = "dbpassword";
    private final String M_CONN_STRING = "jdbc:masql//localhost/explorecalifornia";
    private final String H_CONN_STRING = "jdbc:masql//localhost/explorecalifornia";

    private DBType dbType = DBTYpe.MySQL;

    private Connection conn = null;

    private ConnectionManager(){}


}
