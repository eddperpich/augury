package com.eddperpich.augury.dao; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.eddperpich.augury.entity.Player;
import com.eddperpich.augury.repository.PlayerRepository;

@Service
@Transactional
public class PlayerDao implements GenericDao<Player>{

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findOne(Integer id) {
        return playerRepository.findById(id).orElse(null);
    }

    public Player save(Player entity) {
        return playerRepository.save(entity);
    }

    public void delete(Integer id) {
        playerRepository.deleteById(id);
    }

    public void delete(Player entity) {
        playerRepository.delete(entity);
    }

    public void deleteAll(List<Player> entityList) {
        playerRepository.deleteAll();
    }

}
