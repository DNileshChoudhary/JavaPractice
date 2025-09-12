import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root"; // replace with your actual MySQL username
        String pass = "Nilesh@123456"; // replace with your actual MySQL password

        try {
            // Explicitly load the MySQL driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Connected to the database successfully!");
            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        }
    }
}
