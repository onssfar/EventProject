package com.example.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Venue;

public interface VenueReposostory  extends JpaRepository<Venue, Integer>{

}
