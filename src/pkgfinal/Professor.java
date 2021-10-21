/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.Serializable;

public class Professor extends LibraryUser implements Serializable {

    static int maxPro = 5;

    public Professor(int ID, String name, String mail) {
        super(ID, name, mail);
    }

    public int getMaxPro() {
        return maxPro;
    }

    public void setMaxPro(int maxPro) {
        this.maxPro = maxPro;
    }

    
}
