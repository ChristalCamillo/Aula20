class ContaPoupanca(tipoDaconta: String = "", saldo: Int = 0, nomeProprietario: String = "") :
    Conta(tipoDaconta, saldo, nomeProprietario){

        fun cadastrarContaPoupanca(){
            cadastrarConta()
        }

        fun exibirInformacoesContaPoupanca(){
        exibirInformacoesConta()
        }
    }