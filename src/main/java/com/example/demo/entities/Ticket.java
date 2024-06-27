package com.example.demo.entities;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Data
@ToString
public class Ticket {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ticketId")
	    private int ticketId;
	    
	    @Column(name = "userId")
	    private int userId;
	    
	    @Column(name = "purchaseDate")
	    private Date purchaseDate;

	    @ManyToOne
	    @JoinColumn(name = "eventId" ,referencedColumnName = "eventId")
	    private Event event;

	    @ManyToOne
	    @JoinColumn(name = "userId",  referencedColumnName = "userId", insertable = false, updatable = false)
	    private User user;


}
