package com.me.microservice.cloud.movieinfoservice.config;

import com.me.microservice.cloud.movieinfoservice.services.MovieService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class IntializeBeans {

    @Bean
    public MovieService getMovieService(){
        return  new MovieService();
    }



}
