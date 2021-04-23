package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.DamageEvent;
import com.eddperpich.augury.dao.DamageEventDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/damageevent")
public class DamageEventResource {

    @Autowired
    DamageEventDao dao;

    @GetMapping
    public List<DamageEvent> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public DamageEvent read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public DamageEvent create(@RequestBody DamageEvent entity){
        return dao.save(entity);
    }

    @PutMapping
    public DamageEvent update(@RequestBody DamageEvent entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<DamageEvent> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
