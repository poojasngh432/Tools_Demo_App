package com.example.toolsdemoapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolsdemoapp.R
import com.example.toolsdemoapp.databinding.ActivityImagesBinding

class ImagesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImagesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.picassoBtn.setOnClickListener {
            val intent = Intent(this@ImagesActivity, PicassoActivity::class.java)
            startActivity(intent)
        }
    }
}