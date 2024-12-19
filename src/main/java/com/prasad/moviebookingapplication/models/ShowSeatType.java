package com.prasad.moviebookingapplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;

    @ManyToOne    // consider VIP seat will be available in many ShowSeatType
    private SeatType seatType;
    private int price;
}
