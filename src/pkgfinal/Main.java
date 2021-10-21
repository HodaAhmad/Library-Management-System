package pkgfinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InvalidIndexException, InvalidCharactersException, IOException, ClassNotFoundException
    {
        
        LibraryEmployee liEmp = new LibraryEmployee();
        Book b = new Book();
       

        liEmp.writeFileStudent();
        liEmp.readFileStudent();
        liEmp.writeFileProfessor();
        liEmp.readFileProfeesor();
        
        b.writeBookFile();
        b.readBookFile();
        //liEmp.writeEmployeeFile();
        //liEmp.readEmployeeFile();

    }
}