/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login_PROMA.java
 *
 * Created on Jan 3, 2012, 2:47:27 PM
 */
/**
 *
 * @author 9589693153
 */
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;


public class Login_PROMA extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs = null;
PreparedStatement pst=null;
    /** Creates new form Login_PROMA */
    public Login_PROMA() {
        initComponents();
        CurrentDate();
    }
public void CurrentDate(){
  
  Calendar cal = new GregorianCalendar();
  int month = cal.get(Calendar.MONTH);
  int year = cal.get(Calendar.YEAR);
  int day = cal.get(Calendar.DAY_OF_MONTH);
  Lbl_Date.setText("Current date : "   + day + "/" + (month + 1) + "/" + year);
  System.out.println("Current date : " 
  + day + "/" + (month + 1) + "/" + year);
  }
public void close() {
WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_userid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCombo_division = new javax.swing.JComboBox();
        cmd_login = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Lbl_Date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Page  - ProMA");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(204, 255, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel1.setText("UserID");

        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Sign in");

        jLabel5.setText("Post");

        jCombo_division.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select User Level", "Admin", "Manager", "Engineer" }));

        cmd_login.setText("Login");
        cmd_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(53, 53, 53)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_userid, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jCombo_division, 0, 115, Short.MAX_VALUE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(cmd_login)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCombo_division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_login)
                .addGap(26, 26, 26))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginn1.png"))); // NOI18N

        Lbl_Date.setFont(new java.awt.Font("Arial", 1, 14));
        Lbl_Date.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         conn=ConnectionPROMA .ConnecrDb();
    }//GEN-LAST:event_formWindowOpened

    private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_loginActionPerformed
           
        
         String sql="select * from Employee_data where userid =? and password =?  ";
    try{
        int count=0;
    pst =conn.prepareStatement(sql);
    pst.setString(1, txt_userid.getText());
    pst.setString(2, txt_pass.getText());
   
    rs=pst.executeQuery();
    while(rs.next()){
    count=count+1;
    }
     String division= (jCombo_division.getSelectedItem().toString());

         
                    if(division=="Admin") {
    if(count==1){
    JOptionPane.showMessageDialog(null, "Username and password correct");
    Admin_JFrame s = new Admin_JFrame();
    s.setVisible(true);
   close();
    
    }
    else if(count>1){
    JOptionPane.showMessageDialog(null, "Duplicate user and password Access denied");
   // Admin_JFrame s = new Admin_JFrame();
   // s.setVisible(true);
    
    }
    else
      JOptionPane.showMessageDialog(null, "Username and password not correct");
    
                    }
                     else   if(division=="Manager"||division=="Engineer") {

                         
               if(count==1){
    JOptionPane.showMessageDialog(null, "Username and password correct");
    User_JFrame s = new User_JFrame();
    s.setVisible(true);
  // close();
    
    }
    else if(count>1){
    JOptionPane.showMessageDialog(null, "Duplicate user and password Access denied");
   // Admin_JFrame s = new Admin_JFrame();
   // s.setVisible(true);
    
    }
    else
      JOptionPane.showMessageDialog(null, "Username and password not correct");
                
                         
                     }
    }catch(Exception e)
    {
        e.printStackTrace();   
        JOptionPane.showMessageDialog(null, e);

    }
        
    }//GEN-LAST:event_cmd_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login_PROMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_PROMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_PROMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_PROMA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login_PROMA().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Date;
    private javax.swing.JButton cmd_login;
    private javax.swing.JComboBox jCombo_division;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_userid;
    // End of variables declaration//GEN-END:variables
}
