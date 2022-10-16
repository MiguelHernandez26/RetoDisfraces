package com.example.RetoDisfraces.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RetoDisfraces.entities.Cloud;
import com.example.RetoDisfraces.services.CloudService;

@Service
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/Cloud")
public class CloudController {
    
    @Autowired
    CloudService cloudService;

    public CloudController(CloudService cloudService){
        this.cloudService = cloudService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Cloud>> getClouds(){
        return new ResponseEntity<List<Cloud>>(this.cloudService.getListClouds(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cloud> getCloud(@PathVariable("id") int id){
        return new ResponseEntity<Cloud>(this.cloudService.getCloud(id), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Void> crearCloud(@RequestBody Cloud cloud){
        this.cloudService.crearCloud(cloud);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCloud(@PathVariable("id") int id){
        this.cloudService.eliminarCloud(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/update")
    public ResponseEntity<Void> actualizarCloud(@RequestBody Cloud cloud){
        this.cloudService.actualizarCloud(cloud.getId(), cloud);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
