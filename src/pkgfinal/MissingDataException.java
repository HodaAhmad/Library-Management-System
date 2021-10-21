
package pkgfinal;

public class MissingDataException extends Exception{
    
    String meh;
    public MissingDataException(){
        meh = "You must enter a title";
    }
}
