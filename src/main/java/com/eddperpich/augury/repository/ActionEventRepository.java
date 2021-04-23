package com.eddperpich.augury.repository;

import com.eddperpich.augury.entity.EntityModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eddperpich.augury.entity.ActionEvent;

import java.util.List;

@Repository
public interface ActionEventRepository extends JpaRepository<ActionEvent, Integer> {
    List<ActionEvent> findActionEventsBySource(EntityModel entityModel);
}
