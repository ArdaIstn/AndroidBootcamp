package com.ardaisitan.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ardaisitan.navigationcomponent.databinding.FragmentBottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar


class bottomSheetDialogFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBottomSheetDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBottomSheetDialogBinding.inflate(layoutInflater, container, false)

        binding.copyImage.setOnClickListener {
            Snackbar.make(it, "Copied!!", Snackbar.LENGTH_SHORT).show()
        }

        binding.shareImage.setOnClickListener {
            Snackbar.make(it, "Shared", Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }


}