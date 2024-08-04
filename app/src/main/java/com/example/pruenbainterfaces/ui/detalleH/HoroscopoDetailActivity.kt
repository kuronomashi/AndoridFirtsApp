package com.example.pruenbainterfaces.ui.detalleH

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.navArgs
import com.example.pruenbainterfaces.R
import com.example.pruenbainterfaces.databinding.ActivityHoroscopoDetailBinding
import com.example.pruenbainterfaces.databinding.ActivityMainBinding
import com.example.pruenbainterfaces.ui.Primerapagina.HoroscopeFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HoroscopoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopoDetailBinding
    private val HoroscopeDetailViewModel:HoroscopeDetailViewModel by viewModels()

    private val args:HoroscopoDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        args.inf

        }
    }
