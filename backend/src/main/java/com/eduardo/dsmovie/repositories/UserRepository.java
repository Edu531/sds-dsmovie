package com.eduardo.dsmovie.repositories;

import com.eduardo.dsmovie.entities.Movie;
import com.eduardo.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
