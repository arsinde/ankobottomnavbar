package com.arsinde.ankobottomnavbar

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    private val host by lazy { NavHostFragment.create(R.navigation.navigation_graph) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, host)
            .setPrimaryNavigationFragment(host)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        val navController = host.findNavController()

        findViewById<BottomNavigationView>(R.id.bottom_nav_view)?.setupWithNavController(navController)

        navController.addOnDestinationChangedListener{_, destination, _ ->
            val dest: String = try {
                resources.getResourceName(destination.id)
            } catch (e: Resources.NotFoundException) {
                Integer.toString(destination.id)
            }
            Log.d("NavigationActivity", "Navigated to $dest")
        }
    }
}
