package com.example.pruenbainterfaces.ui.Primerapagina.adaptater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation
import com.example.pruenbainterfaces.R

class orcopusadaptater(private var ListaHoroscopo:List<oroscopuesinformation> = emptyList(), private val onItemSelected:(oroscopuesinformation) -> Unit):
    RecyclerView.Adapter<orcopusViewHolder>() {

    fun ActualizarInformacion(list: List<oroscopuesinformation>){
        ListaHoroscopo = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): orcopusViewHolder {
        return orcopusViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_oroscope,parent,false)
        )
    }

    override fun getItemCount() = ListaHoroscopo.size


    override fun onBindViewHolder(holder: orcopusViewHolder, position: Int) {
        holder.render(ListaHoroscopo[position],onItemSelected)
    }
}