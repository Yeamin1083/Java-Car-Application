
package car.sales.application;

import javax.swing.JOptionPane;

public class User_Sign_up extends javax.swing.JFrame {

    
    public User_Sign_up() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        App_Name = new javax.swing.JLabel();
        App_Add = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Back_butt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        First_name = new javax.swing.JLabel();
        Enter_fst_name = new javax.swing.JTextField();
        LAst_name = new javax.swing.JLabel();
        Enter_Lst_name = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Createaccount_Butt = new javax.swing.JButton();
        Create_Pass = new javax.swing.JLabel();
        Create_pass = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        Email = new javax.swing.JLabel();
        Enter_Email = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        App_Name.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        App_Name.setForeground(new java.awt.Color(255, 255, 255));
        App_Name.setText("Car Sales BD");
        jPanel1.add(App_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        App_Add.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        App_Add.setForeground(new java.awt.Color(255, 255, 255));
        App_Add.setText("Buy a Best Car to the Best Price...");
        jPanel1.add(App_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, -1));

        Back_butt.setBackground(new java.awt.Color(0, 102, 102));
        Back_butt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back_butt.setForeground(new java.awt.Color(255, 255, 255));
        Back_butt.setText("X");
        Back_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttActionPerformed(evt);
            }
        });
        jPanel1.add(Back_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("I:\\project\\project_debris2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 540));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 540));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        First_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        First_name.setForeground(new java.awt.Color(0, 153, 153));
        First_name.setText("First Name");
        jPanel2.add(First_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        Enter_fst_name.setBackground(new java.awt.Color(204, 204, 204));
        Enter_fst_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_fst_name.setForeground(new java.awt.Color(0, 0, 0));
        Enter_fst_name.setBorder(null);
        Enter_fst_name.setCaretColor(new java.awt.Color(0, 0, 0));
        Enter_fst_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Enter_fst_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_fst_nameActionPerformed(evt);
            }
        });
        jPanel2.add(Enter_fst_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 300, 20));

        LAst_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LAst_name.setForeground(new java.awt.Color(0, 153, 153));
        LAst_name.setText("Last Name");
        jPanel2.add(LAst_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        Enter_Lst_name.setBackground(new java.awt.Color(204, 204, 204));
        Enter_Lst_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_Lst_name.setForeground(new java.awt.Color(0, 0, 0));
        Enter_Lst_name.setBorder(null);
        Enter_Lst_name.setCaretColor(new java.awt.Color(0, 0, 0));
        Enter_Lst_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_Lst_nameActionPerformed(evt);
            }
        });
        jPanel2.add(Enter_Lst_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 300, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 203, 300, 20));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 277, 300, 10));

        Createaccount_Butt.setBackground(new java.awt.Color(0, 0, 0));
        Createaccount_Butt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Createaccount_Butt.setForeground(new java.awt.Color(0, 153, 153));
        Createaccount_Butt.setText("Create Account");
        Createaccount_Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Createaccount_ButtActionPerformed(evt);
            }
        });
        jPanel2.add(Createaccount_Butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 230, 40));

        Create_Pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Create_Pass.setForeground(new java.awt.Color(0, 153, 153));
        Create_Pass.setText("Create a Password");
        jPanel2.add(Create_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        Create_pass.setBackground(new java.awt.Color(204, 204, 204));
        Create_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Create_pass.setForeground(new java.awt.Color(0, 0, 0));
        Create_pass.setBorder(null);
        Create_pass.setCaretColor(new java.awt.Color(0, 0, 0));
        Create_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_passActionPerformed(evt);
            }
        });
        jPanel2.add(Create_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 300, 20));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 347, 300, 10));

        Email.setBackground(new java.awt.Color(0, 0, 0));
        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 153, 153));
        Email.setText("Email");
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        Enter_Email.setBackground(new java.awt.Color(204, 204, 204));
        Enter_Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_Email.setForeground(new java.awt.Color(0, 0, 0));
        Enter_Email.setBorder(null);
        Enter_Email.setCaretColor(new java.awt.Color(0, 0, 0));
        Enter_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_EmailActionPerformed(evt);
            }
        });
        jPanel2.add(Enter_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 300, 20));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 300, 10));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("I:\\project\\car_meter2.jpg")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 540));

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

    private void Enter_Lst_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_Lst_nameActionPerformed
   
    }//GEN-LAST:event_Enter_Lst_nameActionPerformed

    private void Enter_fst_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_fst_nameActionPerformed
       
    }//GEN-LAST:event_Enter_fst_nameActionPerformed

    private void Enter_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_EmailActionPerformed
      
    }//GEN-LAST:event_Enter_EmailActionPerformed

    private void Createaccount_ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Createaccount_ButtActionPerformed
if(Enter_fst_name.getText().equals("Yeamin") && Enter_Lst_name.getText().equals("Islam")&& Enter_Email.getText().equals("emon29249@gmail.com") && Create_pass.getText().equals("good")){
           setVisible(false);
           new Options().setVisible(true);
           JOptionPane.showMessageDialog(null,"Account Created...");
}    
else if(Enter_fst_name.getText().equals("Rimon") && Enter_Lst_name.getText().equals("Islam")&& Enter_Email.getText().equals("emon2@gmail.com") && Create_pass.getText().equals("good2")){
           setVisible(false);
           new Options().setVisible(true);
           JOptionPane.showMessageDialog(null,"Account Created...");
} 
else if(Enter_fst_name.getText().equals("Emon") && Enter_Lst_name.getText().equals("Islam")&& Enter_Email.getText().equals("emon3@gmail.com") && Create_pass.getText().equals("good3")){
           setVisible(false);
           new Options().setVisible(true);
           JOptionPane.showMessageDialog(null,"Account Created...");
}   

     

    }//GEN-LAST:event_Createaccount_ButtActionPerformed

    private void Create_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_passActionPerformed
       
    }//GEN-LAST:event_Create_passActionPerformed

    private void Back_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttActionPerformed
 setVisible(false);
        new User_Sign_in().setVisible(true);        
    }//GEN-LAST:event_Back_buttActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel App_Add;
    private javax.swing.JLabel App_Name;
    private javax.swing.JButton Back_butt;
    private javax.swing.JLabel Create_Pass;
    private javax.swing.JPasswordField Create_pass;
    private javax.swing.JButton Createaccount_Butt;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField Enter_Email;
    private javax.swing.JTextField Enter_Lst_name;
    private javax.swing.JTextField Enter_fst_name;
    private javax.swing.JLabel First_name;
    private javax.swing.JLabel LAst_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
