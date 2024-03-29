package com.example.vagisha.tabbed3.Models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagisha on 27/3/16.
 */
@Table(name="Book")
public class Book extends Model{

    @Column(name="BookTitle")
    public String title;

    @Column(name="BookAuthor")
    public String author;

    @SerializedName("critic_reviews")
    public ArrayList<CriticReview> criticReviews;


    public static List<Book> getAllFavs(){

       return new Select().from(Book.class).execute();

    }
}


