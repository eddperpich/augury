package com.eddperpich.augury.rest.auto;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Session;
import com.eddperpich.augury.dao.SessionDao;

import com.eddperpich.augury.utils.GlobalConstants;

@RestController
@RequestMapping(GlobalConstants.CONTEXT_PATH + "/session")
public class SessionResource {

    @Autowired
    SessionDao dao;

    @GetMapping
    public List<Session> readAll(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Session read(@PathVariable("id") Integer id){
        return dao.findOne(id);
    }

    @PostMapping
    public Session create(@RequestBody Session entity){
        return dao.save(entity);
    }

    @PutMapping
    public Session update(@RequestBody Session entity){
        return dao.save(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        dao.delete(id);
        return true;
    }

    @DeleteMapping
    public boolean deleteAll(@RequestBody List<Session> entityList){
        dao.deleteAll(entityList);
        return true;
    }

}
