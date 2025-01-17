package com.example.android_mvvm_architecture_kotlin_retrofit.View

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_mvvm_architecture_kotlin_retrofit.Adapter.PostAdapter
import com.example.android_mvvm_architecture_kotlin_retrofit.R
import com.example.android_mvvm_architecture_kotlin_retrofit.ViewModel.PostViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val postViewModel: PostViewModel by viewModels()
  //  private lateinit var postViewModel: PostViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        postViewModel.getPosts().observe(this) { posts ->
            recyclerView.adapter = PostAdapter(posts)
        }
    }
}