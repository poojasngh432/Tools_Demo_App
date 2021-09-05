package com.example.toolsdemoapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolsdemoapp.R
import com.example.toolsdemoapp.databinding.ActivityFragmentsBinding
import com.example.toolsdemoapp.fragment.ImageFragment
import com.example.toolsdemoapp.fragment.TextFragment

class FragmentsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListeners()
    }

    private fun setClickListeners() {
        binding.fragmentBtn1.setOnClickListener {
            val textFragment = TextFragment()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragment_container, textFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        binding.fragmentBtn2.setOnClickListener {
            val imageFragment = ImageFragment()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragment_container, imageFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

}