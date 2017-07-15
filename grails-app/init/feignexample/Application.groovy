package feignexample

import apiservices.BookApiService
import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder
import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.context.annotation.Bean

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

    @Bean
    BookApiService createCustomerApiService() {
        String apiUrl = "http://localhost:9090"
        println apiUrl
        Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(BookApiService.class, apiUrl);
    }
}