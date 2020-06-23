package com.example.vgq_2020.model.data

class Category (val categoryName: String,
                val level: String,
                val questionList: List<String>){

}

class Questions (val code: String,
                 val answers: List<String>,
                 val hints: List<String>,
                 val imgURL: String){

}