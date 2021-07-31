package dio.digbank

class Cliente(
    override val nome:String,
    override val cpf:String,
    val tipo: clienteTipo
):Pessoa(nome, cpf){
    override fun toString(): String {
        return super.toString()+"\nCliente tipo: ${tipo.descricao}"
    }
}