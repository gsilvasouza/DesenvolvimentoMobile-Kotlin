package com.example.checkpoint1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_calculadora.setOnClickListener{
            val intentCalculadora = Intent(this, Calculadora::class.java)
            startActivity(intentCalculadora)
        }
        btn_contaTelefonica.setOnClickListener {
            val intentContaTelefonica = Intent(this, ContaTelefonica::class.java)
            startActivity(intentContaTelefonica)
        }
        btn_integrantes.setOnClickListener {
            mensagemIntegrantes()
        }
    }

    fun mensagemIntegrantes(){
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Integrantes")
        builder.setMessage("GABRIEL SILVA DE SOUZA")
        builder.setNegativeButton("OK", null)
        builder.create().show()
    }

}