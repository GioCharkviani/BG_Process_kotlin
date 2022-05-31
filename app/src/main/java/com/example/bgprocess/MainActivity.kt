package com.example.bgprocess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val process1 = OneTimeWorkRequestBuilder<Process1>()
            .build()

        val process2 = OneTimeWorkRequestBuilder<Process2>()
            .build()

        WorkManager.getInstance(this)
            .beginWith(process1)
            .then(process2)
            .enqueue()
    }
}