package dev.joanmuthoni.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class wedcakeActivity6 : AppCompatActivity() {
    lateinit var btnback: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wedcake6)
        btnback=findViewById(R.id.btnback)
        btnback.setOnClickListener {
            var intent= Intent(this,wedshootActivity5::class.java)
            startActivity(intent)
        }
    }
}