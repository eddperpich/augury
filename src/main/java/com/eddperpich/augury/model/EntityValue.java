package com.eddperpich.augury.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "entity", schema = "legend")
public class EntityValue {
    public EntityValue() {
    }

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entity_id")
    private Integer id;
}
