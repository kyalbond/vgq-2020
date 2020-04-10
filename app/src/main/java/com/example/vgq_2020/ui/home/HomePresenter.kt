package com.example.vgq_2020.ui.home

class HomePresenter(_activity: HomeActivity): HomeContract.Presenter {

    private var view: HomeActivity = _activity

    init {
        view.initView()
    }

    override fun getPercentage(): String {
        TODO("create model") //To change body of created functions use File | Settings | File Templates.
    }

}