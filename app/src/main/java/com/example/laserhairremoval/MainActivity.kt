package com.example.laserhairremoval

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.laserhairremoval.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // fragmentのnavGraph(画面遷移の管理)
        val navController = findNavController(R.id.nav_host_fragment_activity)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_game,
                R.id.navigation_game_clear,
                R.id.navigation_game_over,
                R.id.navigation_title
            ),
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}