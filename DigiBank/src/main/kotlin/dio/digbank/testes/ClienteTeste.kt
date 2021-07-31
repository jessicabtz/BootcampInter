package dio.digbank.testes

import dio.digbank.Cliente
import dio.digbank.clienteTipo

fun main(){
    val c = Cliente("Jessica", "111.111.111.22", clienteTipo.PF)
    println(c)
}