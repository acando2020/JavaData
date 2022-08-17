/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DataGrid.rest;
import com.example.DataGrid.Model.Libro;
import com.example.DataGrid.Repository.RBook;
import com.example.DataGrid.Service.BookService;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;


@RestController
@RequestMapping("/api/libro/")
public class DataGridREST {
    @Autowired
    private BookService bookService;
    
    @Autowired
    private RBook repositoryBook;
    
    @PostMapping
    private ResponseEntity<Libro> guardar(@RequestBody Libro libro){
        Libro temporal = bookService.create(libro);
        try {
            return ResponseEntity.created(new URI("/api/libro"+temporal.getId())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    @GetMapping("/books")
    Page<Libro> ListarTodosLibros(@RequestParam Optional<Integer> page, @RequestParam Optional<String> sortBy, @RequestParam Optional<String> sorttype, @RequestParam Optional<Integer> size){
        String order = sorttype.orElse("ASC");
        if (order.equals("desc")){
            return repositoryBook.findAll(
                    PageRequest.of(
                            page.orElse(0),
                            size.orElse(5),
                            Sort.Direction.DESC, sortBy.orElse("id")
                    )               
            );
        }else{
            return repositoryBook.findAll(
                    PageRequest.of(
                            page.orElse(0),
                            size.orElse(5),
                            Sort.Direction.ASC, sortBy.orElse("id")
                    )               
            );
        }
    }
    
   /* @GetMapping("/books")
    private ResponseEntity<List<Libro>> ListarTodosLibros(){
        return ResponseEntity.ok(bookService.getAllLibros());
    }*/
    
    @DeleteMapping
    private ResponseEntity<Void> EliminarLibro(@RequestBody Libro libro){
        bookService.delete(libro);
        return ResponseEntity.ok().build();
    }
    
    
    @GetMapping(value="{id}")
    private ResponseEntity<Optional<Libro>> ListarLibro(@PathVariable("id") Long id){
        return ResponseEntity.ok(bookService.findById(id));
    }
}
