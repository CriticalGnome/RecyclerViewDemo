package com.criticalgnome.recyclerviewdemo

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SettingsListAdapter: SimpleListAdapter() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val context = parent.context
        return when (viewType) {
            R.layout.item_info -> InfoViewHolder(inflateByViewType(context, viewType, parent))
            R.layout.item_switch -> SwitchViewHolder(inflateByViewType(context, viewType, parent))
            else -> throw IllegalStateException("There is no match with current layoutId")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is InfoViewHolder -> {
                val infoItem = items[position] as InfoItem
                holder.tvTitle.text = infoItem.title
                holder.tvValue.text = infoItem.value
            }
            is SwitchViewHolder -> {
                val switchItem = items[position] as SwitchItem
                holder.tvTitle.text = switchItem.title
                holder.tvValue.setOnCheckedChangeListener { _, isChecked ->
                    switchItem.actionOnReceive.invoke(switchItem.id, isChecked)
                }
            }
            else -> throw IllegalStateException("There is no match with current holder instance")
        }
    }

}