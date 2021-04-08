package com.example.areyoubored.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.areyoubored.R

class FavoritesFragment : Fragment() {

    private lateinit var favoritesModel: FavoritesModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        favoritesModel =
                ViewModelProvider(this).get(FavoritesModel::class.java)
        val view = inflater.inflate(R.layout.fragment_favorites, container, false)


        return view
    }
}