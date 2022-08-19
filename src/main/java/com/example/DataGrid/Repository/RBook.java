/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DataGrid.Repository;

import com.example.DataGrid.Model.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RBook extends JpaRepository<Libro, Long>{
    List<Libro> findByNamebookContaining(String namebook);
}
