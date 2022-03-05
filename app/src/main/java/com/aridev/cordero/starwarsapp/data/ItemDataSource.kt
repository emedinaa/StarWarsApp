package com.aridev.cordero.starwarsapp.data

import com.aridev.cordero.starwarsapp.data.remote.RetrofitService
import com.aridev.cordero.starwarsapp.domain.model.Item
import com.aridev.cordero.starwarsapp.domain.repository.ItemRepository
import javax.inject.Inject

/**
 * Created by Eduardo Medina on 4/03/22.
 */
class ItemDataSource @Inject constructor(private val api:RetrofitService) : ItemRepository {

    override suspend fun getItem(
        next: String, callback: (success: Item) -> Unit,
        failure: (error: String) -> Unit
    ) {
        api.getItemDetail(next) { success, error ->
            if (error.isNullOrEmpty()) {
                //callback.invoke( success)
            } else {
                failure(error)
            }
        }
    }

    override suspend fun getItemList(
        next: String,
        callback: (success: List<Item>) -> Unit, failure: (error: String) -> Unit
    ) {
        api.getItemList(next) { success, error ->
            if (error.isNullOrEmpty()) {
                //callback.invoke( success, null)
            } else {
                failure(error)
            }
        }
    }

    override suspend fun getSearch(
        url: String,
        callback: (success: ItemResponse) -> Unit, failure: (error: String) -> Unit
    ) {
        api.searchItem(url) { success, error ->
            if (error.isNullOrEmpty()) {
                //callback.invoke( success, null)
            } else {
                failure(error)
            }
        }
    }
}