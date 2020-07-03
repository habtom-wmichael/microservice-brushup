package com.me.microservice.cloud.moviecatalogservice.controllers;

import com.me.microservice.cloud.moviecatalogservice.models.CatalogItem;
import com.me.microservice.cloud.moviecatalogservice.models.Movie;
import com.me.microservice.cloud.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/{userId}", produces = "application/json")
    public List<CatalogItem> getCatalogItems(@PathVariable("userId") String userId) {

        UserRating ratings = restTemplate.getForObject("http://movie-rating-data-service/ratings/" + userId, UserRating.class);
    return     ratings.getUserRatings().stream().map(rating -> {

            Movie movie = restTemplate.getForObject("http://localhost:8081/movies/" + rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(), "Romantic", rating.getRating());
        }).collect(Collectors.toList());


    }
    @GetMapping("/me")
public String sayHello(){
        return "Hello";
}

}
