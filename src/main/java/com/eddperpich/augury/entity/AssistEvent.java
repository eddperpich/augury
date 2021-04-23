package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "assist_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssistEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "assist_event_id")
    private Integer assistEvent;

    @ManyToOne
    @JoinColumn(name = "target_id")
    private EntityModel targetId;

    @ManyToOne
    @JoinColumn(name = "action_event_id")
    private ActionEvent actionEvent;

    @Column(name = "assist_val")
    private Integer assistVal;

}
