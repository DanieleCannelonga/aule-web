package com.auleweb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "typologies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Typology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "typology")
    private List<Event> events;
    
}