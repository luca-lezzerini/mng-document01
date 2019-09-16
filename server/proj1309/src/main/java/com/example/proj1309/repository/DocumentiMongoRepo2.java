/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.proj1309.repository;

import com.example.proj1309.dto.Documento2;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author utente
 */
public interface DocumentiMongoRepo2 extends MongoRepository<Documento2, String>{
    
    
}
