package com.example.bgprocess

import android.content.Context
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class Process2(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {
    override fun doWork(): Result {
        doSomething(this.javaClass.name)

        val strArr = inputData.getStringArray("KEY");

        println(strArr)

        return Result.success();
    }
}