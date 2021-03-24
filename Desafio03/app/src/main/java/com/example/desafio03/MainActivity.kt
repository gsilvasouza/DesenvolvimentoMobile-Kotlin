package com.example.desafio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPesoIdeal.setOnClickListener{
            val altura = txtAltura.text.toString().toDouble()
            var pesoIdeal : Double
            if(rdMasculino.isChecked){
                pesoIdeal = (72.7 * altura) - 58
            }
            else{
                pesoIdeal = (62.1 * altura) - 44.7
            }
            val dec = DecimalFormat("#.00")
            val mensagem = "Peso Ideal: ${dec.format(pesoIdeal)} kg"
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }

}