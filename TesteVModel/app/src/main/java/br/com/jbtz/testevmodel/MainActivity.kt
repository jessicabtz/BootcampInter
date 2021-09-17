package br.com.jbtz.testevmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txtRecebido : EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button

    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initContador()
        initClick()

        validaContador()
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