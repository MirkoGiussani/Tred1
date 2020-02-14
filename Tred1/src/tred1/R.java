/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tred1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giussani.mirko
 */
public class R implements Runnable {

    private char c;

    public R(char c) {
        this.c = c;
    }

    @Override
    public void run() {

        try {
            while (true) {
                System.out.println("Ciao sono thread, impemento runnable " + c);
                Thread.sleep(2000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(T.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
