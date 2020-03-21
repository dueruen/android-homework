package com.example.a09_threads_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private Handler handler = new Handler();
    private String url = "http://api.icndb.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        Thread t = new Thread(new jokes());
        t.start();

    }

    private class jokes implements Runnable {
        Joke jokeGetter = retrofit.create(Joke.class);
        @Override
        public void run() {
            while(true) {
                Call<JokeData> call = jokeGetter.getRandomJoke();
                call.enqueue(new Callback<JokeData>() {
                    @Override
                    public void onResponse(Call<JokeData> call, final Response<JokeData> response) {
                        handler.post(new Runnable() {
                            TextView tv = (TextView) findViewById(R.id.text);
                            @Override
                            public void run() {
                                tv.setText(response.body().getValue().getJoke());
                            }
                        });
                    }

                    @Override
                    public void onFailure(Call<JokeData> call, Throwable t) {

                    }
                });

                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
