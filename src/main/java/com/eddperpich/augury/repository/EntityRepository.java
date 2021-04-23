package com.eddperpich.augury.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eddperpich.augury.entity.EntityModel;

import java.util.Optional;

@Repository
public interface EntityRepository extends JpaRepository<EntityModel, Integer> {
    Optional<EntityModel> findByName(String name);
}
