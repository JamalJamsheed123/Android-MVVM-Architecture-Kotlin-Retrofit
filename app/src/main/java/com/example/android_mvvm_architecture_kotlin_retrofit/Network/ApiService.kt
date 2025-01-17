package com.example.android_mvvm_architecture_kotlin_retrofit.Network


import com.example.android_mvvm_architecture_kotlin_retrofit.Model.Post
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}