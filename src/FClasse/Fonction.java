/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FClasse;

/**
 *
 * @author Nissi
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
public class Fonction {
    CBase bdd = new CBase();
    Statement st;
    ResultSet rs;
    
/*public boolean Ajout(String matricul, String nom,String postnom, String prenom, String sexe,String univ,String datdeb, String datfin,String telephone, String typeStage, String special) throws SQLException{
        String req ="INSERT INTO service(IDSTAGIAIRE, NOMSTAGIAIRE, POSTNOMSTAGIAIRE,PRENOMSTAGIAIRE,SEXE,UNIVPROV,TYPESTAGE,TELEPHONE,DATEDEBUT,DATEFIN, specialite) VALUES('"+matricul+"', '"+nom+"', '"+postnom+"', '"+prenom+"', '"+sexe+"', '"+univ+"', '"+typeStage+"', '"+telephone+"', '"+datdeb+"', '"+datfin+"', '"+special+"')";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }*/
public void RemplireFonct(JComboBox cmb) throws SQLException{
    String req = "SELECT * FROM v_fonction";
    st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        cmb.removeAllItems();
        while (rs.next()) {
            cmb.addItem(rs.getString("Fonctions"));
        }
        cmb.setSelectedIndex(-1);
}
/*public int compte() throws SQLException{
    String requete = "select count(*) from fonction";
    st = bdd.con.createStatement();
    rs = st.executeQuery(requete);
    while (rs.next()){
        return rs.getInt(1);
    }
    return 0;
}*/
 public int getIdFonct(String fonct) throws SQLException{
        String req = "Select IDFONCT from v_fonction where Fonctions = '"+fonct+"'";
        st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    } 
}
