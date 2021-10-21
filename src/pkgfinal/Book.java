package pkgfinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;
import static pkgfinal.LibraryUser.leftStud;
import static pkgfinal.LibraryUser.leftProf;

public class Book implements Serializable {

    public ArrayList<Book> book = new ArrayList<Book>();
    LibraryUser u = new LibraryUser();
    public int ISBN;
    public String title;
    public String author;
    public boolean state;

    public Book() {
        book.add(new Book(1234, "s", "J.K Rowling", true));
        book.add(new Book(1235, "Harry Potter and the Goblet of Fire", "J.K Rowling", true));
        book.add(new Book(1236, "Inferno", "Dan Brown", false));
        book.add(new Book(1237, "Harry Potter and the Deathly Hallows part II", "J.K Rowling", true));
        book.add(new Book(1238, "Harry Potter and the Prisoner of Azkaban", "J.K Rowling", false));
        book.add(new Book(1239, "Harry Potter and The Chamber of secretes", "J.K Rowling", false));
        book.add(new Book(1240, "Introduction to Java Programming", "Mostafa Amir", true));
    }

    public Book(int ISBN, String title, String author, boolean state) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.state = state;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void ListBook() {
        for (int i = 0; i < book.size(); i++) {
            System.out.println("\n Index: " + i + " " + book.get(i));
        }
    }

    public Book SearchBook(String Btitle) {

        for (Book b : book) {
            if (b.getTitle().equals(Btitle)) {
                System.out.println("The book " + Btitle + " is found");
                return b;
            }
        }
        System.out.println("Book not found");
        JOptionPane.showMessageDialog(null, "Book not found");
        return null;
    }

    public void Add_Book() throws InvalidCharactersException {
        Scanner enter = new Scanner(System.in);
        state = true;
        //i don't know how to get a logically good output :(

        System.out.println("enter ISBN and Title: ");
        boolean sc = enter.hasNextInt();

        if (sc) {
            System.out.println("enter Author: ");
            book.add(new Book(enter.nextInt(), enter.nextLine(), enter.nextLine(), state));
            System.out.println("The book has been added Successfully");
        }

        try {
            if (!sc) {
                throw new InvalidCharactersException();
            }
        } catch (InvalidCharactersException e) {
            System.out.println(e.Message);
        }
    }

    public void DeleteBook() throws InvalidIndexException {
        System.out.println("Enter index number of book to delete: ");
        Scanner enter = new Scanner(System.in);
        int choice = enter.nextInt();
        if (choice <= book.size() && choice >= 0) {
            book.remove(choice);
            System.out.println("Book has been Deleted Successfully");
        }
        try {

            if (choice < 0 || choice > book.size()) {
                throw new InvalidIndexException();
            }

        } catch (InvalidIndexException e) {
            System.out.println(e.PopUp);
        }
    }

    void borrowBook(String Btit, int stuOrprof) {
        Book current = new Book();
        if (stuOrprof >= 0 && stuOrprof <= 1000) {
            boolean found = false;
            for (int i = 0; i < book.size(); i++) {
                current = book.get(i);
                if (current.title.equals(Btit)) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                if (current.state == true) {
                    if (leftProf > 0) {
                        System.out.print("You have borrowed this booked: ");

                        leftProf--;
                        JOptionPane.showMessageDialog(null, "You have borrowed this book" + "\n" + leftProf + " left to borrow");
                        current.state = false;
                        System.out.println("\nBook Title: " + current.title + "\nBook Author: " + current.author + "\n" + leftProf + " left to borrow");
                    } else {
                        System.out.println("you can't borrow more! ");
                        JOptionPane.showMessageDialog(null, "you can't borrow more!");
                    }
                } else if (current.state == false) {
                    System.out.println("This book is available but borrowed!");
                    JOptionPane.showMessageDialog(null, "This book is available but borrowed!");
                }
            } else {
                System.out.println("This book is not available!");
                JOptionPane.showMessageDialog(null, "This book is not available!");
            }
        } else if (stuOrprof >= 3000 && stuOrprof <= 5000) {

            boolean found = false;
            for (int i = 0; i < book.size(); i++) {
                current = book.get(i);
                if (current.title.equals(Btit)) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                if (current.state == true) {
                    if (leftStud > 0) {
                        System.out.print("You have borrowed this booked: ");
                        leftStud--;
                        JOptionPane.showMessageDialog(null, "You have borrowed this book" + "\n" + leftStud + " left to borrow");
                        current.state = false;
                        System.out.println("\nBook Title: " + current.title + "\nBook Author: " + current.author + "\n" + leftStud + " left to borrow");
                    } else {
                        System.out.println("you can't borrow more! ");
                        JOptionPane.showMessageDialog(null, "you can't borrow more!");
                    }
                } else if (current.state == false) {
                    System.out.println("This book is available but borrowed!");
                    JOptionPane.showMessageDialog(null, "This book is available but borrowed!");
                }
            } else {
                System.out.println("This book is not available!");
                JOptionPane.showMessageDialog(null, "This book is not available!");
            }
        }
    }

    public void ReturnBook(int bookid, int stuOrprof) {

        Book current = new Book();
        if (stuOrprof >= 0 && stuOrprof <= 1000) {
            boolean found = false;
            for (int i = 0; i < book.size(); i++) {
                current = book.get(i);
                if (current.ISBN == bookid) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                if (current.state == true) {
                    System.out.println("This book has already been returned.");
                    JOptionPane.showMessageDialog(null, "This book has already been returned.");
                } else if (current.state == false) {
                    System.out.println("You have returned this Book Successfully!");
                    JOptionPane.showMessageDialog(null, "You have returned this Book Successfully!");
                    Professor.maxPro++;
                    leftProf++;
                    current.state = true;
                }
            } else {
                System.out.println("Book not found!");
                JOptionPane.showMessageDialog(null, "Book not found!");
            }
        } else if (stuOrprof >= 3000 && stuOrprof <= 5000) {
            boolean found = false;
            for (int i = 0; i < book.size(); i++) {
                current = book.get(i);
                if (current.ISBN == bookid) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                if (current.state == true) {
                    System.out.println("This book has already been returned.");
                    JOptionPane.showMessageDialog(null, "This book has already been returned.");
                } else if (current.state == false) {
                    System.out.println("You have returned this Book Successfully");
                    JOptionPane.showMessageDialog(null, "You have returned this Book Successfully!");
                    Student.maxStudent++;
                    leftStud++;
                    current.state = true;
                }
            }
        } else {
            System.out.println("Book not found");
            JOptionPane.showMessageDialog(null, "Book not found!");
        }
    }

    public void writeBookFile() {
        try {
            FileOutputStream fos = new FileOutputStream("Books.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(book);
            oos.close();
            fos.close();
        } catch (Exception ex) {

        }
    }

    public void readBookFile() {
        try {
            FileInputStream fis = new FileInputStream("Books.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Book> book = (ArrayList<Book>) ois.readObject();
            System.out.println(book);
            fis.close();
            ois.close();
        } catch (Exception ex) {

        }
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", state=" + state + '}';
    }

}
