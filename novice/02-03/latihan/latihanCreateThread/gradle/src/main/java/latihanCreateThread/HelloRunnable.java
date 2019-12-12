/**
 * Class ini adalah untuk thread dengan menggunakan interface Runnable
 * @author Dedi Gunawan
 * date : 11 Dec 2019
 */
package latihanCreateThread;

public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!. Add dg from interface Runnable");
    }

    public void helloRunnableFirst() {
        (new Thread(new HelloRunnable())).start();
    }

}