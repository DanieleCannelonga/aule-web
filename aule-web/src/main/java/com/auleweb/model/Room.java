package com.auleweb.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
    @Column(name = "electrical_outlets")
    private int electricalOutlets;

    @NotNull
    @Column(name = "ethernet_ports")
    private int ethernetPorts;

    @NotNull
    @Column(name = "link")
    private String link;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    @JsonIgnore
    private Supervisor supervisor;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @JsonIgnore
    private Group group;

    @ManyToOne
    @JoinColumn(name = "location_id")
    @JsonIgnore
    private Location location;
    
    @OneToMany(mappedBy = "room")
    @JsonIgnore
    private List<Event> events;
    
    @OneToMany(mappedBy = "room")
    @JsonIgnore
    private List<AssetRoom> assetRooms;
    
    @Transient
    @JsonProperty("group_id")
    public Long getGroupId() {
        return group != null ? group.getId() : null;
    }
    
    @Transient
    @JsonProperty("location_id")
    public Long getLocationId() {
        return location != null ? location.getId() : null;
    }
    
    @Transient
    @JsonProperty("supervisor_id")
    public Long getsupervisorId() {
        return supervisor != null ? supervisor.getId() : null;
    }
}