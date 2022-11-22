package com.tunahanozatac.ktlintexample
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = "123"
        if (test == "") {
            Log.d("TAG", "Test Boş")
        }
    }
}
