package com.ardaisitan.navigationcomponenthw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ardaisitan.navigationcomponenthw.databinding.FragmentHomePageBinding


class HomePage : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomePageBinding.inflate(layoutInflater, container, false)

        binding.goA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageADirection)
        }

        binding.goX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageXDirection)
        }

        return binding.root
    }

}