package com.example.alcoolgasolina
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener {view: View? ->
            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            var precoAlcool = txtAlcool.text.toString().toDouble()
            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGasolina = txtGasolina.text.toString().toDouble()
            var resultado : Double = precoAlcool / precoGasolina
            var mensagem = ""
            if(resultado > 0.7) {
                mensagem = "Gasolina"
            } else if(resultado < 0.7) {
                mensagem = "Álcool"
            } else {
                mensagem = "Tanto faz"
            }
            var intentResultado = Intent(this, ResultadoActivity::class.java)
            intentResultado.putExtra("msg", mensagem)
            startActivity(intentResultado)
        }
    }
}