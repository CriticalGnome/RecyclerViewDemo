package com.criticalgnome.recyclerviewdemo

class SwitchItem(
        val id: Int,
        val title: String,
        val actionOnReceive: (itemId: Int, userChoice: Boolean) -> Unit
): IBaseListItem {
    override val layoutId = R.layout.item_switch
}