package com.example.curso_android_marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import com.example.curso_android_marvel.databinding.PokerActivityBinding

class PokerActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var biding: PokerActivityBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        biding = PokerActivityBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.poker_activity)

        //recuperando meu navHost(fragmento que vai receber outro dentro pra conseguir fazer a navegação)
        //dentro dele que vai ter meus destinos
        val navHostFragment = supportFragmentManager
            .findFragmentById(androidx.navigation.fragment.R.id.nav_host_fragment_container) as NavHostFragment

        navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(
        setOf()
        )

    }
}