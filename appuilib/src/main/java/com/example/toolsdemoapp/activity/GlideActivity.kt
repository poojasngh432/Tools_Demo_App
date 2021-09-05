package com.example.toolsdemoapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.toolsdemoapp.R
import com.example.toolsdemoapp.databinding.ActivityGlideBinding
import com.example.toolsdemoapp.databinding.ActivityImagesBinding

class GlideActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGlideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUrl.setOnClickListener {
            val url: String? = null
            Glide.with(binding.imageView.context)
                .load(url)
                .placeholder(R.drawable.bg_placeholder)
                .error(R.drawable.bg_placeholder)
                .transition(DrawableTransitionOptions.withCrossFade()).into(binding.imageView)
        }
    }
}