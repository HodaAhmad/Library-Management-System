/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmployeeLogin extends javax.swing.JFrame {

    public EmployeeLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    Login EL = new Login();
    Add add = new Add();

    Update_Book uppbok = new Update_Book();
    Update_Professor upprof = new Update_Professor();
    Update_Student upStu = new Update_Student();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        searchButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        updaButton = new javax.swing.JButton();
        deleButton = new javax.swing.JButton();
        deleBookButton = new javax.swing.JRadioButton();
        upBookButton = new javax.swing.JRadioButton();
        upStuButton = new javax.swing.JRadioButton();
        searhStudButton = new javax.swing.JRadioButton();
        searBookButton = new javax.swing.JRadioButton();
        searchProfButton1 = new javax.swing.JRadioButton();
        searchID = new javax.swing.JTextField();
        upProfButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleProButton1 = new javax.swing.JRadioButton();
        deleStuButton = new javax.swing.JRadioButton();
        deleSearchID1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        searchButton.setText("Search ");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        AddButton.setText("Add Book / Student / Professor");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        updaButton.setText("Update ");
        updaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaButtonActionPerformed(evt);
            }
        });

        deleButton.setText("Delete");
        deleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(deleBookButton);
        deleBookButton.setText("Book");

        buttonGroup3.add(upBookButton);
        upBookButton.setText("Book");

        buttonGroup3.add(upStuButton);
        upStuButton.setText("Student");

        buttonGroup4.add(searhStudButton);
        searhStudButton.setText("Student");

        buttonGroup4.add(searBookButton);
        searBookButton.setText("Book");

        buttonGroup4.add(searchProfButton1);
        searchProfButton1.setText("Professor");

        searchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDActionPerformed(evt);
            }
        });

        buttonGroup3.add(upProfButton1);
        upProfButton1.setText("Professor");

        jLabel1.setText("Enter the ID/ISBN");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Employee");

        buttonGroup2.add(deleProButton1);
        deleProButton1.setText("Professor");

        buttonGroup2.add(deleStuButton);
        deleStuButton.setText("Student");

        deleSearchID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleSearchID1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter the ID/ISBN");

        jButton1.setText("Return to login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searBookButton)
                                        .addGap(32, 32, 32)
                                        .addComponent(searhStudButton)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(deleProButton1)
                                            .addComponent(searchProfButton1)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleBookButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleSearchID1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(deleStuButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(upBookButton)
                                .addGap(32, 32, 32)
                                .addComponent(upStuButton)
                                .addGap(18, 18, 18)
                                .addComponent(upProfButton1))
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searBookButton)
                        .addComponent(searhStudButton)
                        .addComponent(searchProfButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleBookButton)
                    .addComponent(deleProButton1)
                    .addComponent(deleStuButton)
                    .addComponent(deleSearchID1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upBookButton)
                    .addComponent(upStuButton)
                    .addComponent(upProfButton1))
                .addGap(18, 18, 18)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        int ID;
        int index = 0;
        // search book
        if (this.searBookButton.isSelected()) {
            boolean flag = false;
            ID = Integer.parseInt(this.searchID.getText());
            for (int i = 0; i < EL.bo.book.size(); i++) {
                if (ID == EL.bo.book.get(i).ISBN) {
                    flag = true;
                    index = i;
                }
            }
            if (flag) {
                JOptionPane.showMessageDialog(this, "ISNB: " + EL.bo.book.get(index).ISBN + "\n" + "Name: "
                        + EL.bo.book.get(index).author + "\n" + "Title: " + EL.bo.book.get(index).title + "\n"
                        + "State: " + EL.bo.book.get(index).state, "Book found", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Book not found",
                        "Not found", JOptionPane.ERROR_MESSAGE);
            }
        }
        // search Student
        if (this.searhStudButton.isSelected()) {
            boolean flag = false;
            ID = Integer.parseInt(this.searchID.getText());
            for (int i = 0; i < EL.Emp.student.size(); i++) {
                if (ID == EL.Emp.student.get(i).ID) {
                    flag = true;
                    index = i;
                }
            }
            if (flag) {
                JOptionPane.showMessageDialog(this, "ID: " + EL.Emp.student.get(index).ID + "\n" + "Name: "
                        + EL.Emp.student.get(index).name + "\n" + "Mail: " + EL.Emp.student.get(index).mail,
                        "Student found", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Student not found",
                        "Not found", JOptionPane.ERROR_MESSAGE);
            }
        }
        // search Professor
        if (this.searchProfButton1.isSelected()) {
            boolean flag = false;
            ID = Integer.parseInt(this.searchID.getText());
            for (int i = 0; i < EL.Emp.prof.size(); i++) {
                if (ID == EL.Emp.prof.get(i).ID) {
                    flag = true;
                    index = i;
                }
            }
            if (flag) {
                JOptionPane.showMessageDialog(this, "ID: " + EL.Emp.prof.get(index).ID + "\n" + "Name: "
                        + EL.Emp.prof.get(index).name + "\n" + "Mail: " + EL.Emp.prof.get(index).mail,
                        "Professor found", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Professor not found",
                        "Not found", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaButtonActionPerformed
        // student
        if (this.upStuButton.isSelected()) {
            upStu.setVisible(true);
            this.dispose();
        }
        // professor
        if (this.upProfButton1.isSelected()) {
            upprof.setVisible(true);
            this.dispose();
        }
        // book
        if (this.upBookButton.isSelected()) {
            uppbok.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updaButtonActionPerformed

    private void searchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIDActionPerformed

    private void deleSearchID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleSearchID1ActionPerformed
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleSearchID1ActionPerformed

    private void deleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleButtonActionPerformed
        int ID;
        int index = 0;
        // delete book
        if (this.deleBookButton.isSelected()) {
            boolean flag = false;
            ID = Integer.parseInt(this.deleSearchID1.getText());
            for (int i = 0; i < EL.bo.book.size(); i++) {
                if (ID == EL.bo.book.get(i).ISBN) {
                    flag = true;
                    index = i;
                }
            }
            if (flag) {

                JOptionPane.showMessageDialog(this, EL.bo.book.remove(index) + "\nthe book is delete",
                        "Book deleted", JOptionPane.PLAIN_MESSAGE);
                EL.bo.writeBookFile();
            } else {
                JOptionPane.showMessageDialog(this, "Book not found",
                        "Not found", JOptionPane.ERROR_MESSAGE);
            }
        }
        // delete Student
        if (this.deleStuButton.isSelected()) {
            boolean flag = false;
            ID = Integer.parseInt(this.deleSearchID1.getText());
            for (int i = 0; i < EL.Emp.student.size(); i++) {
                if (ID == EL.Emp.student.get(i).ID) {
                    flag = true;
                    index = i;
                }
            }
            if (flag) {

                JOptionPane.showMessageDialog(this, EL.Emp.student.remove(index) + "\nthe Student is delete",
                        "Book deleted", JOptionPane.PLAIN_MESSAGE);
                try {;                    EL.Emp.writeFileStudent();
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeLogin.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Student not found",
                        "Not found", JOptionPane.ERROR_MESSAGE);
            }
        }
        // delete Professor
        if (this.deleProButton1.isSelected()) {
            boolean flag = false;
            ID = Integer.parseInt(this.deleSearchID1.getText());
            for (int i = 0; i < EL.Emp.prof.size(); i++) {
                if (ID == EL.Emp.prof.get(i).ID) {
                    flag = true;
                    index = i;
                }
            }
            if (flag) {

                JOptionPane.showMessageDialog(this, EL.Emp.prof.remove(index) + "\nthe Student is delete",
                        "Book deleted", JOptionPane.PLAIN_MESSAGE);
                EL.Emp.writeFileProfessor();
            } else {
                JOptionPane.showMessageDialog(this, "Professor not found",
                        "Not found", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        add.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton deleBookButton;
    private javax.swing.JButton deleButton;
    private javax.swing.JRadioButton deleProButton1;
    private javax.swing.JTextField deleSearchID1;
    private javax.swing.JRadioButton deleStuButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton searBookButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchID;
    private javax.swing.JRadioButton searchProfButton1;
    private javax.swing.JRadioButton searhStudButton;
    private javax.swing.JRadioButton upBookButton;
    private javax.swing.JRadioButton upProfButton1;
    private javax.swing.JRadioButton upStuButton;
    private javax.swing.JButton updaButton;
    // End of variables declaration//GEN-END:variables
}
