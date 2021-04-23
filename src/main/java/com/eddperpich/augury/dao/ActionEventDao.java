package com.eddperpich.augury.dao;

import com.eddperpich.augury.entity.EntityModel;
import com.eddperpich.augury.entity.Player;
import com.eddperpich.augury.repository.EntityRepository;
import com.eddperpich.augury.repository.PlayerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.ActionEvent;
import com.eddperpich.augury.repository.ActionEventRepository;

@Service
@Transactional
public class ActionEventDao implements GenericDao<ActionEvent> {

    @Autowired
    ActionEventRepository actionEventRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    EntityRepository entityRepository;

    public List<ActionEvent> findAll() {
        return actionEventRepository.findAll();
    }

    public ActionEvent findOne(Integer id) {
        return actionEventRepository.findById(id).orElse(null);
    }

    public List<ActionEvent> findAllEventsForPlayer(String name) {
        EntityModel entityModel = entityRepository.findByName(name).orElse(null);
        Player player = playerRepository.findByEntity(entityModel).orElse(null);
        if (player != null) {
            return actionEventRepository.findActionEventsBySource(entityModel);
        }
        return List.of();
    }

    public ActionEvent save(ActionEvent entity) {
        return actionEventRepository.save(entity);
    }

    public void delete(Integer id) {
        actionEventRepository.deleteById(id);
    }

    public void delete(ActionEvent entity) {
        actionEventRepository.delete(entity);
    }

    public void deleteAll(List<ActionEvent> entityList) {
        actionEventRepository.deleteAll();
    }

}
