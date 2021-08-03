package com.example.toolsdemoapp.fragment

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.toolsdemoapp.R
import com.example.toolsdemoapp.databinding.LayoutImageFragmentBinding

class ImageFragment : Fragment() {

    private lateinit var binding: LayoutImageFragmentBinding

    companion object {
        @JvmStatic
        fun getInstance(): ImageFragment = ImageFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = LayoutImageFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

}