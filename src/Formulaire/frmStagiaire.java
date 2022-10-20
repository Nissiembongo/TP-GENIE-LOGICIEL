/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulaire;
import FClasse.Stagiaire;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nissi
 */
public class frmStagiaire extends javax.swing.JPanel {

    /**
     * Creates new form frmStagiaire
     */
    Stagiaire stag =  new Stagiaire();
    public frmStagiaire() throws SQLException {
        initComponents();
        stag.Afficher(grilleSat);
        lblspe.setVisible(false);
        txtSpecialite.setVisible(false);
         txtID.setText("STAG/0"+ (stag.compte()+1));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grilleSat = new javax.swing.JTable();
        txtDATFIN = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtNOM = new javax.swing.JTextField();
        txtPOSTNOM = new javax.swing.JTextField();
        txtPRENOM = new javax.swing.JTextField();
        txtDATEDEB = new javax.swing.JTextField();
        cmbTYPESTAGE = new javax.swing.JComboBox<>();
        cmbSEXE = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblspe = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtUNIV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPHONE = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSpecialite = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 66, 91));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grilleSat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        grilleSat.setForeground(new java.awt.Color(0, 51, 51));
        grilleSat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOM", "POSTNOM", "PRENOM", "SEXE", "DATE DEPUT", "DATE FIN", "UNIVERSITE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilleSat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grilleSatMouseClicked(evt);
            }
        });
        grilleSat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grilleSatKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(grilleSat);
        if (grilleSat.getColumnModel().getColumnCount() > 0) {
            grilleSat.getColumnModel().getColumn(0).setResizable(false);
            grilleSat.getColumnModel().getColumn(1).setMinWidth(25);
            grilleSat.getColumnModel().getColumn(2).setResizable(false);
            grilleSat.getColumnModel().getColumn(3).setResizable(false);
            grilleSat.getColumnModel().getColumn(4).setResizable(false);
            grilleSat.getColumnModel().getColumn(5).setResizable(false);
            grilleSat.getColumnModel().getColumn(6).setResizable(false);
            grilleSat.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 940, 260));

        txtDATFIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDATFINActionPerformed(evt);
            }
        });
        add(txtDATFIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, 30));

        txtID.setEditable(false);
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 30));
        add(txtNOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, 30));
        add(txtPOSTNOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 30));
        add(txtPRENOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 170, 30));
        add(txtDATEDEB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, 30));

        cmbTYPESTAGE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Stage Medecine", "Stage Infirmiere" }));
        cmbTYPESTAGE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTYPESTAGEItemStateChanged(evt);
            }
        });
        add(cmbTYPESTAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 170, 30));

        cmbSEXE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "M", "F" }));
        add(cmbSEXE, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 180, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATE FIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOM");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("POSTNOM");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEXE");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRENOM");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATE DEBUT");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        lblspe.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblspe.setForeground(new java.awt.Color(255, 255, 255));
        lblspe.setText("SPECIALITE");
        add(lblspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 66, 91));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_delete_bin_30px.png")); // NOI18N
        jButton1.setText("Supprimer");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 140, 40));

        jButton2.setBackground(new java.awt.Color(0, 66, 91));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_save_16px_1.png")); // NOI18N
        jButton2.setText("Enrégistrer");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 220, 40));

        jButton3.setBackground(new java.awt.Color(0, 66, 91));
        jButton3.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_edit_property_26px.png")); // NOI18N
        jButton3.setText("Modifier");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 140, 30));
        add(txtUNIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ETABLISSEMENT");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        txtPHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPHONEActionPerformed(evt);
            }
        });
        add(txtPHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 180, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TELEPHONE");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));
        add(txtSpecialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 170, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TYPE DE STAGE");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\dd.png")); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDATFINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDATFINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDATFINActionPerformed

    private void txtPHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPHONEActionPerformed
//Insertion
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        boolean aj;
        try {
           if(txtNOM.getText().equals("")||txtPOSTNOM.getText().equals("")||txtDATEDEB.getText().equals("")|| txtDATFIN.getText().equals("")|| txtPHONE.getText().equals("")|| "".equals(txtUNIV.getText()) || "".equals(txtPRENOM.getText())){
               JOptionPane.showMessageDialog(null, "Veillez remplire tous les champs");
           }
           else{
            aj = stag.Ajout(txtID.getText(), txtNOM.getText(), txtPOSTNOM.getText(), txtPRENOM.getText(), (String) cmbSEXE.getSelectedItem(), txtUNIV.getText(), txtDATEDEB.getText(), txtDATFIN.getText(), txtPHONE.getText(), cmbTYPESTAGE.getSelectedItem().toString(), txtSpecialite.getText());
            if (aj==true){
                JOptionPane.showMessageDialog(null, "Erreur");
            }
            else{
                stag.Afficher(grilleSat);
                grilleSat.repaint();
                JOptionPane.showMessageDialog(null, "Enrégistrement effectué avec succès");
                txtNOM.setText("");
                txtPOSTNOM.setText("");
                txtPRENOM.setText("");
                txtDATEDEB.setText("");
                txtDATFIN.setText("");
                txtSpecialite.setText("");
                txtPHONE.setText("");
                txtUNIV.setText("");
                txtID.setText("STAG/0"+ (stag.compte()+1));
                cmbSEXE.setSelectedItem(-1);
                cmbTYPESTAGE.setSelectedItem(-1);
            }
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Le Stagiaire "+ txtID.getText()+" Existe déjà");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void grilleSatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grilleSatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grilleSatKeyPressed
//Recuperation Jtable
    private void grilleSatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grilleSatMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel) grilleSat.getModel();
        int ligne = grilleSat.getSelectedRow();
        txtID.setText((String) tb.getValueAt(ligne, 0));
        txtNOM.setText((String) tb.getValueAt(ligne, 1));
        txtPOSTNOM.setText((String) tb.getValueAt(ligne, 2));
        txtPRENOM.setText((String) tb.getValueAt(ligne, 3));
        cmbSEXE.setSelectedItem((String) tb.getValueAt(ligne, 4));
        txtUNIV.setText((String) tb.getValueAt(ligne, 5));
        cmbTYPESTAGE.setSelectedItem((String) tb.getValueAt(ligne, 7));
        txtPHONE.setText((String) tb.getValueAt(ligne, 8));
        txtDATEDEB.setText((String) tb.getValueAt(ligne,9));
        txtDATFIN.setText((String) tb.getValueAt(ligne, 10));
        txtSpecialite.setText((String) tb.getValueAt(ligne, 6));
        
       
        
    }//GEN-LAST:event_grilleSatMouseClicked
//MODIFICATION
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean mod;
        try {
            mod = stag.Modifier(txtID.getText(), txtNOM.getText(), txtPOSTNOM.getText(), txtPRENOM.getText(), (String) cmbSEXE.getSelectedItem(), txtUNIV.getText(), txtDATEDEB.getText(), txtDATFIN.getText(), txtPHONE.getText(),cmbTYPESTAGE.getSelectedItem().toString(), txtSpecialite.getText());
            if(mod == true){
                JOptionPane.showMessageDialog(null, "Erreur");                
            }
            else{
                stag.Afficher(grilleSat);
                grilleSat.repaint();
                JOptionPane.showMessageDialog(null, "Modification effectuée avec succès");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
//SUPPRESSION
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean sup;
        try {
             sup = stag.Supprimer(txtID.getText());
             if(sup==false){
                txtNOM.setText("");
                txtPOSTNOM.setText("");
                txtPRENOM.setText("");
                txtDATEDEB.setText("");
                txtDATFIN.setText("");
                txtSpecialite.setText("");
                txtPHONE.setText("");
                txtUNIV.setText("");
                txtID.setText("STAG/0"+ (stag.compte()+1));
                cmbSEXE.setSelectedItem(-1);
                cmbTYPESTAGE.setSelectedItem(-1);
                stag.Afficher(grilleSat);
                grilleSat.repaint();
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmStagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbTYPESTAGEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTYPESTAGEItemStateChanged
        // TODO add your handling code here:
        if(cmbTYPESTAGE.getSelectedItem()=="Stage Medecine"){
            lblspe.setVisible(true);
            txtSpecialite.setVisible(true);
        }
        else{
            txtSpecialite.setText("");
            lblspe.setVisible(false);
            txtSpecialite.setVisible(false);
        }
    }//GEN-LAST:event_cmbTYPESTAGEItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSEXE;
    private javax.swing.JComboBox<String> cmbTYPESTAGE;
    private javax.swing.JTable grilleSat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblspe;
    private javax.swing.JTextField txtDATEDEB;
    private javax.swing.JTextField txtDATFIN;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNOM;
    private javax.swing.JTextField txtPHONE;
    private javax.swing.JTextField txtPOSTNOM;
    private javax.swing.JTextField txtPRENOM;
    private javax.swing.JTextField txtSpecialite;
    private javax.swing.JTextField txtUNIV;
    // End of variables declaration//GEN-END:variables

    
}
