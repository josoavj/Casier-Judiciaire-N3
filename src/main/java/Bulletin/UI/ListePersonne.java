package Bulletin.UI;


import Bulletin.persistence.infoCondamnation.InfoConserned;
import Bulletin.persistence.infoCondamnation.InfoConsernedService;
import Bulletin.print.PrinterService;
import jakarta.persistence.Query;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
// import net.proteanit.sql.DbUtils;

public class ListePersonne extends javax.swing.JFrame {
 InfoConsernedService infoConsernedService = InfoConsernedService.getInstance();
 List<InfoConserned> infoConsernedList = new ArrayList<>();
 private static ListePersonne instance = null;

    public static ListePersonne getInstance() {
        if(instance == null){
            instance = new ListePersonne();
        }
        return instance;
    }

    public ListePersonne() {
        initComponents();
        infoConsernedList=infoConsernedService.getConsernedList();
        Get_Data();
        setLocationRelativeTo(null);
    }
 public void Get_Data(){
            if (infoConsernedList == null){
                JOptionPane.showMessageDialog(null,"La base de donnée est vide");
                return;
            }
           Object[][] data = new Object[infoConsernedList.size()][8];
           int i=0;
           AjoutPersonne.listCondamnationAdded.clear();
           AjoutPersonne.listeDeCondamnations.clear();
           AjoutPersonne.listCondamnationWillRemoved.clear();
           for (InfoConserned infoConserned : infoConsernedList){
               data[i][0] = infoConserned.getActeNaissance();
               data[i][1] = infoConserned.getNom();
               data[i][2] = infoConserned.getPrenoms();
               data[i][3] = infoConserned.getPere();
               data[i][4] = infoConserned.getMere();
               Pattern pattern = Pattern.compile("[ -]");
               String[] format = pattern.split(infoConserned.getDateNaissance().toString());
               String jour = format[2];
               String mois = format[1];
               String annee = format[0];
               data[i][5] = jour+"-"+mois+"-"+annee;
               data[i][6] = infoConserned.getSexe();
               data[i][7] = infoConserned.getNationalite();
               i++;
           }
           String[] columnNames = new String[8];
           columnNames[0] = "Acte de Naissance";
           columnNames[1] = "Nom";
           columnNames[2] = "Prénom";
           columnNames[3] = "Père";
           columnNames[4] = "Mère";
           columnNames[5] = "Date de Naissance";
           columnNames[6] = "Sexe";
           columnNames[7] = "Nationalité";
     DefaultTableModel tableModel = new DefaultTableModel(data,columnNames);
           try{
         tableListPerson.setModel(tableModel);
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
           printPerson.setEnabled(false);
           deletePerson.setEnabled(false);
           modifPerson.setEnabled(false);
           getPersonInfo.setEnabled(false);
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
        tableListPerson = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        modifPanel = new javax.swing.JPanel();
        addPerson = new javax.swing.JButton();
        deletePerson = new javax.swing.JButton();
        modifPerson = new javax.swing.JButton();
        printPerson = new javax.swing.JButton();
        getPersonInfo = new javax.swing.JButton();
        filterPanel = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        cmbFilter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Registration Record");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tableListPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Acte de Naissance", "Nom", "Prénom", "Père", "Mère", "Date de Naissance", "Sexe", "Nationalité"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListPerson.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableListPerson.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableListPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListPerson);

        modifPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifier"));

        addPerson.setText("Ajouter");
        addPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonActionPerformed(evt);
            }
        });

        deletePerson.setText("Supprimer");
        deletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonActionPerformed(evt);
            }
        });

        modifPerson.setText("Modifier");
        modifPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        printPerson.setText("Imprimer");
        printPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    printPersonActionPerformed(evt);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        getPersonInfo.setText("Informations");
        getPersonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPersonInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifPanelLayout = new javax.swing.GroupLayout(modifPanel);
        modifPanel.setLayout(modifPanelLayout);
        modifPanelLayout.setHorizontalGroup(
            modifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(modifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getPersonInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        modifPanelLayout.setVerticalGroup(
            modifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletePerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getPersonInfo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        filterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtres"));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        cmbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout", "Avec condamnations", "Sans condamnation" }));
        cmbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch)
                    .addComponent(cmbFilter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        filterPanelLayout.setVerticalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(modifPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(filterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(modifPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(624, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1638, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableListPersonMouseClicked(java.awt.event.MouseEvent evt) {                                             
    //private void tableListPersonMouseClicked(java.awt.event.MouseEvent evt) {                                         
            printPerson.setEnabled(true);
            deletePerson.setEnabled(true);
            modifPerson.setEnabled(true);
            getPersonInfo.setEnabled(true);

        if(evt.getClickCount()==2){
      try{
            infoConsernedService = InfoConsernedService.getInstance();
            int row= tableListPerson.getSelectedRow();
            String table_click= tableListPerson.getModel().getValueAt(row, 0).toString();
            int acteNaissanceNum = Integer.parseInt(table_click);
            InfoConserned ic = infoConsernedService.getInfoConsernedByAN(acteNaissanceNum);
            this.setVisible(false);
            AjoutPersonne frm = new AjoutPersonne(ic);
            frm.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }                              
        }  
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void addPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonActionPerformed
    AjoutPersonne frm = new AjoutPersonne();
    frm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_addPersonActionPerformed

    @Override
    public void dispose() {
        super.dispose();
        instance = null;
    }

    private void deletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonActionPerformed
        int row= tableListPerson.getSelectedRow();
        String table_click= tableListPerson.getModel().getValueAt(row, 0).toString();
        int acteNaissanceNum = Integer.parseInt(table_click);
        InfoConserned ic = infoConsernedService.getInfoConsernedByAN(acteNaissanceNum);
        String message = "voulez vous supprimer "+ic.getNom();
        if(JOptionPane.showConfirmDialog(null,message,"Confirmation",JOptionPane.YES_NO_OPTION)==0) {
            InfoConsernedService.getInstance().removeInfoConserned(ic);
            txtSearch.setText("");
            Get_Data();
        }
    }//GEN-LAST:event_deletePersonActionPerformed

    private void getPersonInfoActionPerformed(java.awt.event.ActionEvent evt) {
        int row= tableListPerson.getSelectedRow();
        String table_click= tableListPerson.getModel().getValueAt(row, 0).toString();
        int acteNaissanceNum = Integer.parseInt(table_click);
        InfoConserned ic = infoConsernedService.getInfoConsernedByAN(acteNaissanceNum);
        InfoPersonne frm = new InfoPersonne(ic);
        frm.setVisible(true);
    }

    private void printPersonActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                            
        int row= tableListPerson.getSelectedRow();
        String table_click= tableListPerson.getModel().getValueAt(row, 0).toString();
        int acteNaissanceNum = Integer.parseInt(table_click);
        InfoConserned ic = infoConsernedService.getInfoConsernedByAN(acteNaissanceNum);
        boolean printed = PrinterService.Print(ic);
        if(printed){
            JOptionPane.showMessageDialog(null,"impression terminée avec succès");
        }else{
            JOptionPane.showMessageDialog(null,"Impression annulée");
        }
    }

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        try{
            infoConsernedService = InfoConsernedService.getInstance();
            int row= tableListPerson.getSelectedRow();
            String table_click= tableListPerson.getModel().getValueAt(row, 0).toString();
            int acteNaissanceNum = Integer.parseInt(table_click);
            InfoConserned ic = infoConsernedService.getInfoConsernedByAN(acteNaissanceNum);
            AjoutPersonne frm = new AjoutPersonne(ic);
            frm.setVisible(true);
            this.dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }

    }//GEN-LAST:event_btnModActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER || evt.getKeyChar()==KeyEvent.VK_BACK_SPACE) {
            List<InfoConserned> searchValues = new ArrayList<>();

            for(InfoConserned ic : infoConsernedList){
                String fullname = ic.getNom() + " " + ic.getPrenoms();
                if(ic.getNom().toLowerCase().contains(txtSearch.getText().toLowerCase()) ||
                        ic.getPrenoms().toLowerCase().contains(txtSearch.getText().toLowerCase())
                || fullname.toLowerCase().contains(txtSearch.getText().toLowerCase())){
                    searchValues.add(ic);
                }
            }
            if(txtSearch.getText().isEmpty()){
                List<InfoConserned> filteredList = new ArrayList();
                if(cmbFilter.getSelectedIndex() == 0){
                    infoConsernedList = infoConsernedService.getConsernedList();
                }else {
                    for (InfoConserned ic : infoConsernedService.getConsernedList()) {
                        if (cmbFilter.getSelectedIndex() == 1 && !ic.getCondamnationList().isEmpty()) {
                            filteredList.add(ic);
                        }
                        if (cmbFilter.getSelectedIndex() == 2 && ic.getCondamnationList().isEmpty()) {
                            filteredList.add(ic);
                        }
                    }
                    infoConsernedList = filteredList;
                }
                Get_Data();
                return;
            }
            infoConsernedList =  searchValues;
            Get_Data();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void cmbFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFilterActionPerformed
        // TODO add your handling code here:
        List<InfoConserned> filteredList = new ArrayList();
        if(cmbFilter.getSelectedIndex() == 0){
            infoConsernedList = infoConsernedService.getConsernedList();
        }else {
            for (InfoConserned ic : infoConsernedService.getConsernedList()) {
                if (cmbFilter.getSelectedIndex() == 1 && !ic.getCondamnationList().isEmpty()) {
                    filteredList.add(ic);
                }
                if (cmbFilter.getSelectedIndex() == 2 && ic.getCondamnationList().isEmpty()) {
                    filteredList.add(ic);
                }
            }
            infoConsernedList = filteredList;
        }
        Get_Data();
    }//GEN-LAST:event_cmbFilterActionPerformed

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
            java.util.logging.Logger.getLogger(ListePersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListePersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListePersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListePersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListePersonne().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPerson;
    private javax.swing.JComboBox<String> cmbFilter;
    private javax.swing.JButton deletePerson;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JButton getPersonInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel modifPanel;
    private javax.swing.JButton modifPerson;
    private javax.swing.JButton printPerson;
    private javax.swing.JTable tableListPerson;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
