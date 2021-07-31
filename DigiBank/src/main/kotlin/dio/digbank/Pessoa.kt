package dio.digbank

class Pessoa {
    var nome:String = "jessica"

    var cpf:String = "111.111.111.22"
    private set

    override fun toString(): String {
        return "Nome: $nome\nCPF: $cpf"
    }
}

