package com.me.microservice.cloud.movieratingdataservice.controllers;

import com.me.microservice.cloud.movieratingdataservice.models.UserRating;
import com.me.microservice.cloud.movieratingdataservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class MovieRatingController {
@Autowired
private RatingService ratingService;

@GetMapping(value = "/{userId}" , produces = "application/json")
public UserRating getRating(@PathVariable("userId") String userId){

 return    ratingService.getRatings();
}

}
