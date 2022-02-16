package com.example.brainfor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    fun Back4(view: View) { this.finish();
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)}

    fun Back3(view: View) {this.finish();
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)}
}