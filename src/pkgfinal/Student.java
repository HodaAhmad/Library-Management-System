/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.Serializable;

public class Student extends LibraryUser implements Serializable{

    static int maxStudent = 3;
    public String year;

    public Student(String year, int ID, String name, String mail) {
        super(ID, name, mail);
        this.year = year;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
