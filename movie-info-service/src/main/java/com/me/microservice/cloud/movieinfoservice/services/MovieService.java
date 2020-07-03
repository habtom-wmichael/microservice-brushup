package com.me.microservice.cloud.movieinfoservice.services;

import com.me.microservice.cloud.movieinfoservice.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private List<Movie> movies  = List.of(
            new Movie("101","Love cost a thing"),
                new Movie("102","JEXI"),
                new Movie("103","Titanic"));
    public MovieService() {

    }



    public Movie getMovieById(String movieId){

        for (Movie m:movies) {
           if (m.getMovieId().equalsIgnoreCase(movieId)){
           return     m;
           }
        }
          return null;
    }
}
