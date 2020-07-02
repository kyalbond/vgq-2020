package com.example.vgq_2020.ui.category

import android.util.Log
import com.example.vgq_2020.model.data.Category
import com.example.vgq_2020.model.data.JSONLoader

class CategoryPresenter(activity: CategoryActivity): CategoryContract.Presenter {

    private var view: CategoryActivity = activity;

    init {

    }

    override fun getCategory(): List<Category>? {
        return JSONLoader().getCategories()
    }

}