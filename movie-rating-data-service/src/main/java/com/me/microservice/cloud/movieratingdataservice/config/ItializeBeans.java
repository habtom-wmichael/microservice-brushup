package com.me.microservice.cloud.movieratingdataservice.config;

import com.me.microservice.cloud.movieratingdataservice.services.RatingService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ItializeBeans {


    @Bean
    public RatingService getRatingService(){
        return  new RatingService();
    }
}
