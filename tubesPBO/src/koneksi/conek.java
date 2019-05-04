/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
import com.mysql.jdbc.Driver;
/**
 *
 * @author samNOLIMIT
 */
public class conek {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{
        if (koneksi==null){
            new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/laundry","root","");
        }
        return koneksi;
    }
    
}
