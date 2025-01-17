package com.example.android_mvvm_architecture_kotlin_retrofit.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_mvvm_architecture_kotlin_retrofit.Model.Post
import com.example.android_mvvm_architecture_kotlin_retrofit.R

class PostAdapter(private val posts: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idTextView: TextView = view.findViewById(R.id.tvid)
        val titleTextview: TextView = view.findViewById(R.id.textTitle)
        val bodyTextView: TextView = view.findViewById(R.id.textBody)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_info_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.idTextView.text = posts[position].id.toString()
        holder.titleTextview.text = posts[position].title
        holder.bodyTextView.text = posts[position].body
    }

    override fun getItemCount(): Int = posts.size
}