package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "entity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntityModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "entity_id")
    private Integer entity;

    @Column(name = "name")
    private String name;

}
