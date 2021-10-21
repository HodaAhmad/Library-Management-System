package pkgfinal;

import java.io.EOFException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryEmployee extends LibraryUser implements Serializable {

    ArrayList<Professor> prof = new ArrayList<>();
    ArrayList<Student> student = new ArrayList<>();
    ArrayList<LibraryEmployee> libEmp = new ArrayList<>();

    public LibraryEmployee(ArrayList<LibraryEmployee> libEmp, ArrayList<Professor> prof,
            ArrayList<Student> student, int ID, String name, String mail, ArrayList<Book> book) {
        super(ID, name, mail);
        this.prof = prof;
        this.student = student;
        this.libEmp = libEmp;
    }

    public LibraryEmployee(int id, String Name, String Mail) {
        this.ID = id;
        this.name = Name;
        this.mail = Mail;
    }

    public LibraryEmployee() {
        libEmp.add(new LibraryEmployee(10000, "Amr", "Amr1000@bue.edu.eg"));
        libEmp.add(new LibraryEmployee(10001, "Omar", "Omar10001@bue.edu.eg"));
        libEmp.add(new LibraryEmployee(10002, "Mai", "Mai10002@bue.edu.eg"));
        libEmp.add(new LibraryEmployee(10003, "Hoda", "Hoda10003@bue.edu.eg"));

        student.add(new Student("One", 3001, "Hoda Anis", "Hoda@bue.edu.eg"));
        student.add(new Student("Two", 3002, "Mai Ezzat", "Mai@bue.edu.eg"));
        student.add(new Student("Graduate", 3003, "Amr Ali", "Amr@bue.edu.eg"));
        student.add(new Student("Three", 3004, "Omar Sayed", "Omar@bue.edu.eg"));
        student.add(new Student("Two", 3005, "Mostafa Ahmad", "Mostafa@bue.edu.eg"));

        prof.add(new Professor(1, "Mostafa Haytham", "Mostafa@bue.edu.eg"));
        prof.add(new Professor(2, "Asmaa Ali", "Asmaa@bue.edu.eg"));
        prof.add(new Professor(3, "Ghada Mostafa", "Ghada@bue.edu.eg"));
        prof.add(new Professor(4, "Ahmad Saeed", "Ahmad@bue.edu.eg"));
        prof.add(new Professor(5, "Seif Mobasher", "Seif@bue.edu.eg"));
    }

    public void setProf(ArrayList<Professor> prof) {
        this.prof = prof;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public void setLibEmp(ArrayList<LibraryEmployee> libEmp) {
        this.libEmp = libEmp;
    }

    public ArrayList<Professor> getProf() {
        return prof;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public ArrayList<LibraryEmployee> getLibEmp() {
        return libEmp;
    }

    void ListUser() {
        System.out.println(toString());
    }

    @Override
    public String toString() {

        System.out.println("Students: \n");
        System.out.println("--------------");
        for (int i = 0; i < student.size(); i++) {
            System.out.println("Student Name: " + student.get(i).name
                    + "\nStudent ID: " + student.get(i).ID + "\nStudent Mail: "
                    + student.get(i).mail + "\nStudent Year: " + student.get(i).year);
        }

        System.out.println("Professors: \n");
        System.out.println("--------------");
        for (int i = 0; i < prof.size(); i++) {
            System.out.println("Professor Name: " + prof.get(i).name
                    + "\nProfessor ID: " + prof.get(i).ID + "\nProfessor Mail: "
                    + prof.get(i).mail);
        }
        return "End of users.";
    }

    public boolean SearchUser(int UserId) {
        boolean found = false;
        int i = 0;
        if (UserId >= 0 && UserId <= 1000) {
            for (i = 0; i < prof.size(); i++) {
                if (prof.get(i).ID == UserId) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("professor name: " + prof.get(i).name + "\n  ID: " + prof.get(i).ID + " \n His/Her Email is "
                        + prof.get(i).mail);
                return true;

            } else {
                System.out.println("This ID is not found!");
            }
            return false;
        } else if (UserId >= 3000 && UserId <= 5000) {
            for (i = 0; i < student.size(); i++) {
                if (student.get(i).ID == UserId) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Student name: " + student.get(i).name
                        + "\n ID: " + student.get(i).ID + " \n His/Her Email is "
                        + student.get(i).mail + "\n Student Year: " + student.get(i).year);
                return true;
            } else {
                System.out.println("This ID is not found!");
            }
            return false;
        }
        return false;
    }

    public void UpdateUser(char choice) {
        int chosenID; // student or prof ID
        boolean x = true;
        Scanner input = new Scanner(System.in);
        while (x) {
            switch (choice) {
                // student start 
                case 'S':
                case 's':
                    int stuIndex = 0;
                    System.out.println("Enter the Student ID: ");
                    chosenID = input.nextInt();
                    for (int i = 0; i < student.size(); i++) {
                        if (student.get(i).ID == chosenID) {
                            stuIndex = i;
                        }
                    }
                    if (student.get(stuIndex).ID != chosenID) {
                        System.out.println("Not avilable.");
                        x = false;
                    } else if (student.get(stuIndex).ID == chosenID) {
                        System.out.println("enter 1 to change the name, 2 to change Email. ");
                        int m; // name or Mail
                        m = input.nextInt();
                        switch (m) {
                            case 1:
                                String newName;
                                System.out.println("this is the current name: " + student.get(stuIndex).name);
                                System.out.print("Enter the new name: ");
                                input.nextLine();
                                newName = input.nextLine();
                                student.get(stuIndex).name = newName;
                                System.out.println("this is the updated informaiton:\n"
                                        + "Name: " + student.get(stuIndex).name + "\nID:  " + student.get(stuIndex).ID
                                        + "\nMail: " + student.get(stuIndex).mail);
                                x = false;
                                break;
                            case 2:
                                String newMail;
                                System.out.println("this is the current Mail: " + student.get(stuIndex).mail);
                                System.out.print("Enter the new Mail: ");
                                input.nextLine();
                                newMail = input.nextLine();
                                student.get(stuIndex).mail = newMail;
                                System.out.println("this is the updated informaiton:\n"
                                        + "Name: " + student.get(stuIndex).name + "\nID:  " + student.get(stuIndex).ID
                                        + "\nMail: " + student.get(stuIndex).mail);
                                x = false;
                                break;
                            default:
                                System.out.println(" invalid input. ");
                        }
                        break;
                    }
                // student end
                //----------------------------------------------
                case 'P':   // professor start
                case 'p':
                    int profIndex = 0;
                    System.out.println("Enter the Professor ID: ");
                    chosenID = input.nextInt();
                    for (int i = 0; i < prof.size(); i++) {
                        if (prof.get(i).ID == chosenID) {
                            profIndex = i;
                        }
                    }
                    if (prof.get(profIndex).ID != chosenID) {
                        System.out.println("Not avilable.");
                    } else if (prof.get(profIndex).ID == chosenID) {
                        System.out.println("enter 1 to change the name, 2 to change Email. ");
                        int m; // name or Mail
                        m = input.nextInt();
                        switch (m) {
                            case 1:
                                String newName;
                                System.out.println("this is the current name: " + prof.get(profIndex).name);
                                System.out.print("Enter the new name: ");
                                input.nextLine();
                                newName = input.nextLine();
                                prof.get(profIndex).name = newName;
                                System.out.println("this is the new informaiton:\nName: "
                                        + prof.get(profIndex).name + "\nID:  " + prof.get(profIndex).ID
                                        + "\nMail: " + prof.get(profIndex).mail);
                                x = false;
                                break;
                            case 2:
                                String newMail;
                                System.out.println("this is the current Mail: " + prof.get(profIndex).mail);
                                System.out.print("Enter the new Mail: ");
                                input.nextLine();
                                newMail = input.nextLine();
                                prof.get(profIndex).mail = newMail;
                                System.out.println("this is the new informaiton:\nName: "
                                        + prof.get(profIndex).name + "\nID:  " + prof.get(profIndex).ID
                                        + "\nMail: " + prof.get(profIndex).mail);
                                x = false;
                                break;
                            default:
                                System.out.println(" invalid input. ");
                        }
                    }
            }// professor end
        }

    }

    public void DeleteUser(int UserId) {
        int indx = 0;
        int choice;
        Scanner input = new Scanner(System.in);
        if (UserId >= 0 && UserId <= 1000) {
            for (int i = 0; i < prof.size(); i++) {
                if (prof.get(i).ID == UserId) {
                    System.out.println("Professor ID:  " + prof.get(i).ID + "\nProfessor name: " + prof.get(i).name + "\nEmail: " + prof.get(i).mail);
                    indx = i;
                }
            }
            System.out.println("If you want to delete the account enter 1 if not enter anything. ");
            choice = input.nextInt();
            if (choice == 1) {
                prof.remove(indx);
                System.out.println("User deleted Successfully");
            } else {
                System.out.println("Nothing is deleted :)");

            }
        } else if (UserId >= 3000 && UserId <= 5000) {
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).ID == UserId) {
                    System.out.println("Student name is " + student.get(i).name + " \nHis/her Email is " + student.get(i).mail + "\nYear: " + student.get(i).getYear());
                    indx = i;
                }
            }
            System.out.println("If you want to delete the account enter 1 if not enter anything. ");
            choice = input.nextInt();
            if (choice == 1) {
                student.remove(indx);
                System.out.println("User deleted Successfully");

            } else {
                System.out.println("Nothing is deleted :)");
            }
        }
    }

    public void writeFileStudent() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("Student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public void readFileStudent() {
        try {

            FileInputStream fis = new FileInputStream("Student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Student> stu = (ArrayList<Student>) ois.readObject();
            System.out.println(stu);
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public void writeFileProfessor() {
        try {
            FileOutputStream fos = new FileOutputStream("Professor.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(prof);
            oos.close();
            fos.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void readFileProfeesor() throws FileNotFoundException, IOException, ClassNotFoundException {
        try {

            FileInputStream fis = new FileInputStream("Professor.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Professor> pro = (ArrayList<Professor>) ois.readObject();
            System.out.println(pro);
            fis.close();
            ois.close();
        } catch (EOFException ex) {
            System.out.println(ex);
        }
    }

    public void readEmployeeFile() {
        try {
            FileInputStream finS = new FileInputStream("employees.txt");
            ObjectInputStream pis = new ObjectInputStream(finS);
            System.out.println(pis.readObject());
            pis.close();
            finS.close();
        } catch (Exception ex) {

        }
    }

    public void writeEmployeeFile() {
        try {
            FileOutputStream foutS = new FileOutputStream("employees.txt");
            ObjectOutputStream pos = new ObjectOutputStream(foutS);
            pos.writeObject(libEmp);
            pos.close();
            foutS.close();

        } catch (Exception ex) {

        }
    }

}
