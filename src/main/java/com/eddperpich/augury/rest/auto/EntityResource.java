package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.EntityModel;
import com.eddperpich.augury.dao.EntityDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/entity")
public class EntityResource {

    @Autowired
    EntityDao dao;

    @GetMapping
    public List<EntityModel> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public EntityModel read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public EntityModel create(@RequestBody EntityModel entityModel){
        return dao.save(entityModel);
    }

    @PutMapping
    public EntityModel update(@RequestBody EntityModel entityModel){
        return dao.save(entityModel);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<EntityModel> entityModelList){
        dao.deleteAll(entityModelList);
        return true;
    }

}
