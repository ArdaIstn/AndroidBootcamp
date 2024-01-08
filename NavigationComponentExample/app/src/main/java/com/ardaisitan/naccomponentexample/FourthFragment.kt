package com.ardaisitan.naccomponentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.ardaisitan.naccomponentexample.databinding.FragmentFourthBinding


class FourthFragment : Fragment() {
    private lateinit var binding: FragmentFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFourthBinding.inflate(layoutInflater, container, false)

        val bundle: FourthFragmentArgs by navArgs()

        val person = bundle.person
        
        binding.printInfo.text =
            "Name:${person.name}\nSurname:${person.surname}\nAge:${person.age}\nId:${person.id}"





        return binding.root
    }


}