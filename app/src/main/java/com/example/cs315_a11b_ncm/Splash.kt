package com.example.cs315_a11b_ncm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.content.Intent
import android.os.Handler

class Splash : AppCompatActivity()
{
    var mHandler: Handler? = null
    var mRunnable: Runnable? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mHandler = Handler(Looper.getMainLooper())
        mRunnable = Runnable {
            val intent = Intent(this@Splash, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        mHandler!!.postDelayed(mRunnable!!, 3000)
    }
}