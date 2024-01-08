package com.ardaisitan.naccomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ardaisitan.naccomponentexample.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)

        binding.buttonFb.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.goFenerbahce)

        }

        binding.buttonGs.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goGalatasaray)
        }


        binding.sendData.setOnClickListener {
            val person = PersonInfo("Arda", "Işıtan", 24, 222222222222)
            val direction = FirstFragmentDirections.goFourthPage(person)

            Navigation.findNavController(it).navigate(direction)

        }


        return binding.root
    }


}