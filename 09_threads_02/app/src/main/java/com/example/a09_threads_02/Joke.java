package com.example.a09_threads_02;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Joke {
    @GET("/jokes/random")
    Call<JokeData> getRandomJoke();
}
