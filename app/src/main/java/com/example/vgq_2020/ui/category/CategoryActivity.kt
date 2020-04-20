package com.example.vgq_2020.ui.category

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.vgq_2020.R
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.activity_category.view.*
import kotlinx.android.synthetic.main.category_card.*
import kotlinx.android.synthetic.main.category_card.view.*

class CategoryActivity : AppCompatActivity(), CategoryContract.View {

    private var presenter: CategoryPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        presenter = CategoryPresenter(this)

        card_category.text = "hi"
        category_card2.card_category.text = "fuk"
    }

    override fun initView() {
        val categories = presenter?.getCategory()
    }
}
