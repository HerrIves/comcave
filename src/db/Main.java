package db;

import db.tables.BookManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Starting Application");
        ConnectionManager.getInstance().setDbType(DBType.H2);

        Connection conn = ConnectionManager.getInstance().getConnection();

        BookManager.displayAllRows();

        ConnectionManager.getInstance().close();
//        Connection conn = DriverManager.
//                getConnection("jdbc:h2:~/test", "sa", "");
//        // add application code here
//        conn.close();
    }
}
