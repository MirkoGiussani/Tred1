
package tred1;

/**
 *
 * @author giussani.mirko
 */

public class Thread1 {

    public static void main(String[] args) {
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
        RS r = new RS("Thread111", c);
        RS r2 = new RS("Thread222", c);
    }
    
}
