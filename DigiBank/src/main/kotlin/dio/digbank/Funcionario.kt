package dio.digbank

abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario:Double
): Pessoa(nome,cpf) {
    override fun toString(): String {
        return "${super.toString()}\nSalario: $salario\nAuxilio: ${calculaAuxilio()}"
    }

    abstract fun calculaAuxilio():Double
}