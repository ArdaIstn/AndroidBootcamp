package com.ardaisitan.navigationcomponenthw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ardaisitan.navigationcomponenthw.databinding.FragmentPageBBinding


class PageB : Fragment() {

    private lateinit var binding : FragmentPageBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageBBinding.inflate(layoutInflater,container,false)

        binding.goY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageBtoYDirection)
        }

        return binding.root
    }

}