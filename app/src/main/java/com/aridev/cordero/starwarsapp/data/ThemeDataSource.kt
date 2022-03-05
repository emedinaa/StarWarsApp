package com.aridev.cordero.starwarsapp.data

import com.aridev.cordero.starwarsapp.core.dataApp.ThemeApp
import com.aridev.cordero.starwarsapp.data.sharedPreference.SharedPref
import com.aridev.cordero.starwarsapp.domain.repository.ThemeRepository
import javax.inject.Inject

/**
 * Created by Eduardo Medina on 4/03/22.
 */
class ThemeDataSource @Inject constructor(
                      private val sharedPref: SharedPref
):ThemeRepository{

    override fun read(callback: (theme: String) -> Unit) {
        callback.invoke(sharedPref.read(SharedPref.ThemeApp, ThemeApp.LIGHT.value))
    }

    override fun save(theme: ThemeApp, callback: () -> Unit) {
        sharedPref.write(SharedPref.ThemeApp,theme.value)
        callback.invoke()
    }
}