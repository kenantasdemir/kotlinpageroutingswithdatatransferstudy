package com.kenant42.kotlinpageroutingswithdatatransferstudy

import java.io.Serializable

data class User(
    var name: String = "",
    var age: Int = 0,
    var height: Double = 0.0,
    var isMarried: Boolean = false
) : Serializable {
}