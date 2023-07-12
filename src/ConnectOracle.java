import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectOracle {
    Connection con=null;
    public Connection EstablishCon(){
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kashif", "project"); 
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
     }
    return con;
    }
}