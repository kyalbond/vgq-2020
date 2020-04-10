package com.example.vgq_2020.ui.category

class CatergoryPresenter(activity: CategoryActivity): CategoryContract.Presenter {

    private var view: CategoryActivity = activity;

    init {
        view.initView();
    }

    override fun getCategory(): String {
        TODO("create model") //To change body of created functions use File | Settings | File Templates.
    }

}