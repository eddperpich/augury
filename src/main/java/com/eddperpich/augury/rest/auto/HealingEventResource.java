package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.HealingEvent;
import com.eddperpich.augury.dao.HealingEventDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/healingevent")
public class HealingEventResource {

    @Autowired
    HealingEventDao dao;

    @GetMapping
    public List<HealingEvent> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public HealingEvent read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public HealingEvent create(@RequestBody HealingEvent entity){
        return dao.save(entity);
    }

    @PutMapping
    public HealingEvent update(@RequestBody HealingEvent entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<HealingEvent> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
