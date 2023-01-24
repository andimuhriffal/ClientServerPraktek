/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.client_2101082031.controller;

import com.andimuhriffal.client_2101082031.FormPengembalian;
import com.andimuhriffal.client_2101082031.model.Pengembalian;
import com.andimuhriffal.client_2101082031.service.PengembalianService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class PengembalianController {
    private final PengembalianService pengembalianService;
    private final FormPengembalian formPengembalian;
    
    public PengembalianController(FormPengembalian formPengembalian){
        this.formPengembalian = formPengembalian;
        pengembalianService = new PengembalianService();
    }
    
    public void bersihForm(){
        formPengembalian.getTxtIdPengembalian().setText("");
        formPengembalian.getTxtIdPeminjaman().setText("");
        formPengembalian.getTxtKembalikan().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtDenda().setText("");
    }
    
    public void getPengembalianId(){
        Long id = Long.parseLong(formPengembalian.getTxtIdPengembalian().getText());
        Pengembalian pengembalian = pengembalianService.getPengembalian(id);
        if(pengembalian!=null){
            formPengembalian.getTxtIdPeminjaman().setText(pengembalian.getPeminjamanId().toString());
            formPengembalian.getTxtKembalikan().setText(pengembalian.getTglDikembalikan());
        }else{
            JOptionPane.showMessageDialog(formPengembalian, "Data Tidak Ada");
        }
    }
    
    public void savePengembalian(){
        Pengembalian pengembalian = new Pengembalian();
        pengembalian.setTglDikembalikan(formPengembalian.getTxtKembalikan().getText());
        pengembalian = pengembalianService.savePengembalian(pengembalian);
        if(pengembalian != null){
            formPengembalian.getTxtIdPengembalian().setText(pengembalian.getPengembalianId().toString());
            JOptionPane.showMessageDialog(formPengembalian, "Entri Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPengembalian, "Entri Data Gagal");
        }
    }
    
    public void updatePengembalian(){
        Pengembalian pengembalian = new Pengembalian();
        pengembalian.setPengembalianId(Long.parseLong(formPengembalian.getTxtIdPengembalian().getText()));
        pengembalian.setTglDikembalikan(formPengembalian.getTxtKembalikan().getText());
        if(pengembalian!= null){
            formPengembalian.getTxtIdPengembalian().setText(pengembalian.getPengembalianId().toString());
            JOptionPane.showMessageDialog(formPengembalian, "Update Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPengembalian, "Update Data Gagal");
        }
    }
    
    public void deletePengembalian(){
        Long id = Long.parseLong(formPengembalian.getTxtIdPengembalian().getText());
        pengembalianService.deletePengembalian(id);
        JOptionPane.showMessageDialog(formPengembalian, "Delete Data Berhasil");
    }
    
    public void viewTabel(){
        DefaultTableModel tableModel = (DefaultTableModel)
                formPengembalian.getTablePengembalian().getModel();
        tableModel.setRowCount(0);
        List<Pengembalian> pengembalianList =pengembalianService.getAllPengembalian();
        for (Pengembalian pengembalian : pengembalianList){
            Object[] row = {
                pengembalian.getPengembalianId(),
                pengembalian.getPeminjamanId(),
                pengembalian.getTglDikembalikan(),
                pengembalian.getTerlambat(),
                pengembalian.getDenda(),
            };
            tableModel.addRow(row);
        }
    }
}
