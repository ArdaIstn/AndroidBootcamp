package com.ardaisitan.navigationcomponenthw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ardaisitan.navigationcomponenthw.databinding.FragmentPageXBinding


class PageX : Fragment() {
private lateinit var binding : FragmentPageXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageXBinding.inflate(layoutInflater,container,false)

        binding.goXtoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.pageYDirection)
        }
        return binding.root
    }


}