package com.criticalgnome.recyclerviewdemo

class InfoItem(
        val title: String,
        val value: String
): IBaseListItem {
    override val layoutId = R.layout.item_info
}