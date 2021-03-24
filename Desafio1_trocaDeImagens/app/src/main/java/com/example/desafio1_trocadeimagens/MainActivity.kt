package com.example.desafio1_trocadeimagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View){
        when(view.id){
            R.id.botao1 -> imagem.setImageResource(R.drawable.joao_frango);
            R.id.botao2 -> imagem.setImageResource(R.drawable.astro1);
            R.id.botao3 -> imagem.setImageResource(R.drawable.astro2);
        }
    }

}