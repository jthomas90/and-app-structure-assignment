package com.lambdaschool.android.organization.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        @SuppressLint("SimpleDateFormat")
        fun formatDate(date: Date) : String {
            val format = SimpleDateFormat("dd/MM/yyy")
            return format.format(date)
        }

        //test
        // This is a good source for dates in Kotlin https://www.baeldung.com/kotlin-dates

    }
}