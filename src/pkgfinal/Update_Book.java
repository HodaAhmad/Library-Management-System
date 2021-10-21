package pkgfinal;

import java.awt.FileDialog;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Update_Book extends javax.swing.JFrame {

    Login EL = new Login();
    String file = "";

    public Update_Book() {
        initComponents();
        setLocationRelativeTo(null);
    }

    void update(String x) {

        if (x.equals("")) {
            FileDialog fc = new FileDialog(this, "Choose a file", FileDialog.LOAD);
            fc.setVisible(true);
            file = fc.getFile();

        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Book> book = (ArrayList<Book>) ois.readObject();
            System.out.println(book);
            fis.close();
            ois.close();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(book.size());
            int row = 0;
            int col;

            for (Book b : book) {
                col = 0;
                model.setValueAt(b.ISBN, row, col++);
                model.setValueAt(b.author, row, col++);
                model.setValueAt(b.state, row, col++);
                model.setValueAt(b.title, row, col);
                row++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "invalid file",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TitleButton = new javax.swing.JRadioButton();
        AuthorButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        newData = new javax.swing.JTextField();
        ISBNText = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        ISBNButton = new javax.swing.JRadioButton();
        StateButton = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        buttonGroup1.add(TitleButton);
        TitleButton.setText("Title");

        buttonGroup1.add(AuthorButton);
        AuthorButton.setText("Author");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Update Book");

        jTextField4.setEditable(false);
        jTextField4.setText("    Enter the new data");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField5.setEditable(false);
        jTextField5.setText("    Enter the ISBN of the book");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Author", "State", "Title"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButton1.setText("Open file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        buttonGroup1.add(ISBNButton);
        ISBNButton.setText("ISBN");

        buttonGroup1.add(StateButton);
        StateButton.setText("State");
        StateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ISBNText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newData, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleButton)
                                    .addComponent(AuthorButton)
                                    .addComponent(ISBNButton)
                                    .addComponent(StateButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ISBNText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newData)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitleButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ISBNButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AuthorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        update("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

       
        boolean flag = false;
     
        int ID = 0;
        //try catch
        try {
            ID = Integer.parseInt(this.ISBNText.getText());
            for (int i = 0; i < EL.bo.book.size(); i++) {
                if (ID == EL.bo.book.get(i).ISBN) {
                    flag = true;
                    ID = i;
                }
            }
        } catch (NumberFormatException ex) {
            System.err.println("Invalid format");
        }
        if (flag) {
            if (this.TitleButton.isSelected()) {
                String newName = this.newData.getText();
                EL.bo.book.get(ID).title = newName;
                EL.bo.writeBookFile();
                JOptionPane.showMessageDialog(this, newName + " is updated! ",
                        "Update", JOptionPane.INFORMATION_MESSAGE);
                update(file);
            }
            if (this.AuthorButton.isSelected()) {
                String newAuthor = this.newData.getText();
                EL.bo.book.get(ID).author = newAuthor;
                EL.bo.writeBookFile();
                JOptionPane.showMessageDialog(this, newAuthor + " is updated! ",
                        "Update", JOptionPane.INFORMATION_MESSAGE);
                update(file);
            }
            if (this.ISBNButton.isSelected()) {
                int newISBN;
                String newIsbn = this.newData.getText();
                newISBN = Integer.parseInt(newIsbn);
                // try catch
                EL.bo.book.get(ID).ISBN = newISBN;
                EL.bo.writeBookFile();
                JOptionPane.showMessageDialog(this, newISBN + " is updated! ",
                        "Update", JOptionPane.INFORMATION_MESSAGE);
                update(file);
            }
            if (this.StateButton.isSelected()) {
                String newstate = this.newData.getText();
                boolean newState = Boolean.parseBoolean(newstate);
                // try catch
                EL.bo.book.get(ID).state = newState;
                EL.bo.writeBookFile();
                JOptionPane.showMessageDialog(this, newState + " is updated! ",
                        "Update", JOptionPane.INFORMATION_MESSAGE);
                update(file);
            }
        } else {
            JOptionPane.showMessageDialog(this, "you entered invalid ID",
                    "Invalid ID", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void StateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AuthorButton;
    private javax.swing.JRadioButton ISBNButton;
    private javax.swing.JTextField ISBNText;
    private javax.swing.JRadioButton StateButton;
    private javax.swing.JRadioButton TitleButton;
    private javax.swing.JButton Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField newData;
    // End of variables declaration//GEN-END:variables
}
