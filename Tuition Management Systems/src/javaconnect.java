
import java.sql.*;
import javax.swing.*;

public class javaconnect {
    
    Connection conn=null;
    
    public static Connection ConnecrDb(){
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/tuition_management_system","root","");
            return conn;
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    
    
    
    }
}
