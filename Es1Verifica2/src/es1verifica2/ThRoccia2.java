/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1verifica2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besana_giacomo
 */
public class ThRoccia2 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThRoccia2(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        datiC.chiediPermesso2();
        Random rand = new Random();

        System.out.println("roccia 2 COLPITA");
        System.out.println("INIZIO DISINTEGRAZIONE roccia 2");        
        try {
            Thread.sleep(rand.nextInt(1000) + 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRoccia2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("FINE DISINTEGRAZIONE roccia 2 ");
    }
}
