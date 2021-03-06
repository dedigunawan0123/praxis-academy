/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package latihanTemplatePattern;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());

      // dg. Ini adalah implementasi dari TemplatePatternDemo.java
      // Template Pattern digunakan bila sebuah abstract class, mempunyai suatu method yang
      // bersifat final, sehingga method tsb tidak dapat dioverriden, sehingga untuk menjalankannya
      // adalah langsung dari abstract class tersebut yang merupakan parent class. 
      // Pada contoh ini dibuat 2 buah class yaitu class Cricket dan class FootBall yang 
      // merupakan child class dari abstract class Game. Semua method pada abstract class Game
      // dapat dioverride, kecuali method play(), dimana merupakan method final, sehingga tidak
      // dapat dioverride oleh ke 2 class tersebut di atas.

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();	
    }
}
