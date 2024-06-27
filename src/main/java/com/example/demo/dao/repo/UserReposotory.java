package com.example.demo.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.User;

public interface UserReposotory extends JpaRepository<User, Integer> {

}
