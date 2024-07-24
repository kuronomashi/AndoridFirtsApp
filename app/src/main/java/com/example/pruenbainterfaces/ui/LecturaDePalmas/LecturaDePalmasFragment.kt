package com.example.pruenbainterfaces.ui.LecturaDePalmas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pruenbainterfaces.R
import com.example.pruenbainterfaces.databinding.FragmentLecturaDePalmasBinding
import com.example.pruenbainterfaces.databinding.FragmentSuerteBinding

class LecturaDePalmasFragment : Fragment() {

    private var _binding: FragmentLecturaDePalmasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLecturaDePalmasBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}