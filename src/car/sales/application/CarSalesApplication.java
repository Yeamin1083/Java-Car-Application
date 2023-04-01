 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.sales.application;

/**
 *
 * @author EmpirEmoN
 */
public class CarSalesApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Splash x=new Splash();
      x.setVisible(true);
    try{
           for(int i=0;i<=100;i++){
               Thread.sleep(30);
               x.Loading_number.setText(Integer.toString(i)+"%");
               x.Loading_bar.setValue(i);
               
           }
          
           new User_Sign_in().setVisible(true);
            x.setVisible(false);
       }catch(Exception e){
    }
     }
     }
    
    

