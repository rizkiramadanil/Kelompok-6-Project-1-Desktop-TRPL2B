/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisteminformasipuskesmas;

/**
 *
 * @author Asus
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connection {
    private static Connection mysqlconnection;
    public static Connection getConnection() throws SQLException{
        if(mysqlconnection==null){
            try {
                String db = "jdbc:mysql://localhost:3306/puskesmas";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlconnection = (Connection) DriverManager.getConnection(db,user,password);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        } return mysqlconnection;
    }
}