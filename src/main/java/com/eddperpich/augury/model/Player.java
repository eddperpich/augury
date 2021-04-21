package com.eddperpich.augury.model;


import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "player", schema = "legend")
public class Player {

    public Player(String name, Integer entity_id) {
        this.entity_id = entity_id;
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
    @Column(name = "entity_id")
    private Integer entity_id;

}
