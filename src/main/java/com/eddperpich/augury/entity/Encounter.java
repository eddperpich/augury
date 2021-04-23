package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "encounter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Encounter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "encounter_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

    @Column(name = "description")
    private String description;
}
