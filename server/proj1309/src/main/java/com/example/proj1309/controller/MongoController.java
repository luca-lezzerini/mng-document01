/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proj1309.controller;

import com.example.proj1309.dto.Documento1;
import com.example.proj1309.dto.Documento2;
import com.example.proj1309.dto.Documento3;
import com.example.proj1309.service.MongoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author utente
 */
@CrossOrigin("*")
@RestController
public class MongoController {
    
    @Autowired
    private MongoServiceImpl service;
    
    @PostMapping("/insertDoc")
    public void insertDoc(@RequestBody Documento1 doc){
        service.saveDocument(doc);
    }
    
    @RequestMapping("/insertDoc1")
    public void insertDoc1(@RequestBody Documento1 doc){
        service.saveDocumento1(doc);
    }
    
    @RequestMapping("/insertDoc3")
    public void insertDoc3(@RequestBody Documento3 doc){
        service.saveDocumento3(doc);
    }
    
    @RequestMapping("/insertDoc2")
    public void insertDoc2(@RequestBody Documento2 doc){
        service.saveDocumento2(doc);
    }
    
    @RequestMapping("/getDoc1")
    public List<Documento1> getDoc1(){
        return service.getDocumenti1();
    }
    
    @RequestMapping("/getDoc2")
    public List<Documento2> getDoc2(){
        return  service.getDocumenti2();
    }
    
    @RequestMapping("/getDoc3")
    public List<Documento3> getDoc3(){
        return  service.getDocumenti3();
    }
}
