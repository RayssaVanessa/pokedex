package com.example.curso_android_marvel.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.curso_android_marvel.R
import com.example.curso_android_marvel.databinding.PokerActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokerActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val biding = PokerActivityBinding.inflate(layoutInflater)
        setContentView(R.layout.poker_activity)

        //recuperando meu navHost(fragmento que vai receber outro dentro pra conseguir fazer a navegação)
        //dentro dele que vai ter meus destinos

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_container) as NavHostFragment
        navController = navHostFragment.navController

        //vai controlr a navegacao
        biding.bottomNavMain.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(
        setOf()
        )

    }
}
