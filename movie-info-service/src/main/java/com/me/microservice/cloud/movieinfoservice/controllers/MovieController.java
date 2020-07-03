package com.me.microservice.cloud.movieinfoservice.controllers;

import com.me.microservice.cloud.movieinfoservice.models.Movie;
import com.me.microservice.cloud.movieinfoservice.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/{movieId}", produces = "application/json")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {

   Movie movie=    movieService.getMovieById(movieId);
   return movie;
    }

}
