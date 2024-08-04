package com.example.pruenbainterfaces.ui.detalleH

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.example.pruenbainterfaces.R
import com.example.pruenbainterfaces.databinding.ActivityHoroscopoDetailBinding
import com.example.pruenbainterfaces.databinding.ActivityMainBinding
import com.example.pruenbainterfaces.ui.Primerapagina.HoroscopeFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopoDetailBinding
    private val HoroscopeDetailViewModel:HoroscopeDetailViewModel by viewModels()

    private val args:HoroscopoDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        }

    private fun initUI() {
        initUIState()
    }

    private  fun initUIState(){
        lifecycleScope.launch {
           repeatOnLifecycle(Lifecycle.State.STARTED){
               HoroscopeDetailViewModel.State.collect{
                   when(it){
                       HoroscopeDetailStatus.Cargando -> LoadingState()
                       is HoroscopeDetailStatus.Error -> errorState()
                       is HoroscopeDetailStatus.Success -> SuccessState()
                   }
               }
        }
    }
    }

    private fun LoadingState(){
        binding.progressbar.isActivated = true
    }
    private  fun errorState(){
        binding.progressbar.isActivated = false
    }
    private fun SuccessState(){
        binding.progressbar.isActivated = false
    }


    }
