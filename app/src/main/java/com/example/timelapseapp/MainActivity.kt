package com.example.timelapseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cameraButton = findViewById<Button>(R.id.takeTimelapseBtn)
        val editButton = findViewById<Button>(R.id.editTimelapseBtn)

        clickButton(cameraButton)
        clickButton(editButton)
    }

    fun clickButton(button: Button) {
        button.setOnClickListener(View.OnClickListener {
            var intent = when(it?.id) {
                R.id.takeTimelapseBtn -> Intent(this,CameraActivity::class.java)
                R.id.editTimelapseBtn -> Intent(this,EditActivity::class.java)
                else -> null
            }
            intent?.let { startActivity(intent) }
        })
    }
}