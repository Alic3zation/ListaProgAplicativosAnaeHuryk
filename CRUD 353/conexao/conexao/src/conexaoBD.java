/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Terceiros Anos
 */
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import  java.sql.SQLException;

public class conexaoBD {
    public Connection Connection(){
    Connection con =  null;
    try{
        String url = "jdbc:mysql//localhost:3306//bancocrud?user=root&password=";
        con = DriverManager.getConnection(url);
        
    }catch (SQLException erro){
     JOptionPane.showMessageDialog(null,"Connection" + erro.getMessage());
    }
    return con;
    }
}
