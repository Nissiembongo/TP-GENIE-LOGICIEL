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

public class Stagiaire {
    CBase bdd = new CBase();
    Statement st;
    ResultSet rs;
    
public boolean Ajout(String matricul, String nom,String postnom, String prenom, String sexe,String univ,String datdeb, String datfin,String telephone, String typeStage, String special) throws SQLException{
        String req ="INSERT INTO stagiaire(IDSTAGIAIRE, NOMSTAGIAIRE, POSTNOMSTAGIAIRE,PRENOMSTAGIAIRE,SEXE,UNIVPROV,TYPESTAGE,TELEPHONE,DATEDEBUT,DATEFIN, specialite) VALUES('"+matricul+"', '"+nom+"', '"+postnom+"', '"+prenom+"', '"+sexe+"', '"+univ+"', '"+typeStage+"', '"+telephone+"', '"+datdeb+"', '"+datfin+"', '"+special+"')";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }
     
public boolean Modifier(String matricul, String nom,String postnom, String prenom, String sexe, String univ,String datdeb, String datfin,String telephone, String typeStage, String special) throws SQLException{
        String req ="UPDATE stagiaire SET NOMSTAGIAIRE='"+nom+"', POSTNOMSTAGIAIRE ='"+postnom+"',PRENOMSTAGIAIRE =  '"+prenom+"',SEXE = '"+sexe+"', UNIVPROV = '"+univ+"',TYPESTAGE = '"+typeStage+"',TELEPHONE = '"+telephone+"',DATEDEBUT = '"+datdeb+"',DATEFIN ='"+datfin+"', specialite =  '"+special+"' WHERE  IDSTAGIAIRE = '"+matricul+"'";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }
      
public boolean Supprimer(String matricul) throws SQLException{
        String req ="DELETE FROM stagiaire WHERE  IDSTAGIAIRE = '"+matricul+"'";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }
public int compte () throws SQLException{
        
            String requete = "SELECT COUNT(*) from stagiaire";
            st = bdd.con.createStatement();
             rs = st.executeQuery(requete);
            while(rs.next()){
                return rs.getInt(1);
            }
        return 0;
     }
     
public int compteUniv () throws SQLException{
        
            String requete = "SELECT COUNT(distinct UNIVPROV) from stagiaire";
            st = bdd.con.createStatement();
             rs = st.executeQuery(requete);
            while(rs.next()){
                return rs.getInt(1);
            }
        return 0;
     }
       
public void Afficher (JTable grille) throws SQLException{
        try {
            String requete = "SELECT * from stagiaire";
            int c = 0;
            st = bdd.con.createStatement();
             rs = st.executeQuery(requete);
            while(rs.next())
            {
                c++;
            }
            Object data[][] = new Object[c][11];
            String titre [] = {"MATRICULE", "NOM", "POSTNOM", "PRENOM", "SEXE", "ETABLISSEMENT","SPECIALITE", "TYPESTAGE", "TELEPHONE", "DATEDEBUT", "DATEFIN"};
            rs = st.executeQuery(requete);
            int i = 0;
            while (rs.next()){
                data[i][0]=rs.getString(1);
                data[i][1]=rs.getString(2);
                data[i][2]=rs.getString(3);
                data[i][3]=rs.getString(4);
                data[i][4]=rs.getString(5);
                data[i][5]=rs.getString(6);
                data[i][7]=rs.getString(7);
                data[i][8]=rs.getString(8);
                data[i][9]=rs.getString(9);
                data[i][10]=rs.getString(10);
                data[i][6]=rs.getString(11);
                i++;
            }
            grille.setModel(new DefaultTableModel(data,titre));
        } 
        catch (SQLException e) {
            System.out.println("Erreur de remplissage : " + e.getMessage());
        }
    }
public void Afficher1 (JTable grille, String txt) throws SQLException{
        try {
            String requete = "SELECT * from stagiaire WHERE NOMSTAGIAIRE = '"+txt+"'";
            int c = 0;
            st = bdd.con.createStatement();
             rs = st.executeQuery(requete);
            while(rs.next())
            {
                    c++;
            }
            Object data[][] = new Object[c][11];
            String titre [] = {"MATRICULE", "NOM", "POSTNOM", "PRENOM", "SEXE", "ETABLISSEMENT","SPECIALITE", "TYPESTAGE", "TELEPHONE", "DATEDEBUT", "DATEFIN"};
            rs = st.executeQuery(requete);
            int i =0;
            while (rs.next()){
                data[i][0]=rs.getString(1);
                data[i][1]=rs.getString(2);
                data[i][2]=rs.getString(3);
                data[i][3]=rs.getString(4);
                data[i][4]=rs.getString(5);
                data[i][5]=rs.getString(6);
                data[i][7]=rs.getString(7);
                data[i][8]=rs.getString(8);
                data[i][9]=rs.getString(9);
                data[i][10]=rs.getString(10);
                data[i][6]=rs.getString(11);
                i++;
            }
            grille.setModel(new DefaultTableModel(data,titre));
        } 
        catch (Exception e) {
            System.out.println("Erreur de remplissage : " + e.getMessage());
        }
        
    }
public void RemplireStag(JComboBox cmb) throws SQLException{
    String req = "SELECT * FROM v_stag";
    st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        cmb.removeAllItems();
        while (rs.next()) {
            cmb.addItem(rs.getString("Noms"));
        }
        cmb.setSelectedIndex(-1);
}
 public String MatricuStag(String nom) throws SQLException{
        String req = "Select IDSTAGIAIRE from v_stag where Noms = '"+nom+"'";
        st = bdd.con.createStatement();
        rs = st.executeQuery(req);
        while (rs.next()) {
            return rs.getString(1);
        }
        return null;
    }
}
