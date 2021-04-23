package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Player;
import com.eddperpich.augury.dao.PlayerDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/player")
public class PlayerResource {

    @Autowired
    PlayerDao dao;

    @GetMapping
    public List<Player> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Player read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public Player create(@RequestBody Player entity){
        return dao.save(entity);
    }

    @PutMapping
    public Player update(@RequestBody Player entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<Player> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
