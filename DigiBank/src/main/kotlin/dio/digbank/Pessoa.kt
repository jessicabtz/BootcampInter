package dio.digbank

class Pessoa {
    var nome:String = "jessica"
    var cpf:String = "111.111.111.22"

    inner class Endereco{
        var rua:String = "Rua dos Bobos"
        var numero:Int = 0
    }

    override fun toString(): String {
        return "Nome: $nome\nCPF: $cpf\nEndereco: ${Endereco().rua}, n°${Endereco().numero}"
    }
}

