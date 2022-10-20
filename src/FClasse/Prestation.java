/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Prestation {
    
    CBase bdd = new CBase();
    Statement st;
    ResultSet rs;
    
    public boolean Ajout(int idserv, String matriStag,String HeurArr, String HeurDep, String DatePr,String matriAg, int cote, String theme) throws SQLException{
        String req ="INSERT INTO prestation(`IDSERV`, `IDSTAGIAIRE`, `HEURARRIV`, `HEURDEP`, `DATEPREST`, `Matricul`, `Cote`, `theme`) VALUES('"+idserv+"','"+matriStag+"', '"+HeurArr+"', '"+HeurDep+"', '"+DatePr+"', '"+matriAg+"', '"+cote+"', '"+theme+"')";
        st = bdd.con.createStatement();
        boolean etat = st.execute(req);
        return etat;
    }
}
