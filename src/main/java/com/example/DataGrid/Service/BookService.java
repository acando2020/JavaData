/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DataGrid.Service;
import java.util.List;

import com.example.DataGrid.Model.Libro;
import com.example.DataGrid.Repository.RBook;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    @Autowired
    private RBook repositoryBook;
    
    public Libro create(Libro libro){
        return repositoryBook.save(libro);
    }
    
    public List<Libro> getAllLibros(){
        return repositoryBook.findAll();
    }
    
    public void delete(Libro libro){
        repositoryBook.delete(libro);
    }
    
    
     public Optional<Libro> findById(Long id){
        return repositoryBook.findById(id);
    }
}
