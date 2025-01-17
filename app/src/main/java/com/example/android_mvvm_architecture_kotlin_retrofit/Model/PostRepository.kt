package com.example.android_mvvm_architecture_kotlin_retrofit.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android_mvvm_architecture_kotlin_retrofit.Network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostRepository {
    private val apiService = RetrofitClient.instance

    fun getPosts(): LiveData<List<Post>> {
        val postsLiveData = MutableLiveData<List<Post>>()

        apiService.getPosts().enqueue(object : Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful) {
                    postsLiveData.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                postsLiveData.postValue(emptyList())
            }
        })

        return postsLiveData
    }
}