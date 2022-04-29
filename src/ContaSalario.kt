class ContaSalario(tipoDaconta: String = "", saldo: Int = 0, nomeProprietario: String = "") :
    Conta(tipoDaconta, saldo, nomeProprietario) {
    fun cadastrarContaSalario(){
        cadastrarConta()
    }

     fun exibirInformacoesContaSalario(){
        exibirInformacoesConta()
     }

}