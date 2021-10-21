/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;

public class LibraryUser implements Serializable{
     
    private ArrayList<Book> book = new ArrayList<Book>();
    public int ID;
    public String name;
    public String mail;
    static int leftStud = 3;
    static int leftProf = 5;

    public LibraryUser(int ID, String name, String mail) {
        this.ID = ID;
        this.name = name;
        this.mail = mail;
    }

    public LibraryUser(int ID, String name, String mail,ArrayList<Book> book) {
        this.ID = ID;
        this.name = name;
        this.mail = mail;
        this.book = book;
    }

    

    public LibraryUser() {

        /*book.add(new Book(1234, "Harry Potter and the Deathly Hallows part I", "J.K Rowling", true));
        book.add(new Book(1235, "Harry Potter and the Goblet of Fire", "J.K Rowling", true));
        book.add(new Book(1236, "Inferno", "Dan Brown", false));
        book.add(new Book(1237, "Harry Potter and the Deathly Hallows part II", "J.K Rowling", true));
        book.add(new Book(1238, "Harry Potter and the Prisoner of Azkaban", "J.K Rowling", false));
        book.add(new Book(1239, "Harry Potter and The Chamber of secretes", "J.K Rowling", false));
        book.add(new Book(1240, "Introduction to Java Programming", "Mostafa Amir", true));
   */
        }

    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
