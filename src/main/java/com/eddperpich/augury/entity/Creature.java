package com.eddperpich.augury.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "creature")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Creature implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "creature_id")
    private Integer id;

    @Column(name = "entity_id")
    private Integer entityId;

}
