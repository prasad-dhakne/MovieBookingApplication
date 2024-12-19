package com.prasad.moviebookingapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    @ManyToOne
    private User bookedBy;

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
    private Date bookingDate;

    @OneToMany
    private List<ShowSeat> showSeats;
    private double totalAmount;
}
