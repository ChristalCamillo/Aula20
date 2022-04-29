class ContaCorrente(tipoDaconta: String = "", saldo: Int = 0, nomeProprietario: String = "") :
    Conta(tipoDaconta, saldo, nomeProprietario) {
    fun cadastrarContaCorrente(){
        cadastrarConta()
    }

    fun exibirInformacoesContaCorrente(){
        exibirInformacoesConta()
    }
}
