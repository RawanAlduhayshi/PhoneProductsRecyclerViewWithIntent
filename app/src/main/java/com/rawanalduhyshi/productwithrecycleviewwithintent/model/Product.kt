package com.rawanalduhyshi.productwithrecycleviewwithintent.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Product(
    @DrawableRes
    val productImage: Int,
    @StringRes
    val productName: Int,
    val productPrice: String,
    val isVip: Boolean,
    val productQuantity: Int
) {

}