package com.example.pruenbainterfaces.ui.Home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.pruenbainterfaces.R
import com.example.pruenbainterfaces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        IniciarUI()
    }

    private fun IniciarUI(){
        IniciarNavegacion()
    }

    private fun IniciarNavegacion(){
        val navHost: NavHostFragment = supportFragmentManager.findFragmentById(R.id.ContenedorViewPrincipal) as NavHostFragment
        navController = navHost.navController

        binding.NavegacionInferiror.setupWithNavController(navController)
    }
}