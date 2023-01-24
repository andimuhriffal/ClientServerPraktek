/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.client_2101082031.controller;

import com.andimuhriffal.client_2101082031.FormBuku;
import com.andimuhriffal.client_2101082031.model.Buku;
import com.andimuhriffal.client_2101082031.service.BukuService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class BukuController {
    private BukuService bukuService;
    private FormBuku formBuku;
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuService = new BukuService();
    }
    
    public void bersihForm(){
        formBuku.getTxtIdBuku().setText("");
        formBuku.getTxtKode().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtTahun().setText("");
    }
    
    public void getBukuId(){
        Long id = Long.parseLong(formBuku.getTxtIdBuku().getText());
        Buku buku = bukuService.getBuku(id);
        if(buku!=null){
            formBuku.getTxtKode().setText(buku.getKode());
            formBuku.getTxtJudul().setText(buku.getJudul());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            formBuku.getTxtTahun().setText(buku.getTahun());
        }else{
            JOptionPane.showMessageDialog(formBuku, "Data Tidak Ada");
        }
    }
    
    public void saveBuku(){
        Buku buku = new Buku();
        buku.setKode(formBuku.getTxtKode().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        buku = bukuService.saveBuku(buku);
        if(buku != null){
            formBuku.getTxtIdBuku().setText(buku.getBukuId().toString());
            JOptionPane.showMessageDialog(formBuku, "Entri Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formBuku, "Entri Data Gagal");
        }
    }
    
    public void updateBuku(){
        Buku buku = new Buku();
        buku.setBukuId(Long.parseLong(formBuku.getTxtIdBuku().getText()));
        buku.setKode(formBuku.getTxtKode().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        if(buku!= null){
            formBuku.getTxtIdBuku().setText(buku.getBukuId().toString());
            JOptionPane.showMessageDialog(formBuku, "Update Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formBuku, "Update Data Gagal");
        }
    }
    
    public void deleteBuku(){
        Long id = Long.parseLong(formBuku.getTxtIdBuku().getText());
        bukuService.deleteBuku(id);
        JOptionPane.showMessageDialog(formBuku, "Delete Data Berhasil");
    }
    
    public void viewTabel(){
        DefaultTableModel tableModel = (DefaultTableModel)
                formBuku.getTableBuku().getModel();
        tableModel.setRowCount(0);
        List<Buku> bukuList =bukuService.getAllBuku();
        for (Buku buku : bukuList){
            Object[] row = {
                buku.getBukuId(),
                buku.getKode(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit(),
                buku.getTahun(),
            };
            tableModel.addRow(row);
        }
    }
}
