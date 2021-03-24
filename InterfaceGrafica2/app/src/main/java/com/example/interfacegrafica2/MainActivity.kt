package com.example.interfacegrafica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Combo box
        val itensSpinner = arrayOf<String>("Selecione", "Residencial", "Comercial", "Celular", "Outro")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itensSpinner)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTipoTelefone.adapter = adapter

        btn.setOnClickListener{
            if(camposValidos()){
                var msg = """ Nome: ${txtNome.text}
                    |Telefone: ${txtTelefone.text}
                    |Tipo Telefone: ${spinnerTipoTelefone.selectedItem}
                    |Email: ${txtEmail.text}
                    |Preferencias de contato:
                    """.trimMargin("|")
                if(cbTelefone.isChecked){
                    msg += "\n - Telefone"
                }
                if(cbEmail.isChecked){
                    msg += "\n - Email"
                }
                alert("Boas Vindas", msg)
            }
        }
    }

    fun camposValidos() : Boolean{
        if(txtNome.text.trim().isEmpty() || txtTelefone.text.trim().isEmpty()
            || spinnerTipoTelefone.selectedItemPosition == 0
            || txtEmail.text.trim().isEmpty()){
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }

    fun alert(titulo: String, mensagem: String){
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("OK", null)
        builder.create().show()
    }
}