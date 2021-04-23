package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "action_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "action_event_id")
    private Integer actionEvent;

    @ManyToOne
    @JoinColumn(name = "damage_event_id")
    private DamageEvent damageEvent;

    @ManyToOne
    @JoinColumn(name = "healing_event_id")
    private HealingEvent healingEvent;

    @ManyToOne
    @JoinColumn(name = "assist_event_id")
    private AssistEvent assistEvent;

    @ManyToOne
    @JoinColumn(name = "prevention_event_id")
    private PreventionEvent preventionEvent;

    @ManyToOne
    @JoinColumn(name = "action_id")
    private Action action;

    @ManyToOne
    @JoinColumn(name = "source_id")
    private EntityModel source;

    @ManyToOne
    @JoinColumn(name = "encounter_id")
    private Encounter encounter;

}
