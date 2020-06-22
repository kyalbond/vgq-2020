package com.example.vgq_2020.model.data

class Category (val title: String,
                val questions: List<String>){

}

class Questions (val code: String,
                 val answers: List<String>,
                 val hints: List<String>,
                 val imgURL: String){

}