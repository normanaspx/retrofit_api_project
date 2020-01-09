package com.example.retrofit_api_project;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;
import retrofit2.http.Headers;

public interface PostService {

    String API_ROUTE = "posts";
    @Headers({

            "Content-type: application/json"

    })
    @POST(API_ROUTE)
    Call<Posts> sendPosts(@Body Posts posts);
}
