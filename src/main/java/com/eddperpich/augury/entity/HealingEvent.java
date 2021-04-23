package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "healing_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HealingEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "healing_event_id")
    private Integer healingEvent;

    @ManyToOne
    @JoinColumn(name = "target_id")
    private EntityModel targetId;

    @Column(name = "healing_val")
    private Integer healingVal;

}
