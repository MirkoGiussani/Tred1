/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tred1;

/**
 *
 * @author giussani.mirko
 */
public class RS implements Runnable{
    Thread T;
    String threadName;
    Contatore cont;
    
    public RS(String name, Contatore cont){
        this.threadName = name;
        this.cont = cont;
        T = new Thread(this);
        T.start();
    }
    
    @Override
    public void run() {
        System.out.println("Starting " + threadName);        
        cont.stampaContatore();        
        System.out.println("Thread " + threadName + " exiting.");
    }
    
}
