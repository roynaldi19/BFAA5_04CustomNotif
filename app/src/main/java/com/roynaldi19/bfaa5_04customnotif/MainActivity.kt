package com.roynaldi19.bfaa5_04customnotif

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_show_notification.setOnClickListener {
            startService(Intent(this, NotificationService::class.java))
        }
    }
}