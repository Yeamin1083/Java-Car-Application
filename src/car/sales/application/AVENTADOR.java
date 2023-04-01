
package car.sales.application;

import javax.swing.JOptionPane;


public class AVENTADOR extends javax.swing.JFrame {

    public AVENTADOR() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Car_name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Back_butt = new javax.swing.JButton();
        Buy_butt = new javax.swing.JButton();
        Price = new javax.swing.JLabel();
        picture_1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Picture_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Car_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Car_name.setForeground(new java.awt.Color(255, 255, 255));
        Car_name.setText("AVENTADOR");
        jPanel1.add(Car_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 22, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("- engineV12, 60°, MPI.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 81, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("- Displacement 6498 cm³");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 119, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- bore x strokeØ 95 mm x 76,4 mm.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 157, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- compression ratio11.8 ± 0.2.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 195, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Max. power566 kW (770 CV) at 8.500 rpm.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 233, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("- Max. torque720 Nm at 6.750 rpm.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 271, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- weight to power ratio1,98 kg/CV.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 309, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("- lubricationDry sump.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 347, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 53, 181, 22));

        Back_butt.setBackground(new java.awt.Color(0, 0, 0));
        Back_butt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back_butt.setForeground(new java.awt.Color(255, 255, 255));
        Back_butt.setText("X");
        Back_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttActionPerformed(evt);
            }
        });
        jPanel1.add(Back_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 23));

        Buy_butt.setBackground(new java.awt.Color(0, 0, 0));
        Buy_butt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Buy_butt.setForeground(new java.awt.Color(255, 255, 255));
        Buy_butt.setText("BUY");
        Buy_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy_buttActionPerformed(evt);
            }
        });
        jPanel1.add(Buy_butt, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 444, -1, -1));

        Price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setText("Price- $573,966 ");
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 397, -1, -1));

        picture_1.setIcon(new javax.swing.ImageIcon("I:\\project\\11.jpg")); // NOI18N
        picture_1.setText("jLabel1");
        jPanel1.add(picture_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 470));

        Picture_2.setIcon(new javax.swing.ImageIcon("I:\\project\\2021-lamborghini-aventador-mmp-1-16014990022.jpg")); // NOI18N
        Picture_2.setText("jLabel11");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Picture_2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Picture_2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 520, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttActionPerformed
         setVisible(false);
        new Car_list().setVisible(true);
    }//GEN-LAST:event_Back_buttActionPerformed

    private void Buy_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy_buttActionPerformed
         
        setVisible(false);
        Paperwork X=new Paperwork();
       X. Show_price("$573,966");
       X.setVisible(true);
       JOptionPane.showMessageDialog(null,"AVENTADOR Purchased Successfully! Fill All the Informations...");
    }//GEN-LAST:event_Buy_buttActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AVENTADOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_butt;
    private javax.swing.JButton Buy_butt;
    private javax.swing.JLabel Car_name;
    private javax.swing.JLabel Picture_2;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel picture_1;
    // End of variables declaration//GEN-END:variables
}
