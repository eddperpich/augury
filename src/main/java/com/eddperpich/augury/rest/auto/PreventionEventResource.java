package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.PreventionEvent;
import com.eddperpich.augury.dao.PreventionEventDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/preventionevent")
public class PreventionEventResource {

    @Autowired
    PreventionEventDao dao;

    @GetMapping
    public List<PreventionEvent> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public PreventionEvent read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public PreventionEvent create(@RequestBody PreventionEvent entity){
        return dao.save(entity);
    }

    @PutMapping
    public PreventionEvent update(@RequestBody PreventionEvent entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<PreventionEvent> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
