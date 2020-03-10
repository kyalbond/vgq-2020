package com.example.vgq_2020.home

import com.example.vgq_2020.home.HomeContract.HomePresenter

class HomePresenter(_activity: HomeActivity): HomePresenter {

    private var view: HomeActivity = _activity

    init {
        view.initView()
    }

}