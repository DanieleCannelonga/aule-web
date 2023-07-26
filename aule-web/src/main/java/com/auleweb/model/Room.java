package com.auleweb.model;

import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "capacity")
    private int capacity;

    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "electricalOutlets")
    private int electricalOutlets;

    @NotNull
    @Column(name = "ethernetPorts")
    private int ethernetPorts;

    @NotNull
    @Column(name = "link")
    private String link;

    @ManyToOne
    @JoinColumn(name = "supervisor_id", nullable = false)
    private Supervisor supervisor;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;
    
    @OneToMany(mappedBy = "room")
    private List<Event> events;
    
    @OneToMany(mappedBy = "room")
    private List<AssetRoom> assetRooms;
    
}