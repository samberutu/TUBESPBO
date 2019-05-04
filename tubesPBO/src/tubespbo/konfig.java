/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author samNOLIMIT
 */
public class konfig {
    
    public static Connection koneksi;
    
    public static Connection configDB() throws SQLException{
        try{
            String url="jdbc:mysql://localhost/laundry";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            koneksi = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            //System.out.println("basis data eror "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Eror koneksi ");
        }
        
        return koneksi;
    }
}
