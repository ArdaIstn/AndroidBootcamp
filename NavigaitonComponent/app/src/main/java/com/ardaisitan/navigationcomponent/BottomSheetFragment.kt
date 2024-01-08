package com.ardaisitan.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ardaisitan.navigationcomponent.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar


class BottomSheetFragment :
    BottomSheetDialogFragment() { // BottomSheetDialogFragment'dan miras almasi gerekiyor,aksi halde gosterim islemlerini yapamayiz.
    private lateinit var binding: FragmentBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentBottomSheetBinding.inflate(layoutInflater, container, false)

        binding.copy.setOnClickListener {
            Snackbar.make(it, "Copied!", Snackbar.LENGTH_SHORT).show()
        }

        binding.share.setOnClickListener {
            Snackbar.make(it, "Shared!", Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }


}