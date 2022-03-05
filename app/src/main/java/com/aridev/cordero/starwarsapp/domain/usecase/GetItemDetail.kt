package com.aridev.cordero.starwarsapp.domain.usecase

import com.aridev.cordero.starwarsapp.domain.model.Item
import com.aridev.cordero.starwarsapp.domain.repository.ItemRepository
import javax.inject.Inject

class GetItemDetail @Inject constructor(private val itemRepository: ItemRepository) {

    suspend fun getItem(next : String,callback: (success: Item) -> Unit, failure :(error:String)->Unit) {
        itemRepository.getItem(next,callback, failure)
    }
}