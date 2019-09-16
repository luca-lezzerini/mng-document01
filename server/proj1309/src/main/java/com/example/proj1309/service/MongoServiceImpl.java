/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proj1309.service;

import com.example.proj1309.dto.Documento1;
import com.example.proj1309.dto.Documento2;
import com.example.proj1309.dto.Documento3;
import com.example.proj1309.repository.DocumentiMongoRepo;
import com.example.proj1309.repository.DocumentiMongoRepo2;
import com.example.proj1309.repository.DocumentiMongoRepo3;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author utente
 */
@Service
public class MongoServiceImpl {
    
    @Autowired
    DocumentiMongoRepo dmr;
    @Autowired
    DocumentiMongoRepo2 dmr2;
    @Autowired
    DocumentiMongoRepo3 dmr3;
    
    
    
    
    public void saveDocumento(Documento1 doc){
        dmr.save(doc);
    }
    
    public void saveDocumento2(Documento2 doc){
        dmr2.save(doc);
    }
    
    public void saveDocumento3(Documento3 doc){
        dmr3.save(doc);
    }
    
    public List<Documento1> getDocumenti(){
        return dmr.findAll();
    }
    
    public List<Documento2> getDocumenti2(){
        return dmr2.findAll();
    }
    
    public List<Documento3> getDocumenti3(){
        return dmr3.findAll();
    }
}
