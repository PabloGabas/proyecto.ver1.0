/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author metal
 */
public class ConexionSQLServer {
    Connection con = null;
    String user = "ConexionSQL";
    String pass = "Andrey777";
    String ip = "localhost";
    String db = "ConexionSQLNet";
    String port = "1433";
   
    public Connection getConecction(){
    
        
        try {
            String conexionURL = "jdbc:sqlserver://localhost:1433;"
        + "database=Prueba;"
        + "user=Prueba;"
        + "password=Cruz777;"
        + "encrypt=true;"
        + "trustServerCertificate=true";
        
        con = DriverManager.getConnection(conexionURL);
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error "+ e.toString());
            
            
        }
        return con;
    
    }
    
    
    
    
    
    
    
    
    
}
