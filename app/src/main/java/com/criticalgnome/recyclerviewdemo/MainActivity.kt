package com.criticalgnome.recyclerviewdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = SettingsListAdapter()

        rView.layoutManager = LinearLayoutManager(this)
        rView.adapter = adapter

        adapter.add(InfoItem("User Name", "Leo Allford"))
        adapter.add(InfoItem("Balance", "350 $"))
        adapter.add(InfoItem("Tariff", "Business"))
        adapter.add(SwitchItem(1, "Send Notifications") { itemId, userChoice -> onCheck(itemId, userChoice) })
        adapter.add(SwitchItem(2, "Send News on Email") { itemId, userChoice -> onCheck(itemId, userChoice) })
    }

    private fun onCheck(itemId: Int, userChoice: Boolean) {
        when (itemId) {
            1 -> Toast.makeText(this, "Notification now set as $userChoice", Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(this, "Send news now set as $userChoice", Toast.LENGTH_SHORT).show()
        }
    }
}
