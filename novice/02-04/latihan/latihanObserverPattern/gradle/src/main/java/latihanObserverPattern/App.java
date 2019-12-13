/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package latihanObserverPattern;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());

      // dg. Ini adalah implementasi dari ObserverPatternDemo.java
      // Observer Pattern digunakan dalam 1 to many relationship, dimana bila 1 object terdapat
      // modifikasi, maka object lain yg berhubungan dengan object tersebut akan dinotifikasi.
      // Pada contoh ini dibuat 3 object, yaitu untuk merubah bilangan menjadi binary,
      // hexa dan octal. Bila pada object Subject dilakukan perubahan, yaitu dengan mengeset
      // nilai pada method setState(), maka object Subject akan menjalankan method 
      // notifyAllObserver, dimana akan menjalankan method update() untuk tiap object binary,
      // hexa dan octal. 
      
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
    }
}
