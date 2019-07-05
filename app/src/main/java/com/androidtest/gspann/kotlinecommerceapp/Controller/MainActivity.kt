package com.androidtest.gspann.kotlinecommerceapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.androidtest.gspann.kotlinecommerceapp.Adapter.CategoryAdapter
import com.androidtest.gspann.kotlinecommerceapp.Adapter.CategoryRecycleAdapter
import com.androidtest.gspann.kotlinecommerceapp.Model.Category
import com.androidtest.gspann.kotlinecommerceapp.R
import com.androidtest.gspann.kotlinecommerceapp.Services.DataService
import com.androidtest.gspann.kotlinecommerceapp.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
                    println(category.title)

            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)

        }
        listViewLayout.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listViewLayout.layoutManager = layoutManager
        listViewLayout.setHasFixedSize(true)

    }
}
