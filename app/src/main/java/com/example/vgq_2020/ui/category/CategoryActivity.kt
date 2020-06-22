package com.example.vgq_2020.ui.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vgq_2020.R
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.activity_category.view.*
import kotlinx.android.synthetic.main.category_card.*
import kotlinx.android.synthetic.main.category_card.view.*


class CategoryActivity : AppCompatActivity(), CategoryContract.View {

    private var presenter: CategoryPresenter? = null
    private lateinit var linearLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        presenter = CategoryPresenter(this)
        setupCategories()
}

    override fun setupCategories() {
        val categories = presenter?.getCategory()


    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
