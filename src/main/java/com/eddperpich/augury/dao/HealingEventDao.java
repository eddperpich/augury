package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.HealingEvent;
import com.eddperpich.augury.repository.HealingEventRepository;

@Service
@Transactional
public class HealingEventDao implements GenericDao<HealingEvent>{

    @Autowired
    HealingEventRepository healingEventRepository;

    public List<HealingEvent> findAll() {
        return healingEventRepository.findAll();
    }

    public HealingEvent findOne(Integer id) {
        return healingEventRepository.findById(id).orElse(null);
    }

    public HealingEvent save(HealingEvent entity) {
        return healingEventRepository.save(entity);
    }

    public void delete(Integer id) {
        healingEventRepository.deleteById(id);
    }

    public void delete(HealingEvent entity) {
        healingEventRepository.delete(entity);
    }

    public void deleteAll(List<HealingEvent> entityList) {
        healingEventRepository.deleteAll();
    }

}
