package com.example.demo.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eventId")
	private Integer eventId;

	@Column(name = "nameEvent")
	private String nameEvent;

	@Column(name = "dateEvent")
	private Date dateEvent;

	@Column(name = "location")
	private String location;

	private String description;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(int id) {
		this.eventId = id;
	}

	public String getNameEvent() {
		return nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	@OneToMany(mappedBy = "event")
	private List<Ticket> tickets;

	@ManyToOne
	@JoinColumn(name = "organizerId")
	private Organiser organizer;

	@ManyToOne
	@JoinColumn(name = "venueId")
	private Venue venue;

	public Date getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
