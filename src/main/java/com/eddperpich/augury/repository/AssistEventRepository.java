package com.eddperpich.augury.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eddperpich.augury.entity.AssistEvent;

@Repository
public interface AssistEventRepository extends JpaRepository<AssistEvent, Integer> {

}
