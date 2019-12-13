/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package latihanSingletonPattern;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());

      // dg. Ini adalah implementasi dari SingletonPatternDemo.java
      // Singleton Pattern ini digunakan bila class yg akan dibuat object-nya,
      // mempunyai tipe constructor yg private dan instance objectnya berupa static,
      // sehingga diharapkan hanya dirinya sendiri yg dpt membuat instantiate objectnya

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();
    }
}
