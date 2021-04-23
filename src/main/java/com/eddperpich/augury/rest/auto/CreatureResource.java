package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Creature;
import com.eddperpich.augury.dao.CreatureDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/creature")
public class CreatureResource {

    @Autowired
    CreatureDao dao;

    @GetMapping
    public List<Creature> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Creature read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public Creature create(@RequestBody Creature entity){
        return dao.save(entity);
    }

    @PutMapping
    public Creature update(@RequestBody Creature entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<Creature> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
