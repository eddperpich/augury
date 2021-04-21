package com.eddperpich.augury.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "player", schema = "legend")
public class ActionEvent {

    public ActionEvent(String name, EntityValue entity) {
        this.entity = entity;
        this.name = name;
    }
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id")
    private Integer id;

    @Getter
    @Setter
    @Column(name = "player_name")
    private String name;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "entity_id", unique = true, nullable = false, table = "entity")
    private EntityValue entity;

}
