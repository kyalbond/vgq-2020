package com.example.vgq_2020.ui.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vgq_2020.R
import kotlinx.android.synthetic.main.activity_category.*


class CategoryActivity : AppCompatActivity(), CategoryContract.View {

    private lateinit var presenter: CategoryPresenter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var categoryAdapter: CategoryAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        presenter = CategoryPresenter(this)
        setupCategories()
}

    override fun setupCategories() {
        val categories= presenter.getCategory()

        category_recycler_view.adapter = categories?.let { CategoryAdapter(it) }
        category_recycler_view.layoutManager  = LinearLayoutManager(this)
        category_recycler_view.setHasFixedSize(true)

    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
