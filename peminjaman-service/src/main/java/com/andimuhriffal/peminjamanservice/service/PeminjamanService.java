/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.peminjamanservice.service;

import com.andimuhriffal.peminjamanservice.entity.Peminjaman;
import com.andimuhriffal.peminjamanservice.repository.PeminjamanRepository;
import com.andimuhriffal.peminjamanservice.vo.Anggota;
import com.andimuhriffal.peminjamanservice.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Andi Muhammad Riffal
 */
@Service
public class PeminjamanService {
    @Autowired
    private PeminjamanRepository peminjamanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Peminjaman savePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    
    public ResponseTemplateVO getPeminjaman(Long peminjamanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Peminjaman peminjaman = 
                peminjamanRepository.findByPeminjamanId(peminjamanId);
        Anggota anggota = 
        restTemplate.getForObject("http://localhost:8080/anggota/"
                + peminjaman.getAnggotaId(), Anggota.class);
        vo.setPeminjaman(peminjaman);
        vo.setAnggota(anggota); 
        return vo;
    }
    
}
