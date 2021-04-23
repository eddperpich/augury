package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Action;
import com.eddperpich.augury.dao.ActionDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/action")
public class ActionResource {

    @Autowired
    ActionDao dao;

    @GetMapping
    public List<Action> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Action read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public Action create(@RequestBody Action entity){
        return dao.save(entity);
    }

    @PutMapping
    public Action update(@RequestBody Action entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<Action> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
