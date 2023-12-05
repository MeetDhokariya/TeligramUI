package com.example.teligramui

import android.os.Bundle
import android.view.Gravity
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.teligramui.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imgMenu = findViewById<ImageView>(R.id.imgMenu)
        var drawerlayout = findViewById<DrawerLayout>(R.id.drawerlayout)
        var navigationDrawer = findViewById<NavigationView>(R.id.navigationDrawer)
        imgMenu.setOnClickListener{

            drawerlayout.openDrawer(Gravity.START)
        }
        navigationDrawer.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.mHome ->{
                    drawerlayout.closeDrawer(Gravity.START)
                    true
                }
                R.id.mSettings ->{
                    Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.mCall ->{
                    Toast.makeText(this,"Call",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.mGroup ->{
                    Toast.makeText(this,"Group",Toast.LENGTH_SHORT).show()
                    true
                }


                else -> {
                    false
                }
            }
        }


    }


}