/**
 * Class ini adalah untuk thread dengan menggunakan class Thread
 * @author Dedi Gunawan
 * date : 11 Dec 2019
 */
package latihanCreateThread;

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!. Add dg from class Thread");
    }

    public void helloThreadFirst() {
        (new HelloThread()).start();
    }

}