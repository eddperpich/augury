package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Encounter;
import com.eddperpich.augury.dao.EncounterDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/encounter")
public class EncounterResource {

    @Autowired
    EncounterDao dao;

    @GetMapping
    public List<Encounter> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Encounter read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public Encounter create(@RequestBody Encounter entity){
        return dao.save(entity);
    }

    @PutMapping
    public Encounter update(@RequestBody Encounter entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<Encounter> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
