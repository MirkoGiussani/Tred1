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
public class contoCorrente {
    private float saldo;

    public contoCorrente(float saldoIniziale) {
        saldo = saldoIniziale;
    }

    
    public void prelievo (float soldi){
        saldo -= soldi;
    }
    
    public void deposito(float soldi){
        saldo += soldi;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
}
