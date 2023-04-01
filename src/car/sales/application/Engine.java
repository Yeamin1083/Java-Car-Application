
package car.sales.application;

import javax.swing.JOptionPane;


public class Engine extends javax.swing.JFrame {

    
    public Engine() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_butt = new javax.swing.JButton();
        Engine = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Engine_1 = new javax.swing.JButton();
        Engine_2 = new javax.swing.JButton();
        Engine_3 = new javax.swing.JButton();
        Price_1 = new javax.swing.JLabel();
        Price_2 = new javax.swing.JLabel();
        Price_3 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();

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

        Engine.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Engine.setForeground(new java.awt.Color(255, 255, 255));
        Engine.setText("Engine");
        getContentPane().add(Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 940, 10));

        Engine_1.setBackground(new java.awt.Color(0, 0, 0));
        Engine_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Engine_1.setForeground(new java.awt.Color(255, 255, 255));
        Engine_1.setText("- Fiat 500 TwinAir: 118.9bhp/litre. ");
        Engine_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Engine_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Engine_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        Engine_2.setBackground(new java.awt.Color(0, 0, 0));
        Engine_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Engine_2.setForeground(new java.awt.Color(255, 255, 255));
        Engine_2.setText("- Honda S2000: 123.7bhp/litre. ");
        Engine_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Engine_2ActionPerformed(evt);
            }
        });
        getContentPane().add(Engine_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 320, -1));

        Engine_3.setBackground(new java.awt.Color(0, 0, 0));
        Engine_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Engine_3.setForeground(new java.awt.Color(255, 255, 255));
        Engine_3.setText("- Alfa Romeo 4C: 136.1bhp/litre.");
        Engine_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Engine_3ActionPerformed(evt);
            }
        });
        getContentPane().add(Engine_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 320, -1));

        Price_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price_1.setForeground(new java.awt.Color(255, 255, 255));
        Price_1.setText("Price - $25,000");
        getContentPane().add(Price_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        Price_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price_2.setForeground(new java.awt.Color(255, 255, 255));
        Price_2.setText("Price - $30,000");
        getContentPane().add(Price_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        Price_3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price_3.setForeground(new java.awt.Color(255, 255, 255));
        Price_3.setText("Price - $35,000");
        getContentPane().add(Price_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        picture.setIcon(new javax.swing.ImageIcon("I:\\project\\audi_engine.jpg")); // NOI18N
        getContentPane().add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Engine_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Engine_3ActionPerformed
          setVisible(false);
        Paperwork X=new Paperwork();
       X. Show_price("$25,000");
       X.setVisible(true);
        JOptionPane.showMessageDialog(null,"- Alfa Romeo 4C Purchased Successfully! Fill All the Informations...");
    }//GEN-LAST:event_Engine_3ActionPerformed

    private void Engine_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Engine_2ActionPerformed
         setVisible(false);
        Paperwork X=new Paperwork();
       X. Show_price("$30,000");
       X.setVisible(true);
        JOptionPane.showMessageDialog(null,"- Honda S2000 Purchased Successfully! Fill All the Informations...");
    }//GEN-LAST:event_Engine_2ActionPerformed

    private void back_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttActionPerformed
         setVisible(false);
        new Options().setVisible(true);
    }//GEN-LAST:event_back_buttActionPerformed

    private void Engine_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Engine_1ActionPerformed
       setVisible(false);
        Paperwork X=new Paperwork();
       X. Show_price("$35,000");
       X.setVisible(true);
        JOptionPane.showMessageDialog(null,"- Fiat 500 TwinAir Purchased Successfully! Fill All the Informations...");
    }//GEN-LAST:event_Engine_1ActionPerformed

   
    public static void main(String args[]) {
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Engine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Engine;
    private javax.swing.JButton Engine_1;
    private javax.swing.JButton Engine_2;
    private javax.swing.JButton Engine_3;
    private javax.swing.JLabel Price_1;
    private javax.swing.JLabel Price_2;
    private javax.swing.JLabel Price_3;
    private javax.swing.JButton back_butt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
