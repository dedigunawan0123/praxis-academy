/**
 * Ini adalah class CrawledSites, untuk mempraktekkan keyword synchronized.
 * Dengan keyword synchronized ini, maka sebuah class
 * atau sebuah potongan program, menjadi hanya boleh
 * diakses oleh 1 buah thread saja, sehingga tidak terganggu oleh thread yg lainnya,
 * sebagai impact negative dari multithread
 * @author Dedi Gunawan
 * date : 12 Dec 2019
 *
 */
package latihanSynchronized;

import java.util.List;
import java.util.ArrayList;

public class CrawledSites{
    private List<String> crawledSites = new ArrayList<String>();
    private List<String> linkedSites = new ArrayList<String>();

    public void add(String site){
        // dg. synchronized di sini dimaksudkan supaya hanya dapat diakses oleh 1 thread.
        synchronized (this){
            if(!crawledSites.contains(site)){
                linkedSites.add(site);
            }
        }
    }

    public String next(){
        if (linkedSites.size() == 0){
            return null;
        }
        // dg. synchronized di sini dimaksudkan supaya hanya dapat diakses oleh 1 thread.
        synchronized (this){
            if (linkedSites.size() > 0){
                String s = linkedSites.get(0);
                linkedSites.remove(0);
                crawledSites.add(s);
                return s;
            }
            return null;
        }
    }

    //dg. Add. Ini untuk mengecek kondisi size
    public void getCrawledSites(){
        System.out.println( "Size crawledSites = " + crawledSites.size() );
    }
    public void getLinkedSites(){
        System.out.println( "Size linkedSites = " + linkedSites.size() );
    }
}