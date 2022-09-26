package com.example.proteintracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import android.widget.Toast
import kotlin.properties.Delegates

class HelpActivity : AppCompatActivity() {
    private var backPressedTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        if(intent.extras != null){
            var bundle : Bundle ?= intent.extras
            var strTes : String = bundle?.getString("tesText").toString()
            Snackbar.make(getWindow().getDecorView().getRootView(),strTes,
                Snackbar.LENGTH_LONG).show()
        }
    }
    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            //super.onBackPressed()
            finishAffinity()
        } else {
            Toast.makeText(this, "Press back again to leave the app.", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}