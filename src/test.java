import aufgabe01d.Start;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {

    public static void main(String[] a)
            throws Exception {
        Connection conn = DriverManager.
                getConnection(
//                        "jdbc:mysql://localhost:3306/sonoo"
//                        "jdbc:mysql//192.168.0.206:3306/hiber", "hiber", "123"
                        "jdbc:h2:~/test", "sa", ""
                        );
        // add application code here
        conn.close();
    }
    public static long summe(long a, long b) {
        int k;
        return a + b;
    }
}

