
package car.sales.application;

public class Options extends javax.swing.JFrame {

   
    public Options() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        app_name = new javax.swing.JLabel();
        app_add = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Upgrade_car_rim = new javax.swing.JButton();
        buy_A_car = new javax.swing.JButton();
        upgrd_or_buy_car = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Upgrade_car_engine = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        app_name.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("Car Sales BD");
        jPanel1.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        app_add.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        app_add.setForeground(new java.awt.Color(255, 255, 255));
        app_add.setText("Buy a Best Car to the Best Price...");
        jPanel1.add(app_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 280, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 310, 10));

        Upgrade_car_rim.setBackground(new java.awt.Color(0, 102, 102));
        Upgrade_car_rim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Upgrade_car_rim.setForeground(new java.awt.Color(255, 255, 255));
        Upgrade_car_rim.setText("Upgrade Car Rim");
        Upgrade_car_rim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upgrade_car_rimActionPerformed(evt);
            }
        });
        jPanel1.add(Upgrade_car_rim, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 200, -1));

        buy_A_car.setBackground(new java.awt.Color(0, 102, 102));
        buy_A_car.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buy_A_car.setForeground(new java.awt.Color(255, 255, 255));
        buy_A_car.setText("Buy A Car");
        buy_A_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_A_carActionPerformed(evt);
            }
        });
        jPanel1.add(buy_A_car, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 200, -1));

        upgrd_or_buy_car.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        upgrd_or_buy_car.setForeground(new java.awt.Color(255, 255, 255));
        upgrd_or_buy_car.setText("Upgrade Or Buy Car");
        jPanel1.add(upgrd_or_buy_car, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 930, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Or");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        Upgrade_car_engine.setBackground(new java.awt.Color(0, 102, 102));
        Upgrade_car_engine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Upgrade_car_engine.setForeground(new java.awt.Color(255, 255, 255));
        Upgrade_car_engine.setText("Upgrade Car Engine");
        Upgrade_car_engine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upgrade_car_engineActionPerformed(evt);
            }
        });
        jPanel1.add(Upgrade_car_engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Or");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        picture.setIcon(new javax.swing.ImageIcon("I:\\project\\project_debris2.jpg")); // NOI18N
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buy_A_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_A_carActionPerformed
          setVisible(false);
        new Car_list().setVisible(true);
    }//GEN-LAST:event_buy_A_carActionPerformed

    private void Upgrade_car_rimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upgrade_car_rimActionPerformed
         setVisible(false);
        new Rim().setVisible(true);
    }//GEN-LAST:event_Upgrade_car_rimActionPerformed

    private void Upgrade_car_engineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upgrade_car_engineActionPerformed
         setVisible(false);
        new Engine().setVisible(true);
    }//GEN-LAST:event_Upgrade_car_engineActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Upgrade_car_engine;
    private javax.swing.JButton Upgrade_car_rim;
    private javax.swing.JLabel app_add;
    private javax.swing.JLabel app_name;
    private javax.swing.JButton buy_A_car;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel upgrd_or_buy_car;
    // End of variables declaration//GEN-END:variables
}
