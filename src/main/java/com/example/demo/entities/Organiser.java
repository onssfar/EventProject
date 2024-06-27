package com.example.demo.entities;

import jakarta.persistence.GeneratedValue;

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
public class Organiser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "organizerId")
	private int organizerId;

	@Column(name = "nameOrganisation")
	private String nameOrganisation;

	@Column(name = "contactInfo")
	private String contactInfo;

	@OneToMany(mappedBy = "organizer")
	private List<Event> events;
}
