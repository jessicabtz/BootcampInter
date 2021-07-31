package dio.digbank

import java.math.BigDecimal

class Conta(val agencia:String, val numero:String, var saldo:BigDecimal) {

    fun deposito(valor:BigDecimal){
        saldo += valor
    }
    fun saque(valor:BigDecimal){
        saldo -= valor
    }

}