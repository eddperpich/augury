package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.EntityModel;
import com.eddperpich.augury.repository.EntityRepository;

@Service
@Transactional
public class EntityDao implements GenericDao<EntityModel>{

    @Autowired
    EntityRepository entityRepository;

    public List<EntityModel> findAll() {
        return entityRepository.findAll();
    }

    public EntityModel findOne(Integer id) {
        return entityRepository.findById(id).orElse(null);
    }

    public EntityModel save(EntityModel entityModel) {
        return entityRepository.save(entityModel);
    }

    public void delete(Integer id) {
        entityRepository.deleteById(id);
    }

    public void delete(EntityModel entityModel) {
        entityRepository.delete(entityModel);
    }

    public void deleteAll(List<EntityModel> entityModelList) {
        entityRepository.deleteAll();
    }

}
