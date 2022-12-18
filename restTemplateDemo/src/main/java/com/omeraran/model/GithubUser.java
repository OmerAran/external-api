package com.omeraran.model;

import lombok.*;

@Data
public class GithubUser {

    String login;
    String avatar_url;
    String url;
    String bio;
    String name;
    String followers;
    String following;

}
