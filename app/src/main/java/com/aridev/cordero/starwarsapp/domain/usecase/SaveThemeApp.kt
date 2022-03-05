package com.aridev.cordero.starwarsapp.domain.usecase

import com.aridev.cordero.starwarsapp.core.dataApp.ThemeApp
import com.aridev.cordero.starwarsapp.domain.repository.ThemeRepository
import javax.inject.Inject

class SaveThemeApp @Inject constructor(
    private val themeRepository: ThemeRepository
) {
    operator fun invoke(theme : ThemeApp, callback : () -> Unit ) {
        themeRepository.save(theme,callback)
    }
}