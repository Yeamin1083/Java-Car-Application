
package car.sales.application;

import javax.swing.JOptionPane;


public class Paperwork extends javax.swing.JFrame {

    
    public Paperwork() {
        initComponents();
        
      
   
    }
public void Show_price(String S){
    Total_amount.setText(S);
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        App_name = new javax.swing.JLabel();
        app_add = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Back_butt = new javax.swing.JButton();
        picture_1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Buyer_infor = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        NAme = new javax.swing.JLabel();
        Contact = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        NID = new javax.swing.JLabel();
        Paymant_type = new javax.swing.JLabel();
        Paymant_history = new javax.swing.JLabel();
        PAYABLE_amount = new javax.swing.JLabel();
        Enter_name = new javax.swing.JTextField();
        Enter_contact_number = new javax.swing.JTextField();
        Total_amount = new javax.swing.JTextField();
        Done_butt = new javax.swing.JButton();
        DELIVERY = new javax.swing.JLabel();
        Choose_payType = new javax.swing.JComboBox<>();
        Chhose_payHistory = new javax.swing.JComboBox<>();
        Choose_delivery = new javax.swing.JComboBox<>();
        Choose_Age = new javax.swing.JSpinner();
        City = new javax.swing.JLabel();
        Insert_NID1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Picture_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        App_name.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        App_name.setForeground(new java.awt.Color(255, 255, 255));
        App_name.setText("Car Sales BD");
        jPanel1.add(App_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        app_add.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        app_add.setForeground(new java.awt.Color(255, 255, 255));
        app_add.setText("Buy a Best Car to the Best Price...");
        jPanel1.add(app_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

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

        picture_1.setIcon(new javax.swing.ImageIcon("I:\\project\\project_debris2.jpg")); // NOI18N
        jPanel1.add(picture_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 540));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 540));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buyer_infor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buyer_infor.setForeground(new java.awt.Color(255, 255, 255));
        Buyer_infor.setText("Buyer Information");
        jPanel2.add(Buyer_infor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 10));

        NAme.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NAme.setForeground(new java.awt.Color(255, 255, 255));
        NAme.setText("Name :");
        jPanel2.add(NAme, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        Contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Contact.setForeground(new java.awt.Color(255, 255, 255));
        Contact.setText("Contact :");
        jPanel2.add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        Age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 255, 255));
        Age.setText("Age :");
        jPanel2.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        NID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NID.setForeground(new java.awt.Color(255, 255, 255));
        NID.setText("National ID :");
        jPanel2.add(NID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        Paymant_type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Paymant_type.setForeground(new java.awt.Color(255, 255, 255));
        Paymant_type.setText("Paymant Type :");
        jPanel2.add(Paymant_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        Paymant_history.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Paymant_history.setForeground(new java.awt.Color(255, 255, 255));
        Paymant_history.setText("Paymant History :");
        jPanel2.add(Paymant_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        PAYABLE_amount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PAYABLE_amount.setForeground(new java.awt.Color(255, 255, 255));
        PAYABLE_amount.setText("Payable Amount : ");
        jPanel2.add(PAYABLE_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        Enter_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_nameActionPerformed(evt);
            }
        });
        jPanel2.add(Enter_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 240, -1));

        Enter_contact_number.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Enter_contact_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_contact_numberActionPerformed(evt);
            }
        });
        jPanel2.add(Enter_contact_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 230, -1));

        Total_amount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Total_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_amountActionPerformed(evt);
            }
        });
        jPanel2.add(Total_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 160, -1));

        Done_butt.setBackground(new java.awt.Color(0, 0, 0));
        Done_butt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Done_butt.setForeground(new java.awt.Color(255, 255, 255));
        Done_butt.setText("Done");
        Done_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_buttActionPerformed(evt);
            }
        });
        jPanel2.add(Done_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        DELIVERY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DELIVERY.setForeground(new java.awt.Color(255, 255, 255));
        DELIVERY.setText("Delivery :");
        jPanel2.add(DELIVERY, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        Choose_payType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque", " " }));
        jPanel2.add(Choose_payType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        Chhose_payHistory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Due" }));
        jPanel2.add(Chhose_payHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        Choose_delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Self Pick", "Home Delivery" }));
        jPanel2.add(Choose_delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        Choose_Age.setModel(new javax.swing.SpinnerNumberModel(18, 18, 65, 1));
        jPanel2.add(Choose_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        City.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        City.setForeground(new java.awt.Color(255, 255, 255));
        City.setText("City : ");
        jPanel2.add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        Insert_NID1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(Insert_NID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 210, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Khulna", "Rajshahi", "Rangpur", "Sylhet", "Barishal", "Chittagong", "Mymenshing", " ", " " }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        Picture_2.setIcon(new javax.swing.ImageIcon("I:\\project\\11.jpg")); // NOI18N
        Picture_2.setText("jLabel1");
        jPanel2.add(Picture_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 540));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 620, 540));

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

    private void Enter_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_nameActionPerformed
        
    }//GEN-LAST:event_Enter_nameActionPerformed

    private void Done_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_buttActionPerformed
          setVisible(false); 
        new Finish().setVisible(true);
         JOptionPane.showMessageDialog(null,"Paymant done!!! Thank you for comig..."); 
         
    }//GEN-LAST:event_Done_buttActionPerformed

    private void Back_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttActionPerformed
           setVisible(false);
        new Options().setVisible(true);
     

            
        
    }//GEN-LAST:event_Back_buttActionPerformed

    private void Total_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_amountActionPerformed

    private void Enter_contact_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_contact_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Enter_contact_numberActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paperwork().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel App_name;
    private javax.swing.JButton Back_butt;
    private javax.swing.JLabel Buyer_infor;
    private javax.swing.JComboBox<String> Chhose_payHistory;
    private javax.swing.JSpinner Choose_Age;
    private javax.swing.JComboBox<String> Choose_delivery;
    private javax.swing.JComboBox<String> Choose_payType;
    private javax.swing.JLabel City;
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel DELIVERY;
    private javax.swing.JButton Done_butt;
    private javax.swing.JTextField Enter_contact_number;
    private javax.swing.JTextField Enter_name;
    private javax.swing.JTextField Insert_NID1;
    private javax.swing.JLabel NAme;
    private javax.swing.JLabel NID;
    private javax.swing.JLabel PAYABLE_amount;
    private javax.swing.JLabel Paymant_history;
    private javax.swing.JLabel Paymant_type;
    private javax.swing.JLabel Picture_2;
    private javax.swing.JTextField Total_amount;
    private javax.swing.JLabel app_add;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel picture_1;
    // End of variables declaration//GEN-END:variables


// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    void Show_Model(String aventador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }//
