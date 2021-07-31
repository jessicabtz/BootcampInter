package dio.digbank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculaAuxilio(): Double {
        return salario * 0.4
    }
}