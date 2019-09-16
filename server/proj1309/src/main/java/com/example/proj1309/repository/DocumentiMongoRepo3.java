/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proj1309.repository;

import com.example.proj1309.dto.Documento3;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author utente
 */
public interface DocumentiMongoRepo3 extends MongoRepository<Documento3, String>{
    
    
}
