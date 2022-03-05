package com.aridev.cordero.starwarsapp.domain.repository

import com.aridev.cordero.starwarsapp.data.ItemResponse
import com.aridev.cordero.starwarsapp.domain.model.Item

/**
 * Created by Eduardo Medina on 4/03/22.
 */
interface ItemRepository {

    suspend fun getItem(
        next: String,
        callback: (success: Item) -> Unit,
        failure: (error: String) -> Unit
    )

    suspend fun getItemList(
        next: String,
        callback: (success: List<Item>) -> Unit,
        failure: (error: String) -> Unit
    )

    suspend fun getSearch(
        url: String,
        callback: (success: ItemResponse) -> Unit,
        failure: (error: String) -> Unit
    )
}