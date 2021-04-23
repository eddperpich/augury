package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.DamageEvent;
import com.eddperpich.augury.repository.DamageEventRepository;

@Service
@Transactional
public class DamageEventDao implements GenericDao<DamageEvent>{

    @Autowired
    DamageEventRepository damageEventRepository;

    public List<DamageEvent> findAll() {
        return damageEventRepository.findAll();
    }

    public DamageEvent findOne(Integer id) {
        return damageEventRepository.findById(id).orElse(null);
    }

    public DamageEvent save(DamageEvent entity) {
        return damageEventRepository.save(entity);
    }

    public void delete(Integer id) {
        damageEventRepository.deleteById(id);
    }

    public void delete(DamageEvent entity) {
        damageEventRepository.delete(entity);
    }

    public void deleteAll(List<DamageEvent> entityList) {
        damageEventRepository.deleteAll();
    }

}
