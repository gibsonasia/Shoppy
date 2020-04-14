package com.truhbelstudios.shoppy

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val products = arrayListOf<Product>()

        for(i in 0..100)(
                products.add(Product("Truhbel T-shirt", "https://vangogh.teespring.com/v3/image/S-wcjXCnDH3eWFfwy-_ooxeXPYo/480/560.jpg", 21.00))
                )

        recycler_view.apply{
            layoutManager = GridLayoutManager(this@MainActivity,2)
            adapter = ProductAdapter(products)
        }
    }
}
