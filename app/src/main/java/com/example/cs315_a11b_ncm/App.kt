package com.example.cs315_a11b_ncm

import android.app.Application
import android.annotation.SuppressLint
import android.content.Context

class App : Application()
{
    override fun onCreate()
    {
        super.onCreate()
        context = this
    }

    companion object
    {
        @SuppressLint("StaticFieldLeak")
        var context: Context? = null
            private set
    }
}