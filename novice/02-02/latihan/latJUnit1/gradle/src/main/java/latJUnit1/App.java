/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package latJUnit1;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        AdderImpl adderImpl = new AdderImpl();
        System.out.println(adderImpl.add(1,2));
    }
}
