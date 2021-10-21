/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Hoda Anis
 */
public class EmptyIDException extends Exception {
    String Message;
    public EmptyIDException(){
        Message = "You must enter a Valid ID";
    }
}
