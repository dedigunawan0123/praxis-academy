/**
 * Class ini digunakan untuk mencoba menggunakan method sleep untuk mem-pause thread
 * @@author Dedi Gunawan
 * date : 11 Dec 2019
 */

package latihanCreateThread;

public class SleepMessages {
    public void sleepMessagesFirst() throws InterruptedException {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }
}