package com.lambdaschool.android.organization.model

import java.util.*


class Order(
    val productName: String = "Shampoo",
    val productDescription: String = "Naturally conditions the scalp",
    val productPrice: Double = 7.99,
    val productTax: Double = productPrice * .075,
    val productDiscount: Double = .10,
    val productTotal: Double = productPrice + productTax,
    val orderDate: Date = Date()
    )