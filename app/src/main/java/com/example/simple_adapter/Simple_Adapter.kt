package com.example.simple_adapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.lv)

        val items = listOf(
            mapOf("it" to "Item 1", "itPrice" to "10 Dh"),
            mapOf("it" to "Item 2", "itPrice" to "15 Dh"),
            mapOf("it" to "Item 3", "itPrice" to "20 Dh"),
            mapOf("it" to "Item 4", "itPrice" to "25 Dh")
        )

        listView.adapter = SimpleAdapter(
            this,
            items,
            R.layout.list_item,
            arrayOf("it", "itPrice"),
            intArrayOf(R.id.text1, R.id.text2)
        )
    }
}
