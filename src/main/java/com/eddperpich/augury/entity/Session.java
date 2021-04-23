package com.eddperpich.augury.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "session")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "session_id")
    private Integer session;

    @Column(name = "session_title")
    private String sessionTitle;

}
