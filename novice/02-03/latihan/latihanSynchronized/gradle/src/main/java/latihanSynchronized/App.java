/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package latihanSynchronized;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        CrawledSites crawledSites = new CrawledSites();
        crawledSites.getCrawledSites();
        crawledSites.getLinkedSites();
        crawledSites.add("Nama Site 1");
        crawledSites.next();
        crawledSites.getCrawledSites();
        crawledSites.getLinkedSites();
        
    }
}
