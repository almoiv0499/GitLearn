package ru.data.gitlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test(generateInt())
    }

    private fun generateInt() = Math.random().toInt()

    private fun test(value: Int): String = "Hello world! $value"

}