package com.auleweb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "place")
    private String place;

    @NotNull
    @Column(name = "building")
    private String building;

    @NotNull
    @Column(name = "floor")
    private String floor;

    @OneToMany(mappedBy = "location")
    private List<Room> rooms;
    
}