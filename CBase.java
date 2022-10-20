/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FClasse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nissi
 */
public class CBase {
    private String url = "jdbc:mysql://localhost:3306/gestionstagiaireBD";
    private String user = "root";
    private String pwd = "";
    public Connection con;
    public CBase(){
        try{
            con = DriverManager.getConnection(url, user, pwd);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erreur : \n"+ e.getMessage());
        }
    }
    
}
