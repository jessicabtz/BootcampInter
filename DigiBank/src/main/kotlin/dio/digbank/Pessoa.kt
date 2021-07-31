package dio.digbank

abstract class Pessoa (val nome:String, val cpf:String) {

    override fun toString(): String {
        return "Nome: $nome\nCPF: $cpf"
    }
}

