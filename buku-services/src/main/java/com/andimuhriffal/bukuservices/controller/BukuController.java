/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.bukuservices.controller;

import com.andimuhriffal.bukuservices.entity.Buku;
import com.andimuhriffal.bukuservices.services.BukuService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Acer
 */
@Service
@RequestMapping("/buku")
public class BukuController {
    @Autowired
    private BukuService bukuService;
    
    @PostMapping("/")
    public Buku saveBuku(@RequestBody Buku buku){
        return bukuService.saveBuku(buku);
    }
    @GetMapping("/(id)")
    public Buku findBukuById(@PathVariable("id") Long bukuId){
        return bukuService.findBukuById(bukuId);
    }
    @GetMapping("/")
    public List<Buku> getAllBuku(){
        return bukuService.getAllBuku();
    }
    @PutMapping("")
    public Buku updateBuku(@RequestBody Buku buku){
        return bukuService.updateBuku(buku);
    }
    @DeleteMapping("/(id)")
    public void deleteBukuById(@PathVariable("id") Long bukuId){
        bukuService.deleteBukuById(bukuId);
    }
}
