package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.application.LambdaApplication
import com.lambdaschool.android.organization.model.Order
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Order Details"
        setContentView(R.layout.activity_main)

        displayProductDetails((application as LambdaApplication).appProduct)
    }

    private fun displayProductDetails(order: Order) {

        productName.text = TextUtils.formatProduct(order.productName)
        productDescription.text = TextUtils.formatProductInfo(order.productDescription)
        productPrice.text = TextUtils.formatCurrency(order.productPrice)
        productTax.text = TextUtils.formatCurrency(order.productTax)
        totalProductPrice.text = TextUtils.formatCurrency(order.productTotal)
        productDiscount.text = TextUtils.formatPercent(order.productDiscount)
        orderDate.text = DateUtils.formatDate(order.orderDate)

    }
}
