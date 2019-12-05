package latAnnotation;

/**
 * Class ini adalah classs Derived sebagai turunan dari class Base
 * @author Dedi Gunawan 
 */



public class Derived extends Base{
    
    /**
     * Memperbaiki program setelah menambahkan override.
     * Karena ini adalah override, maka parameter pada class Derived, harus sama dengan parameter 
     * pada class Base, sehingga harus dihilangkan parameter nya
     * @author Dedi Gunawan
     */
    @Override
    /**
     * public void display(int x){
     */
    public void display(){
        System.out.println("Derived display(int)");
    }
}