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
public class Contatore {

    public synchronized void stampaContatore() {    //possibilità di sincronizzare un pezzo di codice piuttosto che un metodo
        for (int i = 10; i > 0; i--) {
            System.out.println("\tcontatore: " + i);
        }
    }
} 
