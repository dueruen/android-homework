package com.example.a09_threads_02;

import com.google.gson.annotations.SerializedName;

public class JokeData {
    @SerializedName("type")
    private String type;
    @SerializedName("value")
    private value value;

    class value {
        @SerializedName("id")
        private Integer id;
        @SerializedName("joke")
        private String joke;
        @SerializedName("categories")
        private String[] categories;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getJoke() {
            return joke;
        }

        public void setJoke(String joke) {
            this.joke = joke;
        }

        public String[] getCategories() {
            return categories;
        }

        public void setCategories(String[] categories) {
            this.categories = categories;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JokeData.value getValue() {
        return value;
    }

    public void setValue(JokeData.value value) {
        this.value = value;
    }

    public JokeData(String type, JokeData.value value) {
        this.type = type;
        this.value = value;
    }
}

