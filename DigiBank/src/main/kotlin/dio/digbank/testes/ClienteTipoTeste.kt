package dio.digbank.testes

import dio.digbank.clienteTipo

fun main(){
    clienteTipo.values().forEach {
        println("${it.name}: ${it.descricao}")
    }

    val cliente = clienteTipo.PJ
    println(cliente.name)
}