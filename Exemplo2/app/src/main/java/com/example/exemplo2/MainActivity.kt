package com.example.exemplo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View){
        //val -> constante
        val msg = "Hello World"
        //Toast mensagem que aparace no final da tela, colocamos o this que seria o toast, a mensagem e o tempo dela, e o show para mostrar
        Toast.makeText(this, R.string.btn_msg, Toast.LENGTH_LONG).show()
    }
}