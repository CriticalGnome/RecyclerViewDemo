package com.criticalgnome.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class SimpleListAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(), IBaseListAdapter<IBaseListItem> {

    protected val items: ArrayList<IBaseListItem> = ArrayList()

    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = items[position].layoutId

    protected fun inflateByViewType(context: Context?, viewType: Int, parent: ViewGroup) =
            LayoutInflater.from(context).inflate(viewType, parent, false)

    override fun add(newItem: IBaseListItem) {
        items.add(newItem)
        notifyDataSetChanged()
    }

    override fun add(newItems: ArrayList<IBaseListItem>?) {
        for (newItem in newItems ?: return) {
            items.add(newItem)
            notifyDataSetChanged()
        }
    }

    override fun addAtPosition(pos: Int, newItem: IBaseListItem) {
        items.add(pos, newItem)
        notifyDataSetChanged()
    }

    override fun remove(pos: Int) {
        items.removeAt(pos)
        notifyDataSetChanged()
    }

    override fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

}