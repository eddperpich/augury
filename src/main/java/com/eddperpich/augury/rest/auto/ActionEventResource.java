package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.ActionEvent;
import com.eddperpich.augury.dao.ActionEventDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/actionevent")
public class ActionEventResource {

    @Autowired
    ActionEventDao dao;

    @GetMapping
    public List<ActionEvent> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public ActionEvent read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public ActionEvent create(@RequestBody ActionEvent entity){
        return dao.save(entity);
    }

    @PutMapping
    public ActionEvent update(@RequestBody ActionEvent entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<ActionEvent> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
