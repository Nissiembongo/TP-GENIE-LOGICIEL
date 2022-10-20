/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class Service {
    CBase bdd = new CBase();
    Statement st;
    ResultSet rs;
    
public boolean Ajout(String matricul, String nom,String postnom, String prenom, String sexe,String univ,String datdeb, String datfin,String telephone, String typeStage, String special) throws SQLException{
        String req ="INSERT INTO service(IDSTAGIAIRE, NOMSTAGIAIRE, POSTNOMSTAGIAIRE,PRENOMSTAGIAIRE,SEXE,UNIVPROV,TYPESTAGE,TELEPHONE,DATEDEBUT,DATEFIN, specialite) VALUES('"+matricul+"', '"+nom+"', '"+postnom+"', '"+prenom+"', '"+sexe+"', '"+univ+"', '"+typeStage+"', '"+telephone+"', '"+datdeb+"', '"+datfin+"', '"+special+"')";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }
public void RemplireErv(JComboBox cmb) throws SQLException{
    String req = "SELECT * FROM v_service";
    st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        cmb.removeAllItems();
        while (rs.next()) {
            cmb.addItem(rs.getString("Services"));
        }
        cmb.setSelectedIndex(-1);
}
 public int getIdServ(String serv) throws SQLException{
        String req = "Select IDSERV from v_service where Services = '"+serv+"'";
        st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }
}