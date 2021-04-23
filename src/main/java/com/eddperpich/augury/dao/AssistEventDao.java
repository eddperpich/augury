package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.AssistEvent;
import com.eddperpich.augury.repository.AssistEventRepository;

@Service
@Transactional
public class AssistEventDao implements GenericDao<AssistEvent>{

    @Autowired
    AssistEventRepository assistEventRepository;

    public List<AssistEvent> findAll() {
        return assistEventRepository.findAll();
    }

    public AssistEvent findOne(Integer id) {
        return assistEventRepository.findById(id).orElse(null);
    }

    public AssistEvent save(AssistEvent entity) {
        return assistEventRepository.save(entity);
    }

    public void delete(Integer id) {
        assistEventRepository.deleteById(id);
    }

    public void delete(AssistEvent entity) {
        assistEventRepository.delete(entity);
    }

    public void deleteAll(List<AssistEvent> entityList) {
        assistEventRepository.deleteAll();
    }

}
