import kotlin.math.pow

const val SOMA      = 1
const val SUB       = 2
const val MULTI     = 3
const val DIV       = 4
const val POTEN     = 5
const val PORCENTO  = 6

fun main() {
    println("------ Calculadora ------")
    println("1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n5 - Potenciacao\n6 - Porcentagem")
    println("Insira o valor da opercao desejada")
    val cod = readLine()!!.toInt()
    println("Insira dois numeros Ex: 7.1 8.2 1")
    val (x,y) = readLine()!!.split(' ').map(String::toFloat)

    when(cod){
        SOMA     -> println("O resultado de $x + $y = ${x+y}")
        SUB      -> println("O resultado de $x - $y = ${x-y}")
        MULTI    -> println("O resultado de $x * $y = ${x*y}")
        DIV      -> println("O resultado de $x / $y = ${x/y}")
        POTEN    -> println("O resultado de $x ^ $y = ${x.pow(y)}")
        PORCENTO -> println("O resultado de $x % $y = ${y*0.01*x}")
        else     -> println("Opcao invalida")
    }
}
