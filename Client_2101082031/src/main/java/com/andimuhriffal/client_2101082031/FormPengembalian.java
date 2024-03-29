/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.andimuhriffal.client_2101082031;

import com.andimuhriffal.client_2101082031.controller.PengembalianController;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class FormPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form FormPengembalian
     */
    PengembalianController controller;
    public FormPengembalian() {
        initComponents();
        controller = new PengembalianController(this);
        controller.bersihForm();
        controller.viewTabel();
    }

    public JTable getTablePengembalian() {
        return tablePengembalian;
    }

    public JTextField getTxtDenda() {
        return txtDenda;
    }

    public JTextField getTxtIdPeminjaman() {
        return txtIdPeminjaman;
    }

    public JTextField getTxtIdPengembalian() {
        return txtIdPengembalian;
    }

    public JTextField getTxtKembalikan() {
        return txtKembalikan;
    }

    public JTextField getTxtTerlambat() {
        return txtTerlambat;
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
        jLabel5 = new javax.swing.JLabel();
        txtIdPengembalian = new javax.swing.JTextField();
        txtIdPeminjaman = new javax.swing.JTextField();
        txtKembalikan = new javax.swing.JTextField();
        txtTerlambat = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePengembalian = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Id Pengembalian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 100, 16);

        jLabel2.setText("Id Peminjaman");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 100, 16);

        jLabel3.setText("Tgl di Kembalikan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 110, 16);

        jLabel4.setText("Terlambat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 90, 16);

        jLabel5.setText("Denda");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 100, 16);

        txtIdPengembalian.setText("jTextField1");
        getContentPane().add(txtIdPengembalian);
        txtIdPengembalian.setBounds(140, 20, 150, 22);

        txtIdPeminjaman.setText("jTextField2");
        getContentPane().add(txtIdPeminjaman);
        txtIdPeminjaman.setBounds(140, 50, 150, 22);

        txtKembalikan.setText("jTextField3");
        getContentPane().add(txtKembalikan);
        txtKembalikan.setBounds(140, 80, 150, 22);

        txtTerlambat.setText("jTextField4");
        getContentPane().add(txtTerlambat);
        txtTerlambat.setBounds(140, 110, 150, 22);

        txtDenda.setText("jTextField5");
        getContentPane().add(txtDenda);
        txtDenda.setBounds(140, 140, 150, 22);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(400, 20, 72, 22);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan);
        btnSimpan.setBounds(20, 190, 72, 22);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(120, 190, 72, 22);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(220, 190, 72, 22);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(320, 190, 72, 22);

        tablePengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Pengembalian", "Id Peminjaman", "Tgl di Kembalikan", "Terlambat", "Denda"
            }
        ));
        jScrollPane1.setViewportView(tablePengembalian);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 480, 220);

        setSize(new java.awt.Dimension(591, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        controller.getPengembalianId();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        controller.savePengembalian();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.updatePengembalian();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controller.deletePengembalian();
        controller.viewTabel();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.bersihForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePengembalian;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JTextField txtIdPengembalian;
    private javax.swing.JTextField txtKembalikan;
    private javax.swing.JTextField txtTerlambat;
    // End of variables declaration//GEN-END:variables
}
