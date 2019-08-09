package com.lambdaschool.android.organization.model




class Product(
    val productName: String = "Shampoo",
    val productDescription: String = "Naturally conditions the scalp",
    val productPrice: Double = 7.99,
    val productTax: Double = productPrice * .075,
    val productDiscount: Double = .50
)