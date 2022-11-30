
package Model;


import View.Principal;
import static View.Splash.Prog;
import static View.Splash.msg;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcaos_DAO {
    
    public static void Mostrar(){
        new Thread(){
        
            public void run() {
        
        
        for (int i=0; i<101; i++){
                    try {
                        sleep(1); 
                        
                        Prog.setValue(i);
                        
                        if(Prog.getValue() == 10){
                        
                            msg.setText("Preparando Ambiente");
                            
                            sleep(1);
                                                       
                        
                        }else if (Prog.getValue() <=30){
                            msg.setText("Cartelas sendo geradas");
                          sleep(1);  
                        } else if (Prog.getValue() <=99){
                            msg.setText("Preparando ambiente");
                            
                        }else{
                            msg.setText("BINGO!");
                        
                        sleep(1);
                        
                        Model.Funcaos_DAO.tes();
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        
                    }
        
        
        
        
        }        
        }
        
        }.start();
        
    }
     public static void tes(){
       Principal carre = new Principal();
            carre.setVisible(true);
}
    
    

}
