package com.eddperpich.augury.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "session")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private Integer id;

    @Column(name = "session_title")
    private String sessionTitle;

}
