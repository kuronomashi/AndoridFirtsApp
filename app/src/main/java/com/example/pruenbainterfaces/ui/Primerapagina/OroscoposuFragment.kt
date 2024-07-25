package com.example.pruenbainterfaces.ui.Primerapagina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pruenbainterfaces.databinding.FragmentOroscoposuBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OroscoposuFragment : Fragment() {

    private var _binding: FragmentOroscoposuBinding? = null
    private val bindig get() = _binding!! //El barrbaaj se usa como sintaxis con el objetivo de genera variabels a las que no se deberia acceder, como es el caso de _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentOroscoposuBinding.inflate(layoutInflater,container,false) // Inicializamos
        return bindig.root // Inicialzamo
    }


}