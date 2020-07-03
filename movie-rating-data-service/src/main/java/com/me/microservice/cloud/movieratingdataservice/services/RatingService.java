package com.me.microservice.cloud.movieratingdataservice.services;

import com.me.microservice.cloud.movieratingdataservice.models.Rating;
import com.me.microservice.cloud.movieratingdataservice.models.UserRating;

import java.util.List;

public class RatingService {


    public UserRating getRatings(){
        List<Rating> ratings=List.of(
                new Rating("101",5),
                new Rating("102",1),
                new Rating("103",3),
                new Rating("104",4),
                new Rating("105",2)
        );
        UserRating userRating = new UserRating();
        userRating.setRatings(ratings);

      return  userRating;
    }

}
