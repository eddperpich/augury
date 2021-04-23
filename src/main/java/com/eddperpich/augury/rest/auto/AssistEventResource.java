package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.AssistEvent;
import com.eddperpich.augury.dao.AssistEventDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/assistevent")
public class AssistEventResource {

    @Autowired
    AssistEventDao dao;

    @GetMapping
    public List<AssistEvent> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public AssistEvent read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public AssistEvent create(@RequestBody AssistEvent entity){
        return dao.save(entity);
    }

    @PutMapping
    public AssistEvent update(@RequestBody AssistEvent entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<AssistEvent> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
