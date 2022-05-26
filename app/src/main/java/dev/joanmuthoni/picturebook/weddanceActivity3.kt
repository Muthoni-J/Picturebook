package dev.joanmuthoni.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class weddanceActivity3 : AppCompatActivity() {
    lateinit var btnnxt: Button
    lateinit var btnprev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weddance3)
        btnnxt=findViewById(R.id.btnnxt)
        btnnxt.setOnClickListener {
            var intent= Intent(this,shootActivity4::class.java)
            startActivity(intent)
        }
        btnprev=findViewById(R.id.btnprev)
        btnprev.setOnClickListener {
            var intent= Intent(this,weddingActivity2::class.java)
            startActivity(intent)
        }


    }
    }

