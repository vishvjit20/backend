package com.vj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
}
