package com.eduardo.dsmovie.repositories;

import com.eduardo.dsmovie.entities.Score;
import com.eduardo.dsmovie.entities.ScorePK;
import com.eduardo.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
