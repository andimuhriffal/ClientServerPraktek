/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.client_2101082031.service;

import com.andimuhriffal.client_2101082031.model.Peminjaman;
import com.google.gson.Gson;
import java.util.List;
import kong.unirest.GenericType;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 *
 * @author Acer
 */
public class PeminjamanService {
    private final String URL = "http://localhost:5000";
    
    public Peminjaman getPeminjaman(Long peminjamanId){
        Peminjaman peminjaman = Unirest.get(URL+"/peminjaman/"+peminjamanId)
                .asObject(Peminjaman.class)
                .getBody();
        if(peminjaman!=null){
            return peminjaman;
        }
        return null;
    }
    
    public Peminjaman savePeminjaman(Peminjaman peminjaman){
        HttpResponse<JsonNode> response = Unirest.post(URL + "/peminjaman/")
                .header("content-type", "application/json")
                .body(peminjaman)
                .asJson();
        Gson gson = new Gson();
        Peminjaman a = gson.fromJson(response.getBody().toString(), Peminjaman.class);
        return a;
    }
    
    public List<Peminjaman> getAllPeminjaman(){
        List<Peminjaman> peminjamanList = Unirest.get(URL + "/peminjaman/")
                .asObject(new GenericType<List<Peminjaman>>(){})
                .getBody();
        return peminjamanList;
    }
    
    public Peminjaman updatePeminjaman(Peminjaman peminjaman){
        HttpResponse<JsonNode> response = Unirest.put(URL + "/peminjaman/")
                .header("content-type", "application/json")
                .body(peminjaman)
                .asJson();
        Gson gson = new Gson();
        Peminjaman a = gson.fromJson(response.getBody().toString(), Peminjaman.class);
        return a;
    }
    
    public void deletePeminjaman(Long peminjamanId){
        Unirest.delete(URL + "/peminjaman/"+peminjamanId).asEmpty();
    }
}
