package com.lambdaschool.android.organization.application

import android.app.Application
import com.lambdaschool.android.organization.model.Order

class LambdaApplication : Application() {
    // todo: Maybe define a model in this class?

    val appProduct = Order(productName = "Shampoo")


}