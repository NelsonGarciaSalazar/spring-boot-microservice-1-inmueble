package com.vaxi.springbootmicroservice1inmueble.controller;

import com.vaxi.springbootmicroservice1inmueble.model.Inmueble;
import com.vaxi.springbootmicroservice1inmueble.service.InmuebleSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inmueble")
public class InmuebleController {

    // Injection by annotation
    @Autowired
    private InmuebleSevice inmuebleSevice;

    // http://localhost:3333/api/inmueble
    @PostMapping
    public ResponseEntity<Inmueble> saveInmueble(@RequestBody Inmueble inmueble){
        return new ResponseEntity<>(inmuebleSevice.saveInmueble(inmueble), HttpStatus.CREATED);
    }

    // http://localhost:3333/api/inmueble/inmueble/1000
    @DeleteMapping("{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long inmuebleId) {
        inmuebleSevice.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // http://localhost:3333/api/inmueble
    @GetMapping
    public ResponseEntity<List<Inmueble>> getAllInmueble(){
        return ResponseEntity.ok(inmuebleSevice.findAllInmueble());
    }
}
