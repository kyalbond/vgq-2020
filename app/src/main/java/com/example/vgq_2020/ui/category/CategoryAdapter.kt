package com.example.vgq_2020.ui.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vgq_2020.R
import com.example.vgq_2020.model.data.Category
import kotlinx.android.synthetic.main.category_card.view.*

class CategoryAdapter(private val categoryList: List<Category>, listener: OnCategoryListener) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>()  {

    private val onCategoryListener: OnCategoryListener = listener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.category_card,
            parent, false)

        return CategoryViewHolder(itemView, onCategoryListener)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentItem = categoryList[position]

        holder.categoryLevel.text = currentItem.level
        holder.categoryName.text = currentItem.categoryName
    }

    override fun getItemCount() = categoryList.size

    class CategoryViewHolder(itemView: View, listener: OnCategoryListener): RecyclerView.ViewHolder(itemView),  View.OnClickListener {
        val categoryLevel: TextView = itemView.card_level
        val categoryName: TextView = itemView.card_category

        private val onCategoryListener: OnCategoryListener = listener;

        init {
              itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            onCategoryListener.onCategoryClick(adapterPosition)
        }
    }

    interface OnCategoryListener{
        fun onCategoryClick(position: Int)
    }
}
