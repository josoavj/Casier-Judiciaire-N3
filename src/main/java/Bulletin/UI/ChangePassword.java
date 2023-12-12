package Bulletin.UI;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

// Pour changer le mot de passe Administrateur
public class ChangePassword extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomUser = new javax.swing.JLabel();
        OldMdp = new javax.swing.JLabel();
        NewMdp = new javax.swing.JLabel();
        MdpConf = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        btnChanger = new javax.swing.JButton();
        MdpOld = new javax.swing.JPasswordField();
        MdpNew = new javax.swing.JPasswordField();
        ConfMdp = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NomUser.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        NomUser.setText("Utilisateur");

        OldMdp.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        OldMdp.setText("Ancien mot de passe");

        NewMdp.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        NewMdp.setText("Nouveau mot de passe");

        MdpConf.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        MdpConf.setText("Confirmer le mot de passe");

        btnChanger.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        btnChanger.setText("Changer le mot de passe");
        btnChanger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangerMouseClicked(evt);
            }
        });
        btnChanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangerActionPerformed(evt);
            }
        });

        ConfMdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConfMdpKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setText("Changement de mot de passe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NewMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(MdpNew, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(MdpOld)))
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomUser)
                                    .addComponent(OldMdp))
                                .addGap(65, 65, 65)
                                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MdpConf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(ConfMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnChanger)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MdpOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewMdp)
                    .addComponent(MdpNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MdpConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnChanger, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ConfMdp, MdpNew, MdpOld, UserName});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangerMouseClicked
       
    }//GEN-LAST:event_btnChangerMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void btnChangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangerActionPerformed
        try{
         String Newpass=String.valueOf(MdpNew.getPassword());
         String ConfPass=String.valueOf(ConfMdp.getPassword());
        String OldPass=String.valueOf(MdpOld.getPassword());
        String uName=UserName.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Entrer votre nom d'utilisateur",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Veuillez entrer votre ancien mot de passe",
                                          "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Veuillez entrer votre nouveau mot de passe",
                                          "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Veuillez confirmer votre mot de passe",
                                          "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               else if (Newpass.length()< 5) {
               
                JOptionPane.showMessageDialog(this,
                                         "Le mot de passe doit contenir au moins 5 caractères",
                                         "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this,
                                         "Mot de passe identique..Veuillez reecrire votre mot de passe","Erreur", JOptionPane.ERROR_MESSAGE);
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,
                                         "Le nouveau mot de passe ne se corresponde pas, réessayez",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
       
      con=Connect.ConnectDB();
      String sql= "select Username,User_Password from users where Username='" + UserName.getText() + "' and User_Password= '" + MdpOld.getText() + "'";
      pst=con.prepareStatement(sql);
      rs= pst.executeQuery();
      while(rs.next())
        {
            String usrname = rs.getString("username").trim();
            String passwd = rs.getString("user_password").trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))
            {
                con=Connect.ConnectDB();
                 String sql1= "update users set User_password= '" + Newpass + "' where Username= '" + uName + "' and User_password = '" + OldPass + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1.toString());
                 stmt.close();
                 JOptionPane.showMessageDialog(this,"Mot de passe changée");
                 this.dispose();
                 return;
              }
            else
            {
             JOptionPane.showMessageDialog(this,"Utilisateur ou mot de passe erroné","Erreur", JOptionPane.ERROR_MESSAGE);   
             UserName.setText("");
             MdpOld.setText("");
             MdpNew.setText("");
             ConfMdp.setText("");
             return;
            }
        }    
        }catch(SQLException | HeadlessException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
    }//GEN-LAST:event_btnChangerActionPerformed

    private void ConfMdpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfMdpKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
              try{
         String Newpass=String.valueOf(MdpNew.getPassword());
         String ConfPass=String.valueOf(ConfMdp.getPassword());
        String OldPass=String.valueOf(MdpOld.getPassword());
        String uName=UserName.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Veuillez entrer votre nom d'utilisateur",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Veuillez entrer votre ancien mot de passe",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Veuillez entrer votre nouveau mot de passe",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Veuillez confirmer votre mot de passe",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               else if (Newpass.length()< 5) {
               
                JOptionPane.showMessageDialog(this,
                                         "The New Password Should be of Atleast 5 Characters",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this,
                                         "Password is same..Re-enter new password","Error", JOptionPane.ERROR_MESSAGE);
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,
                                         "New Password doesn't match with Confirmed Password",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
       
      con=Connect.ConnectDB();
      String sql= "select Username,User_Password from users where Username='" + UserName.getText() + "' and User_Password= '" + MdpOld.getText() + "'";
      pst=con.prepareStatement(sql);
      rs= pst.executeQuery();
      while(rs.next())
        {
            String usrname = rs.getString("username").trim();
            String passwd = rs.getString("user_password").trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))
            {
                con=Connect.ConnectDB();
                 String sql1= "update users set User_password= '" + Newpass + "' where Username= '" + uName + "' and User_password = '" + OldPass + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1.toString());
                 stmt.close();
                 JOptionPane.showMessageDialog(this,"Password Successfully Changed");
                 this.dispose();
                 return;
              }
            else
            {
             JOptionPane.showMessageDialog(this,"invalid user name or password","Error", JOptionPane.ERROR_MESSAGE);   
             UserName.setText("");
             MdpOld.setText("");
             MdpNew.setText("");
             ConfMdp.setText("");
             return;
            }
        }    
        }catch(SQLException | HeadlessException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
            
        }
    }//GEN-LAST:event_ConfMdpKeyPressed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfMdp;
    private javax.swing.JLabel MdpConf;
    private javax.swing.JPasswordField MdpNew;
    private javax.swing.JPasswordField MdpOld;
    private javax.swing.JLabel NewMdp;
    private javax.swing.JLabel NomUser;
    private javax.swing.JLabel OldMdp;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton btnChanger;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
