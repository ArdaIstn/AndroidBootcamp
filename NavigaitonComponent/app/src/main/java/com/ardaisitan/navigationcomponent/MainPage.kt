package com.ardaisitan.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ardaisitan.navigationcomponent.databinding.FragmentMainPageBinding


class MainPage : Fragment() {

    private lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        //Ana sayfanın fragmenti neyse veri gonderirken sonuna direction gelir,veri alan kisimda ise sonuna args eki gelir.

        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        binding.buttonDetail.setOnClickListener {
            //Snackbar.make(it,"Hello",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Hello"
            val product = Products(100, "Laptop")
            val goTo = MainPageDirections.detailDirection("Arda", "Işıtan", 24, product)


            Navigation.findNavController(it)
                .navigate(goTo) // Fragmentlar degisti fakat biz ayni activity uzerindeyiz.
        }

        binding.showBottomSheet.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomSheetDirection)
        }

        return binding.root

    }


}