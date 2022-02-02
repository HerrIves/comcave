package db.tables;

import aufgabe01d.Book;
import db.ConnectionManager;

import java.sql.*;

public class BookManager {

//        String sql = "INSERT INTO BOOKS VALUES(1, 'Java ist auch eine Insel', '978-3-8362-1802-3', '2011-01-01', 'Christian Ullenboom', 450);"


    private static Connection conn = ConnectionManager.getInstance().getConnection();

    public static void displayAllRows() throws SQLException {
        String sql = "SELECT * FROM books";

        try (
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("BOOKS TABLE:");
            while (rs.next()) {
                for (int i = 1; i < rsmd.getColumnCount(); i++) {
                    System.out.println(rs.getString(i) + " " + rsmd.getColumnName(i));
                }
            }
        }
    }

    public static Book getRow() {
        String sql = "SELECT * FROM BOOKS " +
                "WHERE ID = ?";
        ResultSet rs = null;

        try (
                PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()){
                Book bean = new Book();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
