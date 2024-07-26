package com.example.pruenbainterfaces.ui.Primerapagina.adaptater

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation
import com.example.pruenbainterfaces.databinding.ItemOroscopeBinding

class orcopusViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private  val bindingg = ItemOroscopeBinding.bind(view)

    fun render(oroscopuesinformation: oroscopuesinformation){
        val context = bindingg.ivTexto.context
        bindingg.ivOrsocopo.setImageResource(oroscopuesinformation.Imagen)
        bindingg.ivTexto.text = context.getString(oroscopuesinformation.name)
    }
}