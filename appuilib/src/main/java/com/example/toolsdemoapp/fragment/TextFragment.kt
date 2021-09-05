package com.example.toolsdemoapp.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.toolsdemoapp.databinding.LayoutTextFragmentBinding

class TextFragment : Fragment() {

    private lateinit var binding: LayoutTextFragmentBinding

    companion object {
        @JvmStatic
        fun getInstance(): TextFragment = TextFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = LayoutTextFragmentBinding.inflate(inflater, container, false)
        binding.textView.setOnClickListener {
            binding.textView.setTextColor(Color.RED)
            Toast.makeText(it.context,"TextView clicked.", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

}