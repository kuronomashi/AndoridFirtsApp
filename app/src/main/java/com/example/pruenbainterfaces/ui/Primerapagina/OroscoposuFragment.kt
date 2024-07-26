package com.example.pruenbainterfaces.ui.Primerapagina

import android.os.Bundle
import android.telephony.ims.RcsUceAdapter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pruenbainterfaces.databinding.FragmentOroscoposuBinding
import com.example.pruenbainterfaces.ui.Primerapagina.adaptater.orcopusadaptater
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class OroscoposuFragment : Fragment() {

    private val oroscopusViewmodel by viewModels<OroscopusViewModel>();
    private lateinit var HoroscopoAdpater: orcopusadaptater
    private var _binding: FragmentOroscoposuBinding? = null
    private val bindig get() = _binding!! //El barrbaaj se usa como sintaxis con el objetivo de genera variabels a las que no se deberia acceder, como es el caso de _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    fun initUI(){
        initlist()
        initUiState()
    }

    private fun initlist(){
        HoroscopoAdpater = orcopusadaptater()

        bindig.rvOroscopus.apply {
            layoutManager = GridLayoutManager(context,3)
            adapter = HoroscopoAdpater
        }
    }

    fun initUiState(){
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                oroscopusViewmodel.horoscope.collect{
                    HoroscopoAdpater.ActualizarInformacion(it);
                    Log.i("Chupapitos3000",it.toString())
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentOroscoposuBinding.inflate(layoutInflater,container,false) // Inicializamos
        return bindig.root // Inicialzamo
    }


}