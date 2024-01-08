package com.ardaisitan.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.ardaisitan.navigationcomponent.databinding.FragmentDetailPageBinding
import com.google.android.material.snackbar.Snackbar


class DetailPage : Fragment() {
    private lateinit var binding: FragmentDetailPageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailPageBinding.inflate(inflater, container, false)

        val bundle: DetailPageArgs by navArgs()


        val name = bundle.name
        val age = bundle.age
        val surname = bundle.surname
        val productId = bundle.product.productid
        val productName = bundle.product.productName

        binding.textView2.text =
            "Name:$name Surname:$surname Age:$age productId:$productId \nproductName:$productName"


        val backPressed = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() { // Back tusuna basilinca ne olacak onu yazariz.
                Snackbar.make(binding.textView2,"Geri Donmek istiyor musunuz ?",Snackbar.LENGTH_SHORT)
                    .setAction("Evet"){
                        isEnabled = false // Geri Donus Aktif Edildi.
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                       // Geri donus gerceklesir.
                    }

                    .show()
            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPressed)  // Aktif ediyoruz,yasam dongusuyle senkronize calisir.
        // back tusuna ozel bir davranis eklemek ,ozellestirmek icin kullanabiliriz.


        return binding.root
    }

}