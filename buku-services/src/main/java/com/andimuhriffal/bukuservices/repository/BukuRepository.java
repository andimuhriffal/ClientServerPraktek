/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.bukuservices.repository;

import com.andimuhriffal.bukuservices.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Acer
 */
public interface BukuRepository extends JpaRepository<Buku, Long> {
    public Buku findByBukuId(Long bukuId);

    public void deleteById(Long bukuId);
}



