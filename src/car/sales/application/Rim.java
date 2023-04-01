
package car.sales.application;

import javax.swing.JOptionPane;


public class Rim extends javax.swing.JFrame {

    
    public Rim() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_butt = new javax.swing.JButton();
        Rim = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Rim_1 = new javax.swing.JButton();
        rim_2 = new javax.swing.JButton();
        Rim_3 = new javax.swing.JButton();
        Price_1 = new javax.swing.JLabel();
        Price_2 = new javax.swing.JLabel();
        price_3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_butt.setBackground(new java.awt.Color(0, 0, 0));
        back_butt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_butt.setForeground(new java.awt.Color(255, 255, 255));
        back_butt.setText("X");
        back_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttActionPerformed(evt);
            }
        });
        getContentPane().add(back_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Rim.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Rim.setForeground(new java.awt.Color(255, 255, 255));
        Rim.setText("Rim");
        getContentPane().add(Rim, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 940, 10));

        Rim_1.setBackground(new java.awt.Color(0, 0, 0));
        Rim_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Rim_1.setForeground(new java.awt.Color(255, 255, 255));
        Rim_1.setText("- Vossen");
        Rim_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rim_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Rim_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 320, -1));

        rim_2.setBackground(new java.awt.Color(0, 0, 0));
        rim_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rim_2.setForeground(new java.awt.Color(255, 255, 255));
        rim_2.setText("- BBS");
        rim_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rim_2ActionPerformed(evt);
            }
        });
        getContentPane().add(rim_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 310, -1));

        Rim_3.setBackground(new java.awt.Color(0, 0, 0));
        Rim_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Rim_3.setForeground(new java.awt.Color(255, 255, 255));
        Rim_3.setText("- Enkei");
        Rim_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rim_3ActionPerformed(evt);
            }
        });
        getContentPane().add(Rim_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 310, -1));

        Price_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price_1.setForeground(new java.awt.Color(255, 255, 255));
        Price_1.setText("Price - $5,000");
        getContentPane().add(Price_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        Price_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price_2.setForeground(new java.awt.Color(255, 255, 255));
        Price_2.setText("Price - $5,100");
        getContentPane().add(Price_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        price_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        price_3.setForeground(new java.awt.Color(255, 255, 255));
        price_3.setText("Price - $5,200");
        getContentPane().add(price_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("I:\\project\\gold_rim.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rim_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rim_3ActionPerformed
        setVisible(false);
        Paperwork X=new Paperwork();
       X. Show_price("$5,200");
       X.setVisible(true);
       JOptionPane.showMessageDialog(null,"- ENKEI Purchased Successfully! Fill All the Informations...");
    }//GEN-LAST:event_Rim_3ActionPerformed

    private void rim_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rim_2ActionPerformed
        setVisible(false);
        Paperwork X=new Paperwork();
       X. Show_price("$5,100");
       X.setVisible(true);
        JOptionPane.showMessageDialog(null,"- BBS Purchased Successfully! Fill All the Informations...");
    }//GEN-LAST:event_rim_2ActionPerformed

    private void back_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttActionPerformed
         setVisible(false);
        new Options().setVisible(true);
    }//GEN-LAST:event_back_buttActionPerformed

    private void Rim_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rim_1ActionPerformed
       setVisible(false);
        Paperwork X=new Paperwork();
       X. Show_price("$5,000");
       X.setVisible(true);
        JOptionPane.showMessageDialog(null,"- VOSSEN Purchased Successfully! Fill All the Informations...");
    }//GEN-LAST:event_Rim_1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Price_1;
    private javax.swing.JLabel Price_2;
    private javax.swing.JLabel Rim;
    private javax.swing.JButton Rim_1;
    private javax.swing.JButton Rim_3;
    private javax.swing.JButton back_butt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel price_3;
    private javax.swing.JButton rim_2;
    // End of variables declaration//GEN-END:variables
}
