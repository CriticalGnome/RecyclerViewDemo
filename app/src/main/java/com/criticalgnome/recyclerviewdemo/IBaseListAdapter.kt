package com.criticalgnome.recyclerviewdemo

interface IBaseListAdapter<T> {
    fun add(newItem: T)
    fun add(newItems: ArrayList<T>?)
    fun addAtPosition(pos: Int, newItem: T)
    fun remove(pos: Int)
    fun clearAll()
}