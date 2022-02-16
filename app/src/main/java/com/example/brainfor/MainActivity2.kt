package com.example.brainfor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun ChooseMethod(view: View) { this.finish();
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)}

    fun textClick(view: View) {
        this.finish();
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun ChooseMain(view: View) { this.finish();
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)}
}