package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.PreventionEvent;
import com.eddperpich.augury.repository.PreventionEventRepository;

@Service
@Transactional
public class PreventionEventDao implements GenericDao<PreventionEvent>{

    @Autowired
    PreventionEventRepository preventionEventRepository;

    public List<PreventionEvent> findAll() {
        return preventionEventRepository.findAll();
    }

    public PreventionEvent findOne(Integer id) {
        return preventionEventRepository.findById(id).orElse(null);
    }

    public PreventionEvent save(PreventionEvent entity) {
        return preventionEventRepository.save(entity);
    }

    public void delete(Integer id) {
        preventionEventRepository.deleteById(id);
    }

    public void delete(PreventionEvent entity) {
        preventionEventRepository.delete(entity);
    }

    public void deleteAll(List<PreventionEvent> entityList) {
        preventionEventRepository.deleteAll();
    }

}
