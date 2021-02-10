package com.example.retrofitdemo.repository

import com.example.retrofitdemo.api.RetrofitInstance
import com.example.retrofitdemo.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
       return RetrofitInstance.api.getPost()
    }
}