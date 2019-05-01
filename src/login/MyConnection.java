package login;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class MyConnection {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "supermarket";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
        
        Connection MyConnection = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try{
            MyConnection = datasource.getConnection();
            
        }catch (SQLException ex){
            Logger.getLogger("Get Connection "+MyConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return MyConnection;
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public static Connection getConnection(){
        
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/supermarket","root","");
            JOptionPane.showMessageDialog(null,"Connected");
            return null;
        }catch(SQLException e)
        {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(e.getMessage());
        }
        return con;
    }*/
}
