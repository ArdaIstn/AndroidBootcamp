package com.ardaisitan.navigationcomponenthw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ardaisitan.navigationcomponenthw.databinding.FragmentPageABinding


class PageA : Fragment() {

    private lateinit var binding : FragmentPageABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageABinding.inflate(layoutInflater,container,false)

        binding.goB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageBDirection)
        }

        return binding.root
    }


}