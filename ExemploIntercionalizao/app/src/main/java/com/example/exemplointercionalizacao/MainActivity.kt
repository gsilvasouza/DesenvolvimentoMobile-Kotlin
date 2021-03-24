package com.example.exemplointercionalizacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMensagem.setOnClickListener{
            val message = "${getString(R.string.ola_mensagem)}, ${txtNome.text}"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}