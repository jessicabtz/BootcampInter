package com.calculadora.calculadoraimc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = calcular
        val altura = altura.text.toString()
        val peso = peso.text.toString()
        var resultado = resultado
        var str:String = ""

        calcular.setOnClickListener {
            val imc = peso.toDouble()/pow((altura.toDouble()*0.01),2.0)
            resultado.setText("Seu IMC eh: $imc!")
            when{
                imc <= 18.5 -> str = "IMC abaixo de 18.5 representa Abaixo do Peso"
                imc < 25.0  -> str = "IMC abaixo de 18.5 representa Abaixo do Peso"
                imc < 30    -> str = "IMC abaixo de 18.5 representa Abaixo do Peso"
                imc < 35    -> str = "IMC abaixo de 18.5 representa Abaixo do Peso"
                imc < 40    -> str = "IMC abaixo de 18.5 representa Abaixo do Peso"
                else -> str = "IMC abaixo de 18.5 representa Abaixo do Peso"
            }
          resultado.setText("$resultado\n$str")
        }
    }
}