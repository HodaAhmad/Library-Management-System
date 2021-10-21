
package pkgfinal;


public class UniqueException extends Exception {
    String mag;
    public UniqueException(){
        mag = "This ID is already exist";
    }
}
