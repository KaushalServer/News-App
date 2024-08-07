package com.example.newsapp.models

import java.io.Serializable

data class Source(
    val id: String? = null,
    val name: String = ""
) : Serializable {
    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + name.hashCode()
        return result
    }
}