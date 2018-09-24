package com.criticalgnome.recyclerviewdemo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_switch.view.*

class SwitchViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvTitle = view.tv_switch_title
    val tvValue = view.tv_switch_value
}