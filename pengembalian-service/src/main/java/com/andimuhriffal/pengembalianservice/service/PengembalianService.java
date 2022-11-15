/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.pengembalianservice.service;

import com.andimuhriffal.pengembalianservice.entity.Pengembalian;
import com.andimuhriffal.pengembalianservice.repository.PengembalianRepository;
import com.andimuhriffal.pengembalianservice.vo.Peminjaman;
import com.andimuhriffal.pengembalianservice.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Andi Muhammad Riffal
 */
@Service
public class PengembalianService {
     @Autowired
    private PengembalianRepository pengembalianRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Pengembalian savePengembalian(Pengembalian pengembalian){
        return pengembalianRepository.save(pengembalian);
    }
    
    public ResponseTemplateVO getPengembalian(Long pengembalianId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Pengembalian pengembalian = 
                pengembalianRepository.findByPengembalianId(pengembalianId);
        Peminjaman peminjaman = 
        restTemplate.getForObject("http://localhost:8083/peminjaman/"
                + pengembalian.getPeminjamanId(), Peminjaman.class);
        vo.setPengembalian(pengembalian);
        vo.setPeminjaman(peminjaman); 
        return vo;
    }
    
}
