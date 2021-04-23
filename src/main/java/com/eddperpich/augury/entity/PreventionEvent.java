package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "prevention_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreventionEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "prevention_event_id")
    private Integer preventionEvent;

    @ManyToOne
    @JoinColumn(name = "target_id")
    private EntityModel targetId;

    @Column(name = "prevention_value")
    private Integer preventionValue;

}
