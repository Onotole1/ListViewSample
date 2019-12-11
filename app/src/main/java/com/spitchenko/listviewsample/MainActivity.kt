package com.spitchenko.listviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CatsAdapter(
            this,
            arrayListOf(
                Cat(
                    "Пушок", R.drawable.blackangel
                ),
                Cat(
                    "Мурёна", R.drawable.frederika
                ),
                Cat(
                    "Василиск", R.drawable.sepik
                ),
                Cat(
                    "Барсик", R.drawable.melisenta
                )
            )
        )

        catsListView.adapter = adapter
    }
}
