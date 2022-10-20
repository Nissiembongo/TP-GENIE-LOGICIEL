/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulaire;

/**
 *
 * @author Nissi
 */
import FClasse.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class formPrestation extends javax.swing.JPanel {

    /**
     * Creates new form formPrestation
     */
    String matSta;
    int idServ;
    int cpt = 0;
    String MatAG;
    Stagiaire stag = new Stagiaire();
    Service serv = new Service();
    Encadreur enc = new  Encadreur();
    Prestation prest = new Prestation();
    public formPrestation() throws SQLException {
        initComponents();
        stag.RemplireStag(cmbStag);
        serv.RemplireErv(cmbServ);
        enc.RemplireEnc(cmbEnc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCote = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtHeurArr = new javax.swing.JTextField();
        cmbEnc = new javax.swing.JComboBox<>();
        cmbStag = new javax.swing.JComboBox<>();
        cmbServ = new javax.swing.JComboBox<>();
        txtHerDep = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttheme = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblajout = new javax.swing.JLabel();
        pnlEnc = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtCote, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 290, 40));
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 260, 30));
        add(txtHeurArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 290, 30));

        cmbEnc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbEnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 260, 30));

        cmbStag.setEditable(true);
        cmbStag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStagItemStateChanged(evt);
            }
        });
        add(cmbStag, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 290, 30));

        cmbServ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 290, 30));
        add(txtHerDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 260, 30));

        txttheme.setColumns(20);
        txttheme.setRows(5);
        jScrollPane1.setViewportView(txttheme);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 260, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Service");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Encadreur");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Heure Du Début");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 213, -1, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Heure De la Fin");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 213, -1, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cote Du Jour");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 273, -1, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Theme Du jour");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 273, -1, 20));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_checkmark_26px_1.png")); // NOI18N
        jButton1.setText("Valider");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 160, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_clipboard_50px.png")); // NOI18N
        jLabel9.setText("Prestation du jour");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Stagiaire");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("______________________________________________________________________________________________");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblajout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblajout.setForeground(new java.awt.Color(0, 51, 66));
        lblajout.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_plus_48px.png")); // NOI18N
        lblajout.setText("Nouveau Encadreur");
        lblajout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblajoutMouseClicked(evt);
            }
        });
        jPanel1.add(lblajout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 40));

        pnlEnc.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.add(pnlEnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 340, 340));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 340, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbStagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStagItemStateChanged
        /*try {
            // TODO add your handling code here:
            this.matSta = stag.MatricuStag((String) cmbStag.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(formPrestation.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_cmbStagItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            this.matSta = stag.MatricuStag((String) cmbStag.getSelectedItem());
            this.idServ = serv.getIdServ((String) cmbServ.getSelectedItem());
            this.MatAG = enc.getMatAg((String) cmbEnc.getSelectedItem());
            boolean et = prest.Ajout(idServ, matSta, txtHeurArr.getText(), txtHerDep.getText(), txtDate.getText(), MatAG, Integer.parseInt(txtCote.getText()), txttheme.getText());
            if (et==true){
                JOptionPane.showMessageDialog(null, matSta+" Presté");
            }
            else{
                JOptionPane.showMessageDialog(null, matSta+" Erreur Prestation");
            }
        } catch (SQLException ex) {
            Logger.getLogger(formPrestation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblajoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblajoutMouseClicked
        // TODO add your handling code here:
         
        cpt +=1;
        if(cpt%2 == 0){
        pnlEnc.setViewportView(null);
        lblajout.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_plus_48px.png"));
        }
        else{
        
            try {
                lblajout.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_minus_48px_2.png"));
                pnlEnc.setViewportView(new pnlEncadreur());
            } catch (SQLException ex) {
                Logger.getLogger(formPrestation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblajoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbEnc;
    private javax.swing.JComboBox<String> cmbServ;
    private javax.swing.JComboBox<String> cmbStag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblajout;
    private javax.swing.JScrollPane pnlEnc;
    private javax.swing.JTextField txtCote;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHerDep;
    private javax.swing.JTextField txtHeurArr;
    private javax.swing.JTextArea txttheme;
    // End of variables declaration//GEN-END:variables
}
