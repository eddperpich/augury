package com.eddperpich.augury.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entity_id")
    private Integer id;

    @Column(name = "name")
    private String name;

}
