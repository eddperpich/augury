package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Creature;
import com.eddperpich.augury.repository.CreatureRepository;

@Service
@Transactional
public class CreatureDao implements GenericDao<Creature>{

    @Autowired
    CreatureRepository creatureRepository;

    public List<Creature> findAll() {
        return creatureRepository.findAll();
    }

    public Creature findOne(Integer id) {
        return creatureRepository.findById(id).orElse(null);
    }

    public Creature save(Creature entity) {
        return creatureRepository.save(entity);
    }

    public void delete(Integer id) {
        creatureRepository.deleteById(id);
    }

    public void delete(Creature entity) {
        creatureRepository.delete(entity);
    }

    public void deleteAll(List<Creature> entityList) {
        creatureRepository.deleteAll();
    }

}
