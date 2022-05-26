package dev.joanmuthoni.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
     lateinit var btnfirst: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnfirst= findViewById(R.id.btnfirst)
        btnfirst.setOnClickListener{
            val intent = Intent (this,weddingActivity2 ::class.java)
            startActivity(intent)
        }

    }
}