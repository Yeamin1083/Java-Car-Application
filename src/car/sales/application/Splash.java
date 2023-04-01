
package car.sales.application;


public class Splash extends javax.swing.JFrame {

   
    public Splash() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Loading_bar = new javax.swing.JProgressBar();
        Launching = new javax.swing.JLabel();
        Wait = new javax.swing.JLabel();
        Loading_number = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        jPanel1.add(App_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        app_add.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        app_add.setForeground(new java.awt.Color(255, 255, 255));
        app_add.setText("Buy a Best Car to the Best Price...");
        jPanel1.add(app_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 300, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 280, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("- Best online car shop and trustable.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("- We try to give best survices to our customers.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("- And we have 26 showrooms in Bangladesh.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("- We offer best cars to the best price.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("- We have 36 survice center in Bangladesh.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        Loading_bar.setBackground(new java.awt.Color(255, 255, 255));
        Loading_bar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Loading_bar.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(Loading_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 480, 30));

        Launching.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Launching.setForeground(new java.awt.Color(255, 255, 255));
        Launching.setText("Launching the Aplication...");
        jPanel1.add(Launching, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        Wait.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Wait.setForeground(new java.awt.Color(255, 255, 255));
        Wait.setText("Please Wait...");
        jPanel1.add(Wait, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        Loading_number.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Loading_number.setForeground(new java.awt.Color(255, 255, 255));
        Loading_number.setText("99%");
        jPanel1.add(Loading_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("I:\\project\\project_debris2.jpg")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 540));

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

    public static void main(String args[]) {
  
       Splash splash=new Splash();
       splash.setVisible(true);
       try{
           for(int i=0;i<=100;i++){
               Thread.sleep(30);
               splash.Loading_number.setText(Integer.toString(i)+"%");
               splash.Loading_bar.setValue(i);
               
           }
          
           new User_Sign_in().setVisible(true);
            splash.setVisible(false);
       }catch(Exception e){
    }
     }
   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel App_name;
    private javax.swing.JLabel Launching;
    public javax.swing.JProgressBar Loading_bar;
    public javax.swing.JLabel Loading_number;
    private javax.swing.JLabel Wait;
    private javax.swing.JLabel app_add;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    void splash() {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
