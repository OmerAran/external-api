package com.omeraran.externalapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CountryController {

    @GetMapping(value = "/country/{name}")
    public String getWithName(@PathVariable String name){
        String url = "https://restcountries.com/v3.1/name/"+name;
        RestTemplate restTemplate = new RestTemplate();
        String countries =  restTemplate.getForObject(url, String.class);
        return countries;
    }

    @GetMapping(value = "/lang/{lang}")
    public String getLang(@PathVariable String lang){
        String url = "https://restcountries.com/v3.1/lang/"+lang;
        RestTemplate restTemplate = new RestTemplate();
        String language =  restTemplate.getForObject(url, String.class);
        return language;
    }




}
