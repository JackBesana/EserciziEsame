/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es1verifica2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besana_giacomo
 */
public class DatiCondivisi {

    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore finito;
    int contatore = 0;

    public DatiCondivisi() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
        finito = new Semaphore(0);
    }

    public void daiPermesso1() {
        sem1.release();
    }

    public void chiediPermesso1() {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso2() {
        sem2.release();
    }

    public void chiediPermesso2() {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermessoFinito() {
        finito.release();
    }

    public void chiediPermessoFinito() {
        try {
            finito.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controllaFinito() {
        contatore+=1;
        if(contatore==2){
            daiPermessoFinito();
        }
    }
}
