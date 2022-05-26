package dev.joanmuthoni.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class wedshootActivity5 : AppCompatActivity() {
    lateinit var btnb: Button
    lateinit var btnn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wedshoot5)
        btnb=findViewById(R.id.btnb)
        btnb.setOnClickListener {
            var intent= Intent(this,shootActivity4::class.java)
            startActivity(intent)
        }
        btnn=findViewById(R.id.btnn)
        btnn.setOnClickListener {
            var intent= Intent(this,wedcakeActivity6::class.java)
            startActivity(intent)
        }

        }


    }

