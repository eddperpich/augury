package com.eddperpich.augury.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "damage_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DamageEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "damage_event_id")
    private Integer id;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "target_id")
    private EntityModel targetId;

    @Column(name = "damage_val")
    private Integer damageVal;

    @Column(name = "damage_type")
    private String damageType;

}
