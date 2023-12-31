/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bulletin.UI;

import Bulletin.persistence.infoCondamnation.InfoConserned;
import Bulletin.print.PrinterService;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 *
 * @author dazai
 */
public class InfoPersonne extends javax.swing.JFrame {

    /**
     * Creates new form InfoPersonne
     */
    private InfoConserned ic;
    public InfoPersonne() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private static String formatDate(String date, boolean setLong) {
        Pattern pattern = Pattern.compile("[ -]");
        String[] format = pattern.split(date);
        String jour = format[2];
        String mois = format[1];
        String annee = format[0];
        if (setLong) {
            switch (format[1]) {
                case "01":
                    mois = "Janvier";
                    break;
                case "02":
                    mois = "Fevrier";
                    break;
                case "03":
                    mois = "Mars";
                    break;
                case "04":
                    mois = "Avril";
                    break;
                case "05":
                    mois = "Mai";
                    break;
                case "06":
                    mois = "Juin";
                    break;
                case "07":
                    mois = "Juillet";
                    break;
                case "08":
                    mois = "A�ut";
                    break;
                case "09":
                    mois = "Septembre";
                    break;
                case "10":
                    mois = "Octobre";
                    break;
                case "11":
                    mois = "Novembre";
                    break;
                case "12":
                    mois = "Decembre";
                    break;
            }
        }
        return jour + " " + mois + " " + annee;
    }
    public InfoPersonne(InfoConserned infoConserned){
        this.ic = infoConserned;
        initComponents();
        setLocationRelativeTo(null);
        labelTitre.setText("Informations sur "+infoConserned.getNom()+" "+infoConserned.getPrenoms());
        identificationPersonne.setText(infoConserned.getNom()+" "+infoConserned.getPrenoms());
        if(infoConserned.getSexe().equals("Masculin")){
            infoDateNaissance.setText("Né le");
            infoPere.setText("Fils de");
        }else {
            infoDateNaissance.setText("Née le");
            infoPere.setText("Fille de");
        }
        labelDateNaissance.setText(formatDate(infoConserned.getDateNaissance().toString(),true));
        labelLieuNaissance.setText(infoConserned.getLieuNaissance());
        labelPere.setText(infoConserned.getPere());
        labelMere.setText(infoConserned.getMere());
        labelSituatioFamiliale.setText(infoConserned.getSituationFamiliale());
        labelDomicile.setText(infoConserned.getDomicile());
        labelDateact.setText(formatDate(infoConserned.getDateActeNaissance().toString(),true));
        labelNumeroact.setText(String.valueOf(infoConserned.getActeNaissance()));
        if (infoConserned.getCondamnations().isEmpty()){
            labelCondamnations.setText("Aucune condamnation");
        }else {
            labelCondamnations.setText("Nombre de condamnations : " + String.valueOf(infoConserned.getCondamnations().size()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitre = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        identificationPersonne = new javax.swing.JLabel();
        infoDateNaissance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelLieuNaissance = new javax.swing.JLabel();
        labelDateNaissance = new javax.swing.JLabel();
        infoPere = new javax.swing.JLabel();
        labelPere = new javax.swing.JLabel();
        infoMere = new javax.swing.JLabel();
        labelMere = new javax.swing.JLabel();
        situationFamiliale = new javax.swing.JLabel();
        labelSituatioFamiliale = new javax.swing.JLabel();
        domicile = new javax.swing.JLabel();
        labelDomicile = new javax.swing.JLabel();
        labelCondamnations = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelNumeroact = new javax.swing.JLabel();
        labelDateact = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        printInfos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTitre.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        labelTitre.setText("Informations sur ");

        identificationPersonne.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        identificationPersonne.setText("Nom et Prenom(s) du concerné(e)");

        infoDateNaissance.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        infoDateNaissance.setText("Né(e) le");

        jLabel3.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        jLabel3.setText("à");

        labelLieuNaissance.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelLieuNaissance.setText("Antananarivo");

        labelDateNaissance.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelDateNaissance.setText("01 Janvier 2000");

        infoPere.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        infoPere.setText("Fils/fille de");

        labelPere.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelPere.setText("JEAN Dupont");

        infoMere.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        infoMere.setText("Et de");

        labelMere.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelMere.setText("Jeanne Marie");

        situationFamiliale.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        situationFamiliale.setText("Situation familiale : ");

        labelSituatioFamiliale.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelSituatioFamiliale.setText("Célibataire");

        domicile.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        domicile.setText("Résidant à");

        labelDomicile.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelDomicile.setText("Antananarivo");

        labelCondamnations.setFont(new java.awt.Font("Fira Sans Light", 3, 12)); // NOI18N
        labelCondamnations.setText("Condamnations : ");

        jLabel16.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        jLabel16.setText("Acte de naissance Numéro");

        labelNumeroact.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelNumeroact.setText("0004");

        labelDateact.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        labelDateact.setText("O1 janvier 2003");

        jLabel19.setFont(new java.awt.Font("Fira Sans Light", 1, 14)); // NOI18N
        jLabel19.setText("Fait le");

        printInfos.setFont(new java.awt.Font("Fira Sans Light", 2, 14)); // NOI18N
        printInfos.setText("Imprimer les informations");
        printInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    printInfosActionPerformed(evt);
                } catch (Exception e) {
                    try {
                        throw new RuntimeException(e);
                    } catch (RuntimeException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(infoMere)
                                .addGap(22, 22, 22)
                                .addComponent(labelMere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(situationFamiliale)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelSituatioFamiliale))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(domicile)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelDomicile, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(identificationPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(infoDateNaissance)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelDateNaissance)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(labelLieuNaissance))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(infoPere)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelPere, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(labelCondamnations, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(labelNumeroact)
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(labelDateact))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(printInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(identificationPersonne)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoDateNaissance)
                    .addComponent(labelDateNaissance)
                    .addComponent(labelLieuNaissance)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoPere, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPere, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoMere, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMere, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(situationFamiliale, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSituatioFamiliale, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domicile, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDomicile, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(labelNumeroact)
                    .addComponent(labelDateact)
                    .addComponent(jLabel19))
                .addGap(20, 20, 20)
                .addComponent(labelCondamnations)
                .addGap(33, 33, 33)
                .addComponent(printInfos)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(labelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printInfosActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_printInfosActionPerformed
        boolean printed = PrinterService.Print(ic);
        if(printed){
            JOptionPane.showMessageDialog(null,"Impression terminée avec succès");
        }else{
          JOptionPane.showMessageDialog(null,"Impression annulée");
        }

    }//GEN-LAST:event_printInfosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoPersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoPersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoPersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoPersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoPersonne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel domicile;
    private javax.swing.JLabel identificationPersonne;
    private javax.swing.JLabel infoDateNaissance;
    private javax.swing.JLabel infoMere;
    private javax.swing.JLabel infoPere;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCondamnations;
    private javax.swing.JLabel labelDateNaissance;
    private javax.swing.JLabel labelDateact;
    private javax.swing.JLabel labelDomicile;
    private javax.swing.JLabel labelLieuNaissance;
    private javax.swing.JLabel labelMere;
    private javax.swing.JLabel labelNumeroact;
    private javax.swing.JLabel labelPere;
    private javax.swing.JLabel labelSituatioFamiliale;
    private javax.swing.JLabel labelTitre;
    private javax.swing.JButton printInfos;
    private javax.swing.JLabel situationFamiliale;
    // End of variables declaration//GEN-END:variables
}
