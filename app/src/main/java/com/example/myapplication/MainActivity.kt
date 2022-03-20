package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.feature.primary.master.di.LoggerHomeFragment
import com.example.myapplication.di.LoggerBase
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var loggerBase:LoggerBase

    @Inject
    lateinit var loggerHomeFragment: LoggerHomeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,loggerHomeFragment.testCall(), Toast.LENGTH_LONG).show()
    }
}