package com.eddperpich.augury.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Integer id;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "class_name")
    private String className;

    @Column(name = "race")
    private String race;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "entity_id")
    private EntityModel entity;

}
