package com.example.retrofitdemo.repository

import android.security.identity.AccessControlProfileId
import com.example.retrofitdemo.api.RetrofitInstance
import com.example.retrofitdemo.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
       return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number:Int):Response<Post>{
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomPosts(userId:Int):Response<List<Post>>{
        return RetrofitInstance.api.getCustomPosts(userId)
    }
}