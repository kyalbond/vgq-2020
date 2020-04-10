package com.example.vgq_2020.ui.home

import com.example.vgq_2020.ui.BasePresenter
import com.example.vgq_2020.ui.BaseView

interface HomeContract {

    interface View: BaseView{
    }

    interface Presenter: BasePresenter{
        fun getPercentage(): String
    }

}