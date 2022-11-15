/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.pengembalianservice.repository;

import com.andimuhriffal.pengembalianservice.entity.Pengembalian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andi Muhammad Riffal
 */
@Repository
public interface PengembalianRepository extends JpaRepository<Pengembalian, Long> {

    public Pengembalian findByPengembalianId(Long pengembalianId);

}
