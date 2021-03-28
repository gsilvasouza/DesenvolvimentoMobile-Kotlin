package com.example.checkpoint1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadora.*
import java.text.DecimalFormat

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        btn_botaoCalcular.setOnClickListener {
            val numero1 : Double= txt_numero1.text.toString().toDouble()
            val numero2 : Double = txt_numero2.text.toString().toDouble()
            val resultado : Double = operacao(numero1, numero2)
            val decFormat = DecimalFormat("#.00")
            Toast.makeText(this, "Resultado: ${decFormat.format(resultado)}", Toast.LENGTH_LONG).show()
        }
    }

    private fun operacao(numero1 : Double, numero2 : Double): Double{
        return when(rdOperacoes.checkedRadioButtonId){
            R.id.rb_soma -> numero1 + numero2
            R.id.rb_subtracao -> numero1 - numero2
            R.id.rb_divisao -> numero1 / numero2
            else -> numero1 * numero2
        }
    }
}