package com.senix22.normalmvvmarchitecture.api

import com.senix22.normalmvvmarchitecture.api.model.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface API {

    @get:GET("posts")
    val posts: Call<List<PostModel>>
}
