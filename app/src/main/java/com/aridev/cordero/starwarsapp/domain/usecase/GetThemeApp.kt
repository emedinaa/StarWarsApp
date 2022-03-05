package com.aridev.cordero.starwarsapp.domain.usecase

import com.aridev.cordero.starwarsapp.domain.repository.ThemeRepository
import javax.inject.Inject

class GetThemeApp @Inject constructor(
    private val themeRepository: ThemeRepository
)  {
    operator fun invoke(callback :(theme : String) -> Unit) {
        themeRepository.read(callback)
    }
}