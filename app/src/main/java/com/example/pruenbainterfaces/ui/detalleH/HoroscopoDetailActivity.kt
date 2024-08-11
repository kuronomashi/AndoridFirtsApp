package com.example.pruenbainterfaces.ui.detalleH

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.example.pruenbainterfaces.Dominio.model.HoroscopoModelo
import com.example.pruenbainterfaces.Dominio.model.HoroscopoModelo.*
import com.example.pruenbainterfaces.R
import com.example.pruenbainterfaces.databinding.ActivityHoroscopoDetailBinding
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
        HoroscopeDetailViewModel.getHoroscope(args.inf)
        }

    private fun initUI() {
        initInicializte()
        initUIState()
    }

    private fun initInicializte(){
        binding.backflechita.setOnClickListener{onBackPressed()}
    }

    private  fun initUIState(){
        lifecycleScope.launch {
           repeatOnLifecycle(Lifecycle.State.STARTED){
               HoroscopeDetailViewModel.State.collect{
                   when(it){
                       HoroscopeDetailStatus.Cargando -> LoadingState()
                       is HoroscopeDetailStatus.Error -> errorState()
                       is HoroscopeDetailStatus.Success -> SuccessState(it)
                   }
               }
        }
    }
    }

    private fun LoadingState(){
        binding.progressbar.isVisible = true
        binding.tvTitle.isVisible = false
        binding.imageViewDetail.isVisible = false
        binding.tvDescription.isVisible = false
    }
    private  fun errorState(){
        binding.progressbar.isVisible = false
    }
    private fun SuccessState(State: HoroscopeDetailStatus.Success) {
        binding.progressbar.isVisible = false
        binding.tvTitle.isVisible = true
        binding.imageViewDetail.isVisible = true
        binding.tvDescription.isVisible = true
        binding.tvTitle.text = State.sign
        binding.tvDescription.text = State.Prediccion

        val image = when(State.horoscopemodel){
            Aries -> R.drawable.detail_aries
            Taurus -> R.drawable.detail_taurus
            Geminis -> R.drawable.detail_gemini
            Cancer -> R.drawable.detail_cancer
            Leo -> R.drawable.detail_leo
            Virgo -> R.drawable.detail_virgo
            Libra -> R.drawable.detail_libra
            Escorpio -> R.drawable.detail_scorpio
            Sagitario -> R.drawable.detail_sagittarius
            Capricornio -> R.drawable.detail_capricorn
            Acuario -> R.drawable.detail_aquarius
            Piscis -> R.drawable.detail_pisces
        }
        binding.imageViewDetail.setImageResource(image)
    }


    }
