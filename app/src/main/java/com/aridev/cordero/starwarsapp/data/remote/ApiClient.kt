package com.aridev.cordero.starwarsapp.data.remote

import com.aridev.cordero.starwarsapp.data.ItemDTO
import com.aridev.cordero.starwarsapp.data.ItemResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiClient {

    @GET()
    suspend fun getItem(@Url url: String): Response<ItemResponse>;
    @GET()
    suspend fun getItemDetail(@Url url : String) : Response<ItemDTO>

    @GET
    suspend fun searchItem(@Url url : String) : Response<ItemResponse>
}