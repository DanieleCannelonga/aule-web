package com.auleweb.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "date")
    private Date date;

    @NotNull
    @Column(name = "start_time")
    private Time startTime;

    @NotNull
    @Column(name = "end_time")
    private Time endTime;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "typology_id")
    private Typology typology;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Supervisor supervisor;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany(mappedBy = "event")
    private List<CourseEvent> courseEvents;
    
}