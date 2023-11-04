/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author pc-6
 */
public class Tables {
    public static void main(String[] args) {
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.execute("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(200),mobileNumeber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            JOptionPane.showMessageDialog(null, "Table create sucessfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
