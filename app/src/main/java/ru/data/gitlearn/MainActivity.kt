package ru.data.gitlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test(generateInt())
        
        val hello = "Hello"
        val hello1 = "Hello"
        val hello2 = "Hello"
    }

    private fun generateInt() = Math.random().toInt()

    private fun test(value: Int): String = "Hello world! $value"

}