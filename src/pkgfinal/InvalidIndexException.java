
package pkgfinal;

//Mai146607
public class InvalidIndexException extends Exception {
    String PopUp;
    public InvalidIndexException(){
        PopUp = "You must enter a valid index number from the Book List";
    }
}
