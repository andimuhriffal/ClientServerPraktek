/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.bukuservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Acer
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buku {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bukuId;
    private String kode;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahunTerbit;

}
