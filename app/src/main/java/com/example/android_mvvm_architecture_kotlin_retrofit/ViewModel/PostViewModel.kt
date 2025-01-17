package com.example.android_mvvm_architecture_kotlin_retrofit.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.android_mvvm_architecture_kotlin_retrofit.Model.Post
import com.example.android_mvvm_architecture_kotlin_retrofit.Model.PostRepository

class PostViewModel: ViewModel() {
    private val repository = PostRepository()

    fun getPosts(): LiveData<List<Post>> {
        return repository.getPosts()
    }
}