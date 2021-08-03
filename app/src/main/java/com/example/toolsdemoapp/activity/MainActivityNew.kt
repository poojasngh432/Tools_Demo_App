package com.example.toolsdemoapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.toolsdemoapp.databinding.ActivityMainBinding

class MainActivityNew : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListeners()
    }

    /**
     * 1. Dialog Boxes  2. Fragments  3. Views  4. Grids  5. RecyclerView  6. Bottomsheet  7. Login
     * 8. Nested Scrolling  9. Bottom Nav  10. Draggable Items  11. Images  12. Video  13. Music
     * 14. Select File from device  15. Menu  16. Error Messages
     */

    private fun setClickListeners() {

        binding.dialogBoxesBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, DialogBoxesActivity::class.java)
            startActivity(intent)
        }
        binding.fragmentsBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, FragmentsActivity::class.java)
            startActivity(intent)
        }
        binding.errorMessagesBtn.setOnClickListener {

        }
        binding.viewsBtn.setOnClickListener {

        }
        binding.actionBarBtn.setOnClickListener {

        }
        binding.loginBtn.setOnClickListener {

        }
        binding.touchListenersBtn.setOnClickListener {

        }
        binding.freezeLayoutOnTopBtn.setOnClickListener {

        }
        binding.scrollingBtn.setOnClickListener {

        }
        binding.permissionsBtn.setOnClickListener {

        }
        binding.sendEmailBtn.setOnClickListener {

        }
        binding.recyclerViewBtn.setOnClickListener {

        }
        binding.draggableItemsBtn.setOnClickListener {

        }
        binding.bottomNavBtn.setOnClickListener {

        }
        binding.bottomNavBtn2.setOnClickListener {

        }
        binding.picassoBtn.setOnClickListener {

        }

    }

}