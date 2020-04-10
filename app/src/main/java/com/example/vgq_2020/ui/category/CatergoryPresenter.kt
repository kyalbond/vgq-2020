package com.example.vgq_2020.ui.category

class CatergoryPresenter(activity: CategoryActivity): CategoryContract.Presenter {

    private var view: CategoryActivity = activity;

    init {
        view.initView();
    }

}