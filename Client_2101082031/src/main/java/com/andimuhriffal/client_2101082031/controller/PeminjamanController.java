/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.client_2101082031.controller;

import com.andimuhriffal.client_2101082031.FormPeminjaman;
import com.andimuhriffal.client_2101082031.model.Peminjaman;
import com.andimuhriffal.client_2101082031.service.PeminjamanService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class PeminjamanController {
    private final PeminjamanService peminjamanService;
    private final FormPeminjaman formPeminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanService = new PeminjamanService();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtIdPeminjaman().setText("");
        formPeminjaman.getTxtIdAnggota().setText("");
        formPeminjaman.getTxtIdBuku().setText("");
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void getPeminjamanId(){
        Long id = Long.parseLong(formPeminjaman.getTxtIdPeminjaman().getText());
        Peminjaman peminjaman = peminjamanService.getPeminjaman(id);
        if(peminjaman!=null){
            formPeminjaman.getTxtIdAnggota().setText(peminjaman.getAnggotaId().toString());
            formPeminjaman.getTxtIdBuku().setText(peminjaman.getAnggotaId().toString());
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglkembali());
        }else{
            JOptionPane.showMessageDialog(formPeminjaman, "Data Tidak Ada");
        }
    }
    
    public void savePeminjaman(){
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjaman = peminjamanService.savePeminjaman(peminjaman);
        if(peminjaman != null){
            formPeminjaman.getTxtIdPeminjaman().setText(peminjaman.getPeminjamanId().toString());
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Gagal");
        }
    }
    
    public void updatePeminjaman(){
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setPeminjamanId(Long.parseLong(formPeminjaman.getTxtIdPeminjaman().getText()));
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        if(peminjaman!= null){
            formPeminjaman.getTxtIdPeminjaman().setText(peminjaman.getPeminjamanId().toString());
            JOptionPane.showMessageDialog(formPeminjaman, "Update Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPeminjaman, "Update Data Gagal");
        }
    }
    
    public void deletePeminjaman(){
        Long id = Long.parseLong(formPeminjaman.getTxtIdPeminjaman().getText());
        peminjamanService.deletePeminjaman(id);
        JOptionPane.showMessageDialog(formPeminjaman, "Delete Data Berhasil");
    }
    
    public void viewTabel(){
        DefaultTableModel tableModel = (DefaultTableModel)
                formPeminjaman.getTablePeminjaman().getModel();
        tableModel.setRowCount(0);
        List<Peminjaman> peminjamanList =peminjamanService.getAllPeminjaman();
        for (Peminjaman peminjaman : peminjamanList){
            Object[] row = {
                peminjaman.getBukuId(),
                peminjaman.getAnggotaId(),
                peminjaman.getBukuId(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali(),
            };
            tableModel.addRow(row);
        }
    }
}
