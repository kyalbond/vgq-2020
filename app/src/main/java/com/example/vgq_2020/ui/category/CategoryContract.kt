package com.example.vgq_2020.ui.category

import com.example.vgq_2020.model.data.Category
import com.example.vgq_2020.ui.BasePresenter
import com.example.vgq_2020.ui.BaseView

interface CategoryContract {

    interface View: BaseView{
        fun setupCategories()
    }

    interface  Presenter: BasePresenter {
        fun getCategory(): List<Category>?
    }
}