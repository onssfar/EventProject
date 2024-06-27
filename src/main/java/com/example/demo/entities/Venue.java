package com.example.demo.entities;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Venue {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "venueId")
	    private int venueId;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "address")
	    private String address;
	    
	    @Column(name = "capacity")
	    private int capacity;

	    @OneToMany(mappedBy = "venue")
	    private List<Event> events;
	
}
