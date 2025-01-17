package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JConnection {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "supermarket";
    private static Integer portnumber = 3306;
    private static String password = "newpassword"; // Change this to your MySQL password

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbname, username, password);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return conn;
    }

    public static void createProductTable() {
        String createProductTableSQL = "CREATE TABLE IF NOT EXISTS product (" +
                                "product_id INT PRIMARY KEY, " +
                                "product_name VARCHAR(100), " +
                                "product_stock INT, " +
                                "price DECIMAL(10, 2), " +
                                "enterpricename VARCHAR(100), " +
                                "total DECIMAL(10, 2));";

        Connection conn = getConnection();
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createProductTableSQL); // Create the table if it doesn't exist
            System.out.println("Product table created successfully.");
        } catch (SQLException ex) {
            System.out.println("Error creating product table: " + ex.getMessage());
        }
    }

    public static void createUserTable() {
        String createUserTableSQL = "CREATE TABLE IF NOT EXISTS user (" +
                                "user_id INT AUTO_INCREMENT PRIMARY KEY, " +
                                "fullname VARCHAR(100), " +
                                "username VARCHAR(100) UNIQUE, " +
                                "password VARCHAR(100), " +
                                "type VARCHAR(50), " +
                                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);";

        Connection conn = getConnection();
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(createUserTableSQL); // Create the table if it doesn't exist
            System.out.println("User table created successfully.");
        } catch (SQLException ex) {
            System.out.println("Error creating user table: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        createProductTable(); // Automatically create the product table on startup
        createUserTable();    // Automatically create the user table on startup
    }
}
