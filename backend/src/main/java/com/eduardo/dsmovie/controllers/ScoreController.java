package com.eduardo.dsmovie.controllers;

import com.eduardo.dsmovie.dto.MovieDTO;
import com.eduardo.dsmovie.dto.ScooreDTO;
import com.eduardo.dsmovie.services.MovieService;
import com.eduardo.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScooreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }
}