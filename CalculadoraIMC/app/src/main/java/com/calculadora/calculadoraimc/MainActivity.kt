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
        var resultado = resultado

        calcular.setOnClickListener {
            val peso = peso.text.toString()
            val altura = altura.text.toString()
            var str: String = ""

            val imc:Double = peso.toDouble()/ pow((altura.toDouble()*0.01),2.0)
            str = "Seu IMC e: ${String.format("%.2f",imc)}!"
            when{
               imc <= 18.5 -> str += "\nIMC abaixo de 18.5 representa Abaixo do Peso"
               imc < 25.0  -> str += "\nIMC maior que 18.5 e menor que 25 representa Peso Normal"
               imc < 30    -> str += "\nIMC maior ou igual a 25 e menor que 30 representa Sobrepeso"
               imc < 35    -> str += "\nIMC maior ou igual a 30 e menor que 35 representa Obesidade grau 1"
               imc < 40    -> str += "\nIMC maior ou igual a 35 e menor que 40 representa Obesidade grau 2"
               else        -> str += "\nIMC maior ou igual a 40 representa Obesidade Grau 3 ou Morbida"
           }
           resultado.setText("$str")
        }
    }

}
fun main() {
    println("$")
}