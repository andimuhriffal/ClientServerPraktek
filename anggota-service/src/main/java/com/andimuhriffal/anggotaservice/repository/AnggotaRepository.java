/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.anggotaservice.repository;

import com.andimuhriffal.anggotaservice.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andi Muhammad Riffal
 */
@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, Long> {

    public Anggota findByAnggotaId(Long anggotaId);
    
}
