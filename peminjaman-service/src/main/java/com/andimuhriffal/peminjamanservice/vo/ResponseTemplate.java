/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.peminjamanservice.vo;

import com.andimuhriffal.peminjamanservice.entity.Peminjaman;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author Andi Muhammad Riffal
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
    private Anggota anggota;
    private Buku buku;
    private Peminjaman peminjaman;

}
