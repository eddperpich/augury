package com.eddperpich.augury.repository;

import com.eddperpich.augury.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Player, Integer> {
    List<Player> findByName(String name);
}
