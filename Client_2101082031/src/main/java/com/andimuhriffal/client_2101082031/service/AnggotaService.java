/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.client_2101082031.service;

import com.andimuhriffal.client_2101082031.model.Anggota;
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
public class AnggotaService {
    private String URL = "http://localhost:4000";
    
    public Anggota getAnggota(Long anggotaId){
        Anggota anggota = Unirest.get(URL+"/anggota/"+anggotaId)
                .asObject(Anggota.class)
                .getBody();
        if(anggota!=null){
            return anggota;
        }
        return null;
    }
    
    public Anggota saveAnggota(Anggota anggota){
        HttpResponse<JsonNode> response = Unirest.post(URL + "/anggota/")
                .header("content-type", "application/json")
                .body(anggota)
                .asJson();
        Gson gson = new Gson();
        Anggota a = gson.fromJson(response.getBody().toString(), Anggota.class);
        return a;
    }
    
    public List<Anggota> getAllAnggota(){
        List<Anggota> anggotaList = Unirest.get(URL + "/anggota/")
                .asObject(new GenericType<List<Anggota>>(){})
                .getBody();
        return anggotaList;
    }
    
    public Anggota updateAnggota(Anggota anggota){
        HttpResponse<JsonNode> response = Unirest.put(URL + "/anggota/")
                .header("content-type", "application/json")
                .body(anggota)
                .asJson();
        Gson gson = new Gson();
        Anggota a = gson.fromJson(response.getBody().toString(), Anggota.class);
        return a;
    }
    
    public void deleteAnggota(Long anggotaId){
        Unirest.delete(URL + "/anggota/"+anggotaId).asEmpty();
    }
}
