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

public class Encadreur {
    CBase bdd = new CBase();
    Statement st;
    ResultSet rs;
    
public boolean Ajout(String matricul, int fonction,String nom, String prenom, String sexe) throws SQLException{
        String req ="INSERT INTO `agent`(`MATRICUL`, `IDFONCT`, `NOMAGENT`, `PRENOM`, `SEXE`) VALUES ('"+matricul+"', '"+fonction+"', '"+nom+"', '"+prenom+"', '"+sexe+"')";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }
public void RemplireEnc(JComboBox cmb) throws SQLException{
    String req = "SELECT * FROM v_agent";
    st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        cmb.removeAllItems();
        while (rs.next()) {
            cmb.addItem(rs.getString("NomAg"));
        }
        cmb.setSelectedIndex(-1);
}
 public String getMatAg(String nom) throws SQLException{
        String req = "Select MATRICUL from v_agent where NomAg = '"+nom+"'";
        st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        while (rs.next()) {
            return rs.getString(1);
        }
        return null;
    } 
 public int compte() throws SQLException{
    String requete = "select count(*) from AGENT";
    st = bdd.con.createStatement();
    rs = st.executeQuery(requete);
    while (rs.next()){
        return rs.getInt(1);
    }
    return 0;
 }
}
