package com.aridev.cordero.starwarsapp.domain.model

import com.aridev.cordero.starwarsapp.data.Categories
import java.io.Serializable

/**
 * Created by Eduardo Medina on 4/03/22.
 */
class Category  (
    var type: Categories,
    var status: Boolean
) : Serializable