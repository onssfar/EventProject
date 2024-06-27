package com.example.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Ticket;

public interface TicketReposotory extends JpaRepository<Ticket,Integer>{

}
