package com.example.brainfor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Methodica(view: View) {

    }

    fun Start(view: View) { this.finish();
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)}

    fun Methodica2(view: View) {this.finish();
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)}
}