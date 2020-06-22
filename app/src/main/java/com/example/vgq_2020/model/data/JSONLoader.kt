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
                    "    { \"title\":\"Characters\", \"questions\":[ \"c01-01\" ]},\n" +
                    "    { \"title\":\"Logos\", \"questions\":[ \"l01-01\" ] },\n" +
                    "    { \"title\":\"Stage\", \"questions\":[ \"s01-01\" ] },\n" +
                    "    { \"title\":\"Music\", \"questions\":[ \"m01-01\" ] }\n" +
                    "]\n")
            if (result != null) {
                result.forEach { Log.e(it.title.toString(), it.questions.toString()) }
                return result;
            }
            return null
        }
    }
}