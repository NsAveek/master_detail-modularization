package com.example.feature.primary.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feature.primary.details.ui.DetailFragment

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DetailFragment.newInstance())
                .commitNow()
        }
    }
}