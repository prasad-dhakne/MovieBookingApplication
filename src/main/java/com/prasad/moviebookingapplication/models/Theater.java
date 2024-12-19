package com.prasad.moviebookingapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theater extends BaseModel{
    private String name;
    private String address;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "theater")
    private List<Auditorium> auditoriums;

    @OneToMany
    private List<Show> upcomingShows;
}
