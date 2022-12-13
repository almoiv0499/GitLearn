package ru.data.gitlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test(generateString())
        test1(generateString())
        test1(generateString())


    }

    private fun generateString(): String = "Testing"

    private fun test(value: String): String = "Hello world! $value"
    private fun test1(value: String): String = "Hello world! $value"

}