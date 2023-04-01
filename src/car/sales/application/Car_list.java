
package car.sales.application;


public class Car_list extends javax.swing.JFrame {

   
    public Car_list() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        App_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        App_add = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Back_Butt = new javax.swing.JButton();
        Picture_1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        AVENTADOR = new javax.swing.JButton();
        HURACANEVO = new javax.swing.JButton();
        URUS = new javax.swing.JButton();
        Chiron = new javax.swing.JButton();
        BAYRON = new javax.swing.JButton();
        BUGATTI_EB = new javax.swing.JButton();
        SUPERFAST = new javax.swing.JButton();
        PISTA = new javax.swing.JButton();
        TRIBUTO = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Picture_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        App_name.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        App_name.setForeground(new java.awt.Color(255, 255, 255));
        App_name.setText("Car Sales BD");
        jPanel3.add(App_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 17, 222, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 71, 256, -1));

        App_add.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        App_add.setForeground(new java.awt.Color(255, 255, 255));
        App_add.setText("Buy a Best Car to the Best Price...");
        jPanel3.add(App_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 80, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 111, 314, -1));

        Back_Butt.setBackground(new java.awt.Color(0, 0, 0));
        Back_Butt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back_Butt.setForeground(new java.awt.Color(255, 255, 255));
        Back_Butt.setText("X");
        Back_Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtActionPerformed(evt);
            }
        });
        jPanel3.add(Back_Butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Picture_1.setIcon(new javax.swing.ImageIcon("I:\\project\\project_debris2.jpg")); // NOI18N
        jPanel3.add(Picture_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 140));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 140));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 920, 12));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAMBORGHINI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 96, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BUGATTI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 96, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 127, 173, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FERRARI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 96, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 127, 178, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 127, 189, 10));

        AVENTADOR.setBackground(new java.awt.Color(0, 102, 102));
        AVENTADOR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AVENTADOR.setForeground(new java.awt.Color(255, 255, 255));
        AVENTADOR.setText("AVENTADOR SBJ");
        AVENTADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AVENTADORActionPerformed(evt);
            }
        });
        jPanel1.add(AVENTADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 140, 189, 40));

        HURACANEVO.setBackground(new java.awt.Color(0, 102, 102));
        HURACANEVO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HURACANEVO.setForeground(new java.awt.Color(255, 255, 255));
        HURACANEVO.setText("HURACANEVO");
        HURACANEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HURACANEVOActionPerformed(evt);
            }
        });
        jPanel1.add(HURACANEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 215, 189, 40));

        URUS.setBackground(new java.awt.Color(0, 102, 102));
        URUS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        URUS.setForeground(new java.awt.Color(255, 255, 255));
        URUS.setText("URUS");
        URUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URUSActionPerformed(evt);
            }
        });
        jPanel1.add(URUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 286, 189, 40));

        Chiron.setBackground(new java.awt.Color(0, 102, 102));
        Chiron.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Chiron.setForeground(new java.awt.Color(255, 255, 255));
        Chiron.setText("CHIRON");
        Chiron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChironActionPerformed(evt);
            }
        });
        jPanel1.add(Chiron, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 140, 153, 40));

        BAYRON.setBackground(new java.awt.Color(0, 102, 102));
        BAYRON.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BAYRON.setForeground(new java.awt.Color(255, 255, 255));
        BAYRON.setText("BEYRON");
        BAYRON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAYRONActionPerformed(evt);
            }
        });
        jPanel1.add(BAYRON, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 215, 153, 40));

        BUGATTI_EB.setBackground(new java.awt.Color(0, 102, 102));
        BUGATTI_EB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BUGATTI_EB.setForeground(new java.awt.Color(255, 255, 255));
        BUGATTI_EB.setText("BUGATTI EB 110S");
        BUGATTI_EB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUGATTI_EBActionPerformed(evt);
            }
        });
        jPanel1.add(BUGATTI_EB, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 285, 153, 41));

        SUPERFAST.setBackground(new java.awt.Color(0, 102, 102));
        SUPERFAST.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SUPERFAST.setForeground(new java.awt.Color(255, 255, 255));
        SUPERFAST.setText("812 SUPERFAST");
        SUPERFAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUPERFASTActionPerformed(evt);
            }
        });
        jPanel1.add(SUPERFAST, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 138, 184, 45));

        PISTA.setBackground(new java.awt.Color(0, 102, 102));
        PISTA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PISTA.setForeground(new java.awt.Color(255, 255, 255));
        PISTA.setText("FERRARI 488 PISTA ");
        PISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PISTAActionPerformed(evt);
            }
        });
        jPanel1.add(PISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 215, 184, 40));

        TRIBUTO.setBackground(new java.awt.Color(0, 102, 102));
        TRIBUTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TRIBUTO.setForeground(new java.awt.Color(255, 255, 255));
        TRIBUTO.setText("FERRARI TRIBUTO");
        TRIBUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRIBUTOActionPerformed(evt);
            }
        });
        jPanel1.add(TRIBUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 286, 184, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choose A Car");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 22, -1, -1));

        Picture_2.setIcon(new javax.swing.ImageIcon("I:\\project\\4.jpg")); // NOI18N
        jPanel1.add(Picture_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 970, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 920, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SUPERFASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUPERFASTActionPerformed
        setVisible(false);
        new FERRARI_Superfast().setVisible(true);
    }//GEN-LAST:event_SUPERFASTActionPerformed

    private void AVENTADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AVENTADORActionPerformed
          setVisible(false);
        new AVENTADOR().setVisible(true);
    }//GEN-LAST:event_AVENTADORActionPerformed

    private void HURACANEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HURACANEVOActionPerformed
           setVisible(false);
        new HURACANEVO().setVisible(true);        
    }//GEN-LAST:event_HURACANEVOActionPerformed

    private void URUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URUSActionPerformed
         setVisible(false);
        new URUS().setVisible(true);
    }//GEN-LAST:event_URUSActionPerformed

    private void ChironActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChironActionPerformed
       setVisible(false);
        new CHIRON().setVisible(true);
    }//GEN-LAST:event_ChironActionPerformed

    private void BAYRONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAYRONActionPerformed
         setVisible(false);
        new BEYRON().setVisible(true);
    }//GEN-LAST:event_BAYRONActionPerformed

    private void BUGATTI_EBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUGATTI_EBActionPerformed
        setVisible(false);
        new BUGATTI_EB().setVisible(true);
    }//GEN-LAST:event_BUGATTI_EBActionPerformed

    private void PISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PISTAActionPerformed
        setVisible(false);
        new FERRARI_Pista().setVisible(true);
    }//GEN-LAST:event_PISTAActionPerformed

    private void TRIBUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRIBUTOActionPerformed
        setVisible(false);
        new FERRARI_Tributo().setVisible(true);
    }//GEN-LAST:event_TRIBUTOActionPerformed

    private void Back_ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtActionPerformed
         setVisible(false);
        new Options().setVisible(true);
    }//GEN-LAST:event_Back_ButtActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Car_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AVENTADOR;
    private javax.swing.JLabel App_add;
    private javax.swing.JLabel App_name;
    private javax.swing.JButton BAYRON;
    private javax.swing.JButton BUGATTI_EB;
    private javax.swing.JButton Back_Butt;
    private javax.swing.JButton Chiron;
    private javax.swing.JButton HURACANEVO;
    private javax.swing.JButton PISTA;
    private javax.swing.JLabel Picture_1;
    private javax.swing.JLabel Picture_2;
    private javax.swing.JButton SUPERFAST;
    private javax.swing.JButton TRIBUTO;
    private javax.swing.JButton URUS;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
