/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1verifica2;

/**
 *
 * @author besan
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class Es1Verifica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try {
            DatiCondivisi datiC = new DatiCondivisi();
            
            ThRazzo1 th1 = new ThRazzo1(datiC);
            ThRazzo2 th2 = new ThRazzo2(datiC);
            ThRoccia1 th3 = new ThRoccia1(datiC);
            ThRoccia2 th4 = new ThRoccia2(datiC);
            
            th1.start();
            th2.start();
            th3.start();
            th4.start();
            
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            System.out.println("ROCCE DISTRUTTE");
        } catch (InterruptedException ex) {
            Logger.getLogger(Es1Verifica2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
