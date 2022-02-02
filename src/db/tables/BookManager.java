package db.tables;

import db.ConnectionManager;

import java.sql.*;

public class BookManager {
    private static Connection conn = ConnectionManager.getInstance().getConnection();

    public static void displayAllRows() throws SQLException {
        String sql = "SELECT * FROM books";

        try(
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ){
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("BOOKS TABLE:");
            while (rs.next()){
                for (int i = 1; i < rsmd.getColumnCount(); i++) {
                    System.out.println(rs.getString(i) + " " + rsmd.getColumnName(i)) ;
                }
            }
        }
    }
}
