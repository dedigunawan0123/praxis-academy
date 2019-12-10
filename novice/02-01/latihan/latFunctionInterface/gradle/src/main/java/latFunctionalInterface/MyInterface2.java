/**
 * Ini adalah interface MyInterface2. Interface ini juga bagus untuk dijadika interface karena
 * meskipun interface ini mempunyai lebih dari 1 method (yaitu terdapat 3 method), namun
 * pada interface ini terdapat hanya 1 buah method yg belum diimplementasi, sedangkan
 * 2 buah method lainnya sudah diimplementasikan.
 * @author Dedi Gunawan
 * date : 10 Dec 2019
 */

package latFunctionalInterface;

public interface MyInterface2 {
    public void run();

    public default void doIt() {
        System.out.println("doing it");
    }

    public static void doItStatically() {
        System.out.println("doing it statically");
    }
}