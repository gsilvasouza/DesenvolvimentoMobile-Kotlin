package com.example.checkpoint1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_conta_telefonica.*

class ContaTelefonica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conta_telefonica)
        btn_calcular.setOnClickListener {
            val minutosCelular = txt_minutosChamadaCelular.text.toString().toInt()
            val minutosLocal = txt_minutosChamadaLocal.text.toString().toInt()
            val asssinatura = txt_assinatura.text.toString().toDouble()
            val intent = Intent(this,ResultadoContaTelefonica::class.java)
            intent.putExtra("assinatura", asssinatura)
            intent.putExtra("minutosLocal", calculaChamadaLocal(minutosLocal))
            intent.putExtra("minutosCelular", calculaChamadaCelular(minutosCelular))
            startActivity(intent)
        }
    }

    fun calculaChamadaLocal(minutos: Int) : Double{
        return minutos * 0.04
    }

    fun calculaChamadaCelular(minutos: Int) : Double{
        return minutos * 0.20
    }
}