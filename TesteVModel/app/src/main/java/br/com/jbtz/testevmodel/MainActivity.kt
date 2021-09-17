package br.com.jbtz.testevmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var txtRecebido : EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button

    lateinit var mViewModel:MainViewModel
    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initClick()
    }

    private fun initDados() {
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        txtRecebido = findViewById(R.id.txtRecebido)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)

        mViewModel.mContador.observe(this, Observer{ valor->
            txtRecebido.setText(valor)
        })
    }


    private fun initClick() {
        btnDados.setOnClickListener {
            mViewModel.Contador()
        }
        btnMostrar.setOnClickListener {
            Toast.makeText(applicationContext, "Contador valor: ${mViewModel.mContador.value}", Toast.LENGTH_SHORT).show()
        }
    }

}