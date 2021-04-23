package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Session;
import com.eddperpich.augury.repository.SessionRepository;

@Service
@Transactional
public class SessionDao implements GenericDao<Session>{

    @Autowired
    SessionRepository sessionRepository;

    public List<Session> findAll() {
        return sessionRepository.findAll();
    }

    public Session findOne(Integer id) {
        return sessionRepository.findById(id).orElse(null);
    }

    public Session save(Session entity) {
        return sessionRepository.save(entity);
    }

    public void delete(Integer id) {
        sessionRepository.deleteById(id);
    }

    public void delete(Session entity) {
        sessionRepository.delete(entity);
    }

    public void deleteAll(List<Session> entityList) {
        sessionRepository.deleteAll();
    }

}
