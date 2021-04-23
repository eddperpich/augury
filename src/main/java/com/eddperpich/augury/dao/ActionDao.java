package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Action;
import com.eddperpich.augury.repository.ActionRepository;

@Service
@Transactional
public class ActionDao implements GenericDao<Action>{

    @Autowired
    ActionRepository actionRepository;

    public List<Action> findAll() {
        return actionRepository.findAll();
    }

    public Action findOne(Integer id) {
        return actionRepository.findById(id).orElse(null);
    }

    public Action save(Action entity) {
        return actionRepository.save(entity);
    }

    public void delete(Integer id) {
        actionRepository.deleteById(id);
    }

    public void delete(Action entity) {
        actionRepository.delete(entity);
    }

    public void deleteAll(List<Action> entityList) {
        actionRepository.deleteAll();
    }

}
