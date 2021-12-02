package com.example.basicnavigation.ui.right

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.basicnavigation.R
import com.example.basicnavigation.databinding.FragmentRightBinding
import com.squareup.picasso.Picasso

class RightFragment : Fragment() {

    private lateinit var binding: FragmentRightBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRightBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Picasso.get().load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png").into(binding.ivRightImage)
    }

}