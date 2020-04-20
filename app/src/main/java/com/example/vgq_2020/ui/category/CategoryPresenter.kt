package com.example.vgq_2020.ui.category

class CategoryPresenter(activity: CategoryActivity): CategoryContract.Presenter {

    private var view: CategoryActivity = activity;

    init {
        getCategory()
        view.initView();
    }

    override fun getCategory(): List<String> {
        return listOf("Characters", "Logos")
    }

}