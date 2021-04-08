package com.example.areyoubored.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.areyoubored.R

class RandomFragment : Fragment() {

    private lateinit var randomViewModel: RandomViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        randomViewModel = ViewModelProvider(this).get(RandomViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_random, container, false)

        return view
    }
}