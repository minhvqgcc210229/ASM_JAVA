package View;

import Model.Racket;
import java.awt.Color;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vuong
 */
public class HomePage extends javax.swing.JFrame {
     private List<Racket> List = new ArrayList<>();
     private DefaultTableModel tblModel = new DefaultTableModel();
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        fillTable();
        initTable();
        initData();
    }
    private void fillTable(){
       tblModel.setRowCount(0);
        
        for (Racket racket : List) {
            tblModel.addRow(new Object[]{racket.getID(),racket.getName(),  racket.getAmount(),racket.getPrice()});
        }
        tblModel.fireTableDataChanged();
    }
    private void initData(){
        List.add(new Racket("01","yonex Axtrox 99",15,3900000));
        List.add(new Racket("02","yonex Axtrox 99 pro",20,3990000));
        List.add(new Racket("03","yonex Axtrox 88s",40,2900000));
        List.add(new Racket("04","yonex Axtrox 100zz",10,4300000));
    }
    private void initTable(){
        String[] columns = new String[]{"ID","Name","Amount","Price"};
        
        tblModel.setColumnIdentifiers(columns);
        
        tblRacket.setModel(tblModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRacket = new javax.swing.JTable();
        ftfAmount = new javax.swing.JFormattedTextField();
        ftfPrice = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Badminton racket management");

        jLabel2.setText("ID");

        jLabel3.setText("Name racket");

        jLabel4.setText("Amount");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblRacket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Amount", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRacket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRacketMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRacket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                                    .addComponent(txtID)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ftfPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(ftfAmount, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnAdd)
                        .addGap(39, 39, 39)
                        .addComponent(btnUpdate)
                        .addGap(27, 27, 27)
                        .addComponent(btnDelete)
                        .addGap(43, 43, 43)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ftfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ftfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       StringBuilder sp = new StringBuilder();
       if(txtID.getText().equals("")){
           sp.append("ID can not Empty\n");
           txtID.setBackground(Color.red);
       }else{
           txtID.setBackground(Color.white);
       }
        if(txtName.getText().equals("")){
           sp.append("Name can not Empty\n");
           txtName.setBackground(Color.pink);
       }else{
            txtName.setBackground(Color.white);
        }
        if(sp.length()>0){
            JOptionPane.showMessageDialog(this, sp.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        Racket Racket = new Racket();
        Racket.setID(txtID.getText());
        Racket.setName(txtName.getText());
        Racket.setAmount(Integer.valueOf(ftfAmount.getText()));
        Racket.setPrice(Integer.valueOf(ftfPrice.getText()));
        
        List.add(Racket);
        
        fillTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sp = new StringBuilder();
       if(txtID.getText().equals("")){
           sp.append("ID can not Empty\n");
           txtID.setBackground(Color.red);
       }else{
           txtID.setBackground(Color.white);
       }
        if(txtName.getText().equals("")){
           sp.append("Name can not Empty\n");
           txtName.setBackground(Color.pink);
       }else{
            txtName.setBackground(Color.white);
        }
        if(sp.length()>0){
            JOptionPane.showMessageDialog(this, sp.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        int choice = JOptionPane.showConfirmDialog(this, "Do you Want to Update this option?", "Question", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
        
        for (Racket racket : List) {
            if(racket.getID().equals(txtID.getText())){
                racket.setID(txtID.getText());
                racket.setName(txtName.getText());
                racket.setAmount(Integer.valueOf(ftfAmount.getText()));
                racket.setPrice(Integer.valueOf(ftfPrice.getText()));
                
                break;
            }
        }
        fillTable();
        
        btnResetActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fillTable();
    }//GEN-LAST:event_formWindowOpened

    private void tblRacketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRacketMouseClicked
       int selectedRow = tblRacket.getSelectedRow();
       
       if(selectedRow >= 0){
           String RacketID = (String) tblRacket.getValueAt(selectedRow, 0);
           
           for (Racket racket : List) {
               if(RacketID.equals(racket.getID())){
                   txtID.setText(racket.getID());
                   txtName.setText(racket.getName());
                   ftfAmount.setText(racket.getAmount().toString());
                   ftfPrice.setText(racket.getPrice().toString());
                   break;
               }
           }
       }
    }//GEN-LAST:event_tblRacketMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       txtID.setText("");
       txtName.setText("");
       ftfAmount.setText("");
       ftfPrice.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new HomePage().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JFormattedTextField ftfAmount;
    private javax.swing.JFormattedTextField ftfPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRacket;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}