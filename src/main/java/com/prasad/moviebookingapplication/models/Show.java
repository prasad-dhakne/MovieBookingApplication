package com.prasad.moviebookingapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;
    private Date startTime;
    private Date endTime;

    @Enumerated(EnumType.STRING)
    private Language language;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ShowFeature> showFeatures;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats;

    @OneToMany
    private List<ShowSeatType> showSeatTypes;
}
