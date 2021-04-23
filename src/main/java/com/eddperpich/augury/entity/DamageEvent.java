package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "damage_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DamageEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "damage_event_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "target_id")
    private EntityModel targetId;

    @Column(name = "damage_val")
    private Integer damageVal;

    @Column(name = "damage_type")
    private String damageType;

}
