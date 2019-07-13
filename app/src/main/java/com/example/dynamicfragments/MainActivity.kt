package com.example.dynamicfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFruits.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flFragmentContainer, FruitsFragment())
                .commit()
        }

        btnVegetables.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flFragmentContainer, VegetablesFragment())
                .commit()
        }

        btnClear.setOnClickListener {
            supportFragmentManager.findFragmentById(R.id.flFragmentContainer)?.let { it1 ->
                supportFragmentManager
                    .beginTransaction()
                    .remove(it1)
                    .commit()
            };
        }

    }
}
