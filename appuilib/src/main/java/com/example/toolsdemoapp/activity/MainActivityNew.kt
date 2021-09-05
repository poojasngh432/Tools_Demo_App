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
     * 8. Navigation Drawer  9. Bottom Nav  10. Draggable Items  11. Images  12. Video  13. Music
     * 14. Select File from device  15. Menu  16. Error Messages  17. Touch events  18. Appbar Coordinator Layout  19. Freeze on Top
     * 20. scrolling  21. Permissions  22. Animations
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
        binding.viewsBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, ViewsActivity::class.java)
            startActivity(intent)
        }
        binding.gridsBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, GridActivity::class.java)
            startActivity(intent)
        }
        binding.recyclerViewBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, RecyclerViewActivity::class.java)
            startActivity(intent)
        }
        binding.bottomsheetBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, BottomsheetActivity::class.java)
            startActivity(intent)
        }
        binding.loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.navigationDrawerBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, NavigationDrawerActivity::class.java)
            startActivity(intent)
        }
        binding.bottomNavBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, BottomNavActivity::class.java)
            startActivity(intent)
        }
        binding.bottomNavBtn2.setOnClickListener {
            val intent = Intent(this@MainActivityNew, BottomNavActivity2::class.java)
            startActivity(intent)
        }
        binding.draggableItemsBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, DraggableItemsActivity::class.java)
            startActivity(intent)
        }
        binding.imagesBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, ImagesActivity::class.java)
            startActivity(intent)
        }
        binding.videosBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, VideosActivity::class.java)
            startActivity(intent)
        }
        binding.selectFileBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, SelectFileActivity::class.java)
            startActivity(intent)
        }
        binding.menuBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, MenuActivity::class.java)
            startActivity(intent)
        }
        binding.errorMessagesBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, ErrorMessagesActivity::class.java)
            startActivity(intent)
        }
        binding.touchEventsBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, TouchEventsActivity::class.java)
            startActivity(intent)
        }
        binding.appbarCoordinatorBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, AppbarCoordinatorActivity::class.java)
            startActivity(intent)
        }
        binding.freezeLayoutOnTopBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, FreezeLayoutOnTopActivity::class.java)
            startActivity(intent)
        }
        binding.scrollingBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, ScrollingActivity::class.java)
            startActivity(intent)
        }
        binding.permissionsBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, PermissionsActivity::class.java)
            startActivity(intent)
        }
        binding.playingWithIntentBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, PlayingWithIntentActivity::class.java)
            startActivity(intent)
        }
        binding.animationsBtn.setOnClickListener {
            val intent = Intent(this@MainActivityNew, AnimationsActivity::class.java)
            startActivity(intent)
        }

    }

}