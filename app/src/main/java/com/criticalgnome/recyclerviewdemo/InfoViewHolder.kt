package com.criticalgnome.recyclerviewdemo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_info.view.*

class InfoViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvTitle = view.tv_info_title
    val tvValue = view.tv_info_value
}