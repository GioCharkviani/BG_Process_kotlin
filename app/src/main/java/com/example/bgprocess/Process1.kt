package com.example.bgprocess

import android.content.Context
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class Process1(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {
    override fun doWork(): Result {
        doSomething(this.javaClass.name)

        val strArr = arrayOf("item 1", "item 2", "item 3")

        val data = Data.Builder()
            .putStringArray("KEY", strArr)
            .build()

        return Result.success(data);
    }
}