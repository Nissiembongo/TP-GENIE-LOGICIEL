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
public class pnlEncadreur extends javax.swing.JPanel {

    /**
     * Creates new form pnlEncadreur
     */
    Fonction fonct = new Fonction();
    Encadreur enc = new Encadreur();
    public pnlEncadreur() throws SQLException {
        initComponents();
        fonct.RemplireFonct(cmbFonction);
        txtMatAg.setText("AG00"+(enc.compte()+1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomAg = new javax.swing.JTextField();
        cmbFonction = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtMatAg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrenomAg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbSexeAg = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));
        add(txtNomAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 160, 32));

        cmbFonction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbFonction, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricul");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        txtMatAg.setEditable(false);
        add(txtMatAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 32));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prenom");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));
        add(txtPrenomAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 32));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fonction");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        cmbSexeAg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "M", "F" }));
        add(cmbSexeAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexe");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\GestionStagiaire\\icon\\icons8_save_16px_1.png")); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int idfon = 0;
        try {
            idfon = fonct.getIdFonct( (String) cmbFonction.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(pnlEncadreur.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            boolean Ajout = enc.Ajout(txtMatAg.getText(), idfon, txtNomAg.getText(), txtPrenomAg.getText(), (String) cmbSexeAg.getSelectedItem());
            
        } catch (SQLException ex) {
            Logger.getLogger(pnlEncadreur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFonction;
    private javax.swing.JComboBox<String> cmbSexeAg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtMatAg;
    private javax.swing.JTextField txtNomAg;
    private javax.swing.JTextField txtPrenomAg;
    // End of variables declaration//GEN-END:variables
}
