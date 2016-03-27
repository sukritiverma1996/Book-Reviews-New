package com.example.vagisha.tabbed3.Network;

import com.example.vagisha.tabbed3.Models.BookObject;
import com.example.vagisha.tabbed3.Models.GenreListItemClass;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vagisha on 27/3/16.
 */
public interface ApiInterface {

    @GET("books/reviews.json")
    Call<BookObject> getBookObject(@Query("q") String bookName, @Query("key") String access_token);

    @GET("publications/recent_recos.json")
    Call<ArrayList<GenreListItemClass>> getGenreList(@Query("key") String access_token , @Query("slug") String genreName);
}
