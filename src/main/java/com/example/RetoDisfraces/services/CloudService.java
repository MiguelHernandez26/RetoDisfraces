package com.example.RetoDisfraces.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RetoDisfraces.entities.Cloud;
import com.example.RetoDisfraces.repositories.CloudRepository;

@Service
public class CloudService {
    @Autowired
    private CloudRepository cloudRepository;

    public CloudService(CloudRepository cloudRepository){
        this.cloudRepository = cloudRepository;
    }

    public List<Cloud> getListClouds(){
        return this.cloudRepository.findAll();
    }
    public Cloud getCloud(int id){
        if(!this.cloudRepository.findById(id).isEmpty()){
            return this.cloudRepository.findById(id).get();
        }else{
            return null;
        }
    }
    public Cloud crearCloud(Cloud cloud){
        return this.cloudRepository.save(cloud);
    }
    public void eliminarCloud(int id){
        if(!this.cloudRepository.findById(id).isEmpty()){
            this.cloudRepository.deleteById(id);
        }
    }
    public void actualizarCloud(int id, Cloud cloud){
        if(!this.cloudRepository.findById(id).isEmpty()){
            Cloud cloudDB = this.cloudRepository.findById(id).get();
            if(cloud.getName() != null){
                cloudDB.setName(cloud.getName());
            }
            if(cloud.getBrand() != null){
                cloudDB.setBrand(cloud.getBrand());
            }
            if(cloud.getDescription() != null){
                cloudDB.setDescription(cloud.getDescription());
            }
            if(cloud.getYear() != null){
                cloudDB.setYear(cloud.getYear());
            }
            this.cloudRepository.save(cloudDB);
        }
    }
}
