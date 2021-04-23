package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "creature")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Creature implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "creature_id")
    private Integer creature;

    @Column(name = "entity_id")
    private Integer entityId;

}
