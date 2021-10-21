
package pkgfinal;

//Mai146607
public class InvalidCharactersException extends Exception {
     String Message;
    public InvalidCharactersException(){
        Message = "ISBN must be Numerical";
    }
}
