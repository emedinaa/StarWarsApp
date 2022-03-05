package com.aridev.cordero.starwarsapp.domain.usecase

import com.aridev.cordero.starwarsapp.data.ItemResponse
import com.aridev.cordero.starwarsapp.data.remote.RetrofitService
import com.aridev.cordero.starwarsapp.domain.model.Item
import com.aridev.cordero.starwarsapp.domain.repository.ItemRepository
import javax.inject.Inject

class GetItemList @Inject constructor(private val itemRepository: ItemRepository)  {

    suspend fun getItemList(next : String,callback: (success: ItemResponse) -> Unit, failure:(error:String)->Unit) {
       //itemRepository.getItemList(next, callback, failure)
    }
}