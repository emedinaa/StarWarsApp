package com.aridev.cordero.starwarsapp.domain.repository

import com.aridev.cordero.starwarsapp.core.dataApp.ThemeApp

/**
 * Created by Eduardo Medina on 4/03/22.
 */
interface ThemeRepository {

    fun read(callback :(theme : String) -> Unit)
    fun save(theme : ThemeApp, callback : () -> Unit)
}