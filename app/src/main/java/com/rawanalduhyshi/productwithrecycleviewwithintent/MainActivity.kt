package com.rawanalduhyshi.productwithrecycleviewwithintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.rawanalduhyshi.productwithrecycleviewwithintent.adapter.ProductAdapter

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      findViewById<RecyclerView>(R.id.grid_recycler_view).adapter = ProductAdapter(this)
        findViewById<RecyclerView>(R.id.grid_recycler_view).setHasFixedSize(true)

    }


    }
