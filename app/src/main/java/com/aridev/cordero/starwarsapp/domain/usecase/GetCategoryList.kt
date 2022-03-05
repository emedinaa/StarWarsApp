package com.aridev.cordero.starwarsapp.domain.usecase

import com.aridev.cordero.starwarsapp.data.Categories
import com.aridev.cordero.starwarsapp.data.CategoryDTO
import javax.inject.Inject

class GetCategoryList @Inject constructor() {
    fun get(callback : (success : List<CategoryDTO>) -> Unit) {
        val listCategories : List<CategoryDTO> = listOf(
            CategoryDTO(Categories.PEOPLE, true),
            CategoryDTO(Categories.PLANETS, false),
            CategoryDTO(Categories.FILMS, false),
            CategoryDTO(Categories.SPECIES, false),
            CategoryDTO(Categories.VEHICLES, false),
            CategoryDTO(Categories.STARSHIPS, false)
        )
        callback.invoke(listCategories)
    }
}