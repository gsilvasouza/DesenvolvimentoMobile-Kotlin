package com.example.listatarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tarefas = ArrayList<String>()
    var adapter : ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tarefas)
        lstTarefas.adapter = adapter

        fab.setOnClickListener {
            adicionarTarefa()
        }

        lstTarefas.setOnItemClickListener{ parent, view, position, id ->
            val tarefa = parent.adapter.getItem(position).toString()
            atualizarTarefa(tarefa, position)
        }
    }

    fun adicionarTarefa(){
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Nova Tarefa")
        val entrada = EditText(this)
        builder.setView(entrada)
        builder.setPositiveButton("Ok"){ dialog, which ->
            //Add na lista
            tarefas.add(entrada.text.toString())
            //Renderizar novamente a tela
            adapter?.notifyDataSetChanged()
        }
        builder.setNegativeButton("Cancel", null)
        builder.create().show()
    }

    fun atualizarTarefa(tarefa:String, posicao:Int){
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Atualizar Tarefa")
        val entrada = EditText(this)
        entrada.setText(tarefa, TextView.BufferType.EDITABLE)
        builder.setView(entrada)
        //Tratamento do botão OK
        builder.setPositiveButton("OK"){dialog, which ->
            tarefas[posicao] = entrada.text.toString()
            adapter?.notifyDataSetChanged()
        }
        builder.setNegativeButton("Cancel", null)
        //Trataento do botão excluir
        builder.setNeutralButton("Excluir"){ dialog, which ->
            tarefas.removeAt(posicao)
            adapter?.notifyDataSetChanged()
        }
        builder.create().show()
    }
}