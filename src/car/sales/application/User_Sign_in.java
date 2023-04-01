
package car.sales.application;

import javax.swing.JOptionPane;

public class User_Sign_in extends javax.swing.JFrame {

    public User_Sign_in() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Application_name = new javax.swing.JLabel();
        APP_Add = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        picture = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        User_name = new javax.swing.JLabel();
        Enter_Name = new javax.swing.JTextField();
        User_email = new javax.swing.JLabel();
        Enter_email = new javax.swing.JTextField();
        User_Pass = new javax.swing.JLabel();
        loginbut = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Enter_pass = new javax.swing.JPasswordField();
        Signup_but = new javax.swing.JButton();
        or = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Application_name.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Application_name.setForeground(new java.awt.Color(255, 255, 255));
        Application_name.setText("Car Sales BD");
        jPanel1.add(Application_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        APP_Add.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        APP_Add.setForeground(new java.awt.Color(255, 255, 255));
        APP_Add.setText("Buy a Best Car to the Best Price...");
        jPanel1.add(APP_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, -1));

        picture.setIcon(new javax.swing.ImageIcon("I:\\project\\project_debris2.jpg")); // NOI18N
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 540));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 540));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User_name.setForeground(new java.awt.Color(0, 153, 153));
        User_name.setText("Name");
        jPanel2.add(User_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        Enter_Name.setBackground(new java.awt.Color(204, 204, 204));
        Enter_Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_Name.setForeground(new java.awt.Color(0, 0, 0));
        Enter_Name.setBorder(null);
        Enter_Name.setCaretColor(new java.awt.Color(0, 0, 0));
        Enter_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(Enter_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 300, 20));

        User_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User_email.setForeground(new java.awt.Color(0, 153, 153));
        User_email.setText("Email");
        jPanel2.add(User_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        Enter_email.setBackground(new java.awt.Color(204, 204, 204));
        Enter_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_email.setForeground(new java.awt.Color(0, 0, 0));
        Enter_email.setBorder(null);
        Enter_email.setCaretColor(new java.awt.Color(0, 0, 0));
        Enter_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_emailActionPerformed(evt);
            }
        });
        jPanel2.add(Enter_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 300, 20));

        User_Pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User_Pass.setForeground(new java.awt.Color(0, 153, 153));
        User_Pass.setText("Password");
        jPanel2.add(User_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        loginbut.setBackground(new java.awt.Color(0, 0, 0));
        loginbut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbut.setForeground(new java.awt.Color(0, 153, 153));
        loginbut.setText("Sign in");
        loginbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutActionPerformed(evt);
            }
        });
        jPanel2.add(loginbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 230, 40));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 143, 300, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 300, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 300, 10));

        Enter_pass.setBackground(new java.awt.Color(204, 204, 204));
        Enter_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_pass.setForeground(new java.awt.Color(0, 0, 0));
        Enter_pass.setBorder(null);
        Enter_pass.setCaretColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(Enter_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 300, 20));

        Signup_but.setBackground(new java.awt.Color(0, 0, 0));
        Signup_but.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Signup_but.setForeground(new java.awt.Color(0, 153, 153));
        Signup_but.setText("Sign up");
        Signup_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_butActionPerformed(evt);
            }
        });
        jPanel2.add(Signup_but, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 230, 40));

        or.setBackground(new java.awt.Color(0, 0, 0));
        or.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        or.setForeground(new java.awt.Color(255, 255, 255));
        or.setText("Or");
        jPanel2.add(or, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("I:\\project\\car_meter2.jpg")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 540));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 600, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutActionPerformed
        if(Enter_Name.getText().equals("Yeamin Islam") && Enter_email.getText().equals("emon29249@gmail.com")  && Enter_pass.getText().equals("good")){
           setVisible(false);         
           new Options().setVisible(true);
        }
        else if(Enter_Name.getText().equals("Proshanto") && Enter_email.getText().equals("emon2@gmail.com")  && Enter_pass.getText().equals("good2")){
           setVisible(false);          
           new Options().setVisible(true);
        }
        else if(Enter_Name.getText().equals("Rimon") && Enter_email.getText().equals("emon3@gmail.com")  && Enter_pass.getText().equals("good3")){
           setVisible(false);           
           new Options().setVisible(true);
        }
            else if(Enter_Name.getText().equals("1") && Enter_email.getText().equals("2")  && Enter_pass.getText().equals("3")){
           setVisible(false);           
           new Options().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Incorrect User Name or Password...");
        }
            
           
    }//GEN-LAST:event_loginbutActionPerformed

    private void Enter_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_emailActionPerformed
          
    }//GEN-LAST:event_Enter_emailActionPerformed

    private void Signup_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_butActionPerformed
       setVisible(false);
        new User_Sign_up().setVisible(true);
    }//GEN-LAST:event_Signup_butActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APP_Add;
    private javax.swing.JLabel Application_name;
    private javax.swing.JTextField Enter_Name;
    private javax.swing.JTextField Enter_email;
    private javax.swing.JPasswordField Enter_pass;
    private javax.swing.JButton Signup_but;
    private javax.swing.JLabel User_Pass;
    private javax.swing.JLabel User_email;
    private javax.swing.JLabel User_name;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton loginbut;
    private javax.swing.JLabel or;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
