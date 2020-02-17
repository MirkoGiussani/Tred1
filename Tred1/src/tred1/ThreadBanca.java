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
public class ThreadBanca implements Runnable{
    Thread T;
    //String threadName;
    contoCorrente conto;
    
    public ThreadBanca(contoCorrente conto) {
        //this.threadName = name;
        this.conto = conto;
        T = new Thread (this);
        T.start();
    }

    
    @Override
    public void run() {
        System.out.println("saldo corrente: " + conto.getSaldo());
    }
    
    public void prelievo(float soldi){
        conto.prelievo(soldi);
    }
    
    public void deposito(float soldi){
        conto.deposito(soldi);
    }
}
