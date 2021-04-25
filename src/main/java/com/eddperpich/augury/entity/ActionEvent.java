package com.eddperpich.augury.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "action_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "action_event_id")
    private Integer id;

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "damage_event_id")
    private DamageEvent damageEvent;

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "healing_event_id")
    private HealingEvent healingEvent;

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "assist_event_id")
    private AssistEvent assistEvent;

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "prevention_event_id")
    private PreventionEvent preventionEvent;

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "action_id")
    private Action action;

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "source_id")
    private EntityModel source;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "encounter_id")
    private Encounter encounter;

}
