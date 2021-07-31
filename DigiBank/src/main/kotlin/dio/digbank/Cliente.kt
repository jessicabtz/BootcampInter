package dio.digbank

class Cliente(
    nome:String,
    cpf:String,
    val tipo: clienteTipo
):Pessoa(nome, cpf){
    override fun toString(): String {
        return super.toString()+"\nCliente tipo: ${tipo.descricao}"
    }
}