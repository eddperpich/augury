package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Encounter;
import com.eddperpich.augury.repository.EncounterRepository;

@Service
@Transactional
public class EncounterDao implements GenericDao<Encounter>{

    @Autowired
    EncounterRepository encounterRepository;

    public List<Encounter> findAll() {
        return encounterRepository.findAll();
    }

    public Encounter findOne(Integer id) {
        return encounterRepository.findById(id).orElse(null);
    }

    public Encounter save(Encounter entity) {
        return encounterRepository.save(entity);
    }

    public void delete(Integer id) {
        encounterRepository.deleteById(id);
    }

    public void delete(Encounter entity) {
        encounterRepository.delete(entity);
    }

    public void deleteAll(List<Encounter> entityList) {
        encounterRepository.deleteAll();
    }

}
