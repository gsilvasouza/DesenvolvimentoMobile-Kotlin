package com.example.checkpoint1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_conta_telefonica.*
import java.text.DecimalFormat

class ResultadoContaTelefonica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_conta_telefonica)
        val chamadaLocal = intent.getDoubleExtra("minutosLocal", 0.00)
        val chamadaCelular = intent.getDoubleExtra("minutosCelular", 0.00)
        val assinatura = intent.getDoubleExtra("assinatura", 0.00)
        val decimalFormat = DecimalFormat("#0.00")
        lb_valorAssinatura.text =":R$${decimalFormat.format(assinatura)}"
        lb_resultadoChamadaCelular.text =":R$ ${decimalFormat.format(chamadaCelular)}"
        lb_resultadoChamadaLocal.text =":R$ ${decimalFormat.format(chamadaLocal)}"
        lb_resultadoValorTotal.text =":R$ ${decimalFormat.format(calcularTotalContaTelefonica(
                    assinatura, chamadaCelular, chamadaLocal))}"
    }

    fun calcularTotalContaTelefonica (valor1 : Double, valor2 : Double, valor3 : Double) : Double{
        return valor1 + valor2 + valor3
    }
}