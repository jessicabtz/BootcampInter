package dio.digbank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha:String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculaAuxilio(): Double {
        return salario * 0.4
    }

    override fun confirmaLogin(): Boolean = "senhasenha" == senha
}