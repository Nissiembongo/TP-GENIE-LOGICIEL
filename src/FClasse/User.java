/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FClasse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nissi
 */
public class User {
    CBase bdd = new CBase();
    Statement st;
    ResultSet rs;
    
    
     public int Afficher (String nom, String mdp) throws SQLException{
            String requete = "SELECT * FROM `user` WHERE nom = '"+nom+"' and mdp = '"+mdp+"'";
            st = bdd.con.createStatement();
            rs = st.executeQuery(requete);
            while(rs.next()){
            return Integer.parseInt(rs.getString(1));
        }
            return 0;
     }
public boolean Ajout(String nom, String mdp) throws SQLException{
        String req ="INSERT INTO `user`(`nom`, `mdp`) VALUES('"+nom+"', '"+mdp+"')";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }
    
}
