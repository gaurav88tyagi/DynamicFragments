package com.example.dynamicfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_fruits.view.*

class FruitsFragment : Fragment() {

    val fruits = arrayOf(
        "Apple", "Orange", "Banana",
        "Pineapple", "Grapes", "Pomegranate",
        "Kiwi", "Watermelon", "Cherry",
        "Apple", "Orange", "Banana",
        "Pineapple", "Grapes", "Pomegranate",
        "Kiwi", "Watermelon", "Cherry",
        "Apple", "Orange", "Banana",
        "Pineapple", "Grapes", "Pomegranate",
        "Kiwi", "Watermelon", "Cherry"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentView = inflater.inflate(R.layout.fragment_fruits, container, false)

        fragmentView.lvFruits.adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.activity_list_item,
            android.R.id.text1,
            fruits
        )

        return fragmentView

    }
}
