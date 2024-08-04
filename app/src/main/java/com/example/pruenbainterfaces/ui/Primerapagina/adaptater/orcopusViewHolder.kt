package com.example.pruenbainterfaces.ui.Primerapagina.adaptater

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.compose.animation.core.LinearEasing
import androidx.recyclerview.widget.RecyclerView
import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation
import com.example.pruenbainterfaces.databinding.ItemOroscopeBinding

class orcopusViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private  val bindingg = ItemOroscopeBinding.bind(view)

    fun render(
        oroscopuesinformation: oroscopuesinformation,
        onItemSelected: (oroscopuesinformation) -> Unit
    ){
        val context = bindingg.ivTexto.context
        bindingg.ivOrsocopo.setImageResource(oroscopuesinformation.Imagen)
        bindingg.ivTexto.text = context.getString(oroscopuesinformation.name)
        bindingg.parent.setOnClickListener {
            AnimacionAgrandar(bindingg.ivTexto)
            AnimacionRotar(bindingg.ivOrsocopo,{onItemSelected(oroscopuesinformation)})
        }
    }

    private  fun AnimacionRotar(view: View,newlamda:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newlamda() }
            start()
        }
    }

    private fun AnimacionAgrandar(view: View){
        view.animate().apply {
            duration = 250
            interpolator = LinearInterpolator()
            scaleXBy(0.2f) // Aumenta la escala en un 50%
            scaleYBy(0.2f)
            withEndAction { // Define una acción para cuando termine la primera animación
                view.animate().apply {
                    duration = 250
                    interpolator = LinearInterpolator()
                    scaleXBy(-0.2f) // Reduce la escala en un 50% (vuelve al tamaño original)
                    scaleYBy(-0.2f)
                    start()
                }
            }
            start()
        }
    }
}