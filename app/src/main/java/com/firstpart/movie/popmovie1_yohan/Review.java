package com.firstpart.movie.popmovie1_yohan;

/**
 * Created by Yohan on 02/05/2018.
 */

import com.google.gson.annotations.SerializedName;


public class Review {

    @SerializedName("author")
    private String author;

    @SerializedName("content")
    private String content;


    public Review(String author, String content) {

        this.author = author;
        this.content = content;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}