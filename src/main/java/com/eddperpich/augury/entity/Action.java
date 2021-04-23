package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "action")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Action implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "action_id")
    private Integer action;

    @Column(name = "action_title")
    private String actionTitle;

}
