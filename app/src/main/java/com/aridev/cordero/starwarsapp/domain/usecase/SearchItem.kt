package com.aridev.cordero.starwarsapp.domain.usecase

import com.aridev.cordero.starwarsapp.data.ItemResponse
import com.aridev.cordero.starwarsapp.domain.repository.ItemRepository
import javax.inject.Inject

class SearchItem @Inject constructor(private val itemRepository: ItemRepository) {

    suspend fun getSearch(
        url: String, callback: (success: ItemResponse?) -> Unit,
        failure: (error: String) -> Unit
    ) {
        itemRepository.getSearch(url, callback, failure)
    }
}