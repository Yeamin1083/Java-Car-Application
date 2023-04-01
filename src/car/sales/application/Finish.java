
package car.sales.application;


public class Finish extends javax.swing.JFrame {

    public Finish() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        app_name = new javax.swing.JLabel();
        app_add = new javax.swing.JLabel();
        Thank_come = new javax.swing.JLabel();
        Warrenty = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        close_butt = new javax.swing.JButton();
        back_butt = new javax.swing.JButton();
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
        jPanel1.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        app_add.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        app_add.setForeground(new java.awt.Color(255, 255, 255));
        app_add.setText("Buy a Best Car to the Best Price...");
        jPanel1.add(app_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        Thank_come.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Thank_come.setForeground(new java.awt.Color(255, 255, 255));
        Thank_come.setText("Thank You for Coming...");
        jPanel1.add(Thank_come, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        Warrenty.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Warrenty.setForeground(new java.awt.Color(255, 255, 255));
        Warrenty.setText("You got five years warrenty...");
        jPanel1.add(Warrenty, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 490, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 260, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 300, 10));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 310, 10));

        close_butt.setBackground(new java.awt.Color(0, 102, 102));
        close_butt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close_butt.setForeground(new java.awt.Color(255, 255, 255));
        close_butt.setText("Close");
        close_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttActionPerformed(evt);
            }
        });
        jPanel1.add(close_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, -1, -1));

        back_butt.setBackground(new java.awt.Color(0, 102, 102));
        back_butt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back_butt.setForeground(new java.awt.Color(255, 255, 255));
        back_butt.setText("X");
        back_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttActionPerformed(evt);
            }
        });
        jPanel1.add(back_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        picture.setIcon(new javax.swing.ImageIcon("I:\\project\\project_debris2.jpg")); // NOI18N
        picture.setText("jLabel1");
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 540));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 540));

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

    private void close_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttActionPerformed
        setVisible(false);
    }//GEN-LAST:event_close_buttActionPerformed

    private void back_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttActionPerformed
       setVisible(false);
        new Options().setVisible(true);
    }//GEN-LAST:event_back_buttActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Thank_come;
    private javax.swing.JLabel Warrenty;
    private javax.swing.JLabel app_add;
    private javax.swing.JLabel app_name;
    private javax.swing.JButton back_butt;
    private javax.swing.JButton close_butt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
