package com.example.vgq_2020.model.data

import android.content.res.Resources
import android.util.Log
import com.beust.klaxon.Klaxon
import java.io.File
import java.util.regex.Pattern

class JSONLoader {

    companion object {
        fun getCategories(): List<Category>? {
            val result = Klaxon().parseArray<Category>("[\n" +
                    "    { \"categoryName\":\"Characters\", \"level\": \"1\", \"questionList\":[ \"c01-01\" ]},\n" +
                    "    { \"categoryName\":\"Logos\", \"level\": \"2\", \"questionList\":[ \"l01-01\" ] },\n" +
                    "    { \"categoryName\":\"Stage\", \"level\": \"3\", \"questionList\":[ \"s01-01\" ] },\n" +
                    "    { \"categoryName\":\"Music\", \"level\": \"4\", \"questionList\":[ \"m01-01\" ] }\n" +
                    "]\n")
            if (result != null) {
                result.forEach { Log.e(it.categoryName.toString(), it.questionList.toString()) }
                return result;
            }
            return null
        }
    }
}