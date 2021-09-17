package br.com.jbtz.testevmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txtRecebido : EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button

    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        logar(valor = "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initContador()
        initClick()

        validaContador()
    }

    override fun onStart() {
        logar(valor = "onStart")
        super.onStart()
    }

    override fun onResume() {
        logar(valor = "onResume")
        super.onResume()
    }

    override fun onPause() {
        logar(valor = "onPause")
        super.onPause()
    }

    override fun onStop() {
        logar(valor = "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        logar(valor = "onDestroy")
        super.onDestroy()
    }

    private fun logar(tag: String = "Ciclo de Vida", valor: String){
        Log.d(tag, valor)
    }

    private fun validaContador() {
        if (contador > 5)
            contador = 0
    }

    private fun initClick() {
        btnDados.setOnClickListener {
            contador++
            validaContador()
            initContador()
        }
        btnMostrar.setOnClickListener {
            Toast.makeText(this, "Contador valor: $contador", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initContador() {
        txtRecebido.setText(contador.toString())
    }

    private fun initDados() {
        txtRecebido = findViewById(R.id.txtRecebido)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)
    }
}