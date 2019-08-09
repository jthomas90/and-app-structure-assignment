package com.lambdaschool.android.organization.util

import com.lambdaschool.android.organization.model.Product
import java.text.NumberFormat

class TextUtils {
    companion object {
        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(price : Double) : String {
            return NumberFormat.getCurrencyInstance().format(price)
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(discount : Double) : String {
            return "${NumberFormat.getPercentInstance().format(discount)} discount"
        }

        fun formatProduct(name: String , product: String): String {
            return "$name , $product"
        }

    }
}