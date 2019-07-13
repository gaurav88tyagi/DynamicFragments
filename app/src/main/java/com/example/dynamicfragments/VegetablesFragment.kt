package com.example.dynamicfragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_vegetables.view.*

class VegetablesFragment : Fragment() {

    val vegetables = arrayListOf<String>(
            "Potato", "Onion", "Tomato",
            "Lettuce", "Carrot", "Capsicum",
            "Gourd", "Pumpkin", "Radish",
            "Potato", "Onion", "Tomato",
            "Lettuce", "Carrot", "Capsicum",
            "Gourd", "Pumpkin", "Radish",
            "Potato", "Onion", "Tomato",
            "Lettuce", "Carrot", "Capsicum",
            "Gourd", "Pumpkin", "Radish"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentView = inflater.inflate(R.layout.fragment_vegetables, container, false)

        fragmentView.lvVegetables.adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.activity_list_item,
            android.R.id.text1,
            vegetables
        )

        return fragmentView

    }
}
