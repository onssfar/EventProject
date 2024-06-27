package com.example.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Event;

public interface EventReposotory extends JpaRepository<Event, Integer> {

}
