package com.example.vgq_2020.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vgq_2020.R
import com.example.vgq_2020.home.HomeContract.*

class HomeActivity : AppCompatActivity(), HomeView {

    private var presenter: HomePresenter? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        presenter = HomePresenter(this)
    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
