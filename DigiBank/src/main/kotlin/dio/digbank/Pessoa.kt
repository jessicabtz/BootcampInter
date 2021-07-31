package dio.digbank

open class Pessoa (open val nome:String, open val cpf:String) {

    override fun toString(): String {
        return "Nome: $nome\nCPF: $cpf"
    }
}

