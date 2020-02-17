
package tred1;

/**
 *
 * @author giussani.mirko
 */
import java.util.*;

public class Thread1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*T t = new T('a');
        t.start();
        T t2 = new T('b');
        t2.start();
        
        R r = new R ('c');
        Thread t3 = new Thread(r);
        t3.start();
        
        R r2 = new R ('d');
        Thread t4 = new Thread(r2);
        t4.start();*/
        
        Contatore c = new Contatore();
//        RS r = new RS("Thread111", c);
//        RS r2 = new RS("Thread222", c);
        
        int prelievo;
        int deposito;
        contoCorrente conto;
        
        System.err.print("Inserisci il saldo iniziale: ");  //con err va rosso
        conto = new contoCorrente(input.nextFloat());
        do{
        menuContoCorrente(conto);
        int opzione = input.nextInt();
        
        switch (opzione){
            case 1:
                System.out.print("quanto desidera prelevare? ");
                conto.prelievo(input.nextFloat());
                break;
            case 2:
                System.out.print("quanto desidera depositare? ");
                conto.deposito(input.nextFloat());
                break;
        }
            System.out.println(""); //spazio
        } while (true);
    }
        public static void menuContoCorrente(contoCorrente conto){
            System.out.println("Il suo saldo è pari a: " + conto.getSaldo());
            System.out.println("\t1- prelievo");
            System.out.println("\t2- deposito");
            
            System.out.print("che opzione desidera? ");
        }
}
