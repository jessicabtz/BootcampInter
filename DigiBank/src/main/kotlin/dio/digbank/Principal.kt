package dio.digbank

class Principal {
}

fun main(){
    val p = Pessoa()
    println(p.toString())
    p.nome = "Joana"
    println(p.toString())
}