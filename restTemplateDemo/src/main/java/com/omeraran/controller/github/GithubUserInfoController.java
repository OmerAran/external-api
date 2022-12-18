package com.omeraran.controller.github;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omeraran.model.GithubUser;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class GithubUserInfoController {
    RestTemplate restTemplate = new RestTemplate();
    String githubUserNameUrl = "https://api.github.com/users/";

    @GetMapping("github/avatar/{userName}")
    public GithubUser getAvatarUrlByUserName(@PathVariable String userName){

     /*   ResponseEntity<Object> response = restTemplate.exchange(
                githubUserNameUrl,
                HttpMethod.GET,
                null,
                Object.class);
                 Object body = response.getBody();
*/
        GithubUser githubUser = new GithubUser();
         githubUser = restTemplate.
                getForObject(githubUserNameUrl+userName,GithubUser.class);


        return githubUser;
    }
}
