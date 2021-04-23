package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "player_id")
    private Integer player;

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
