package dev.joanmuthoni.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shootActivity4 : AppCompatActivity() {
    lateinit var btnnt: Button
    lateinit var btnnet: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoot4)
        btnnt=findViewById(R.id.btnnt)
        btnnt.setOnClickListener {
            var intent= Intent(this,weddanceActivity3::class.java)
            startActivity(intent)
        }
        btnnet=findViewById(R.id.btnnet)
        btnnet.setOnClickListener {
            var intent= Intent(this,wedshootActivity5::class.java)
            startActivity(intent)
        }


    }
    }
