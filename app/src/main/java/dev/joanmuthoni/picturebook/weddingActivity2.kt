package dev.joanmuthoni.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class weddingActivity2 : AppCompatActivity() {
    lateinit var btnnext:Button
    lateinit var btnpre:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wedding2)
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            var intent=Intent(this,weddanceActivity3::class.java)
            startActivity(intent)
        }
        btnpre=findViewById(R.id.btnpre)
        btnpre.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}