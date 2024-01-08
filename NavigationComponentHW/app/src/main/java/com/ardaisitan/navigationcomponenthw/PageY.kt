package com.ardaisitan.navigationcomponenthw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ardaisitan.navigationcomponenthw.databinding.FragmentPageYBinding


class PageY : Fragment() {
    private lateinit var binding: FragmentPageYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageYBinding.inflate(layoutInflater, container, false)

        val onBackPressed = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().popBackStack(R.id.homePage, false)
                // Bu kodda fragmentin bagli oldugu navControlleri kullanarak R.id.homePage'e kadar olan tum fragmentlari backStackten siler.
                //2. inclusive parametresi için de bu işlemin hedef fragment olan R.id.homePage'in de dahil edilip edilmeyecegi bildirilir.
                //Eger false olarak ayarlanirsa hedef fragment backstackten cikarilmaz sadece hedefe kadar olan fragmentlar cikarilir.

            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressed)







        return binding.root
    }


}