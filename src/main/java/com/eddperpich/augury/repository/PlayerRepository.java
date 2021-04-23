package com.eddperpich.augury.repository;

import com.eddperpich.augury.entity.EntityModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eddperpich.augury.entity.Player;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Optional<Player> findByEntity(EntityModel entityModel);
}
