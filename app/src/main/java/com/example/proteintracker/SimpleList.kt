package com.example.proteintracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.snackbar.Snackbar

class SimpleList : AppCompatActivity() {
    var items = arrayOf(
        "lorem", "ipsum", "dolor", "sit", "amet",
        "consectetuer", "adipiscing", "elit", "morbi", "vel",
        "ligula", "vitae", "arcu", "aliquet", "mollis",
        "etiam", "vel", "erat", "placerat", "ante",
        "porttitor", "sodales", "pellentesque", "augue", "purus"
    )
    lateinit var lvSample : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list)

        lvSample = findViewById(R.id.lvSample)
        lvSample.adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, items )

        lvSample.setOnItemClickListener { parent, view, i, l ->
            Snackbar.make(view,"Anda memilih: ${items[i]}",
                Snackbar.LENGTH_LONG).show()
        }

    }
}