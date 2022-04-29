fun main() {
    var conta1 = ContaCorrente()
    conta1.cadastrarContaCorrente()
    conta1.exibirInformacoesContaCorrente()

    var conta2 = ContaSalario()
    conta2.cadastrarContaSalario()
    conta2.exibirInformacoesContaSalario()

    var conta3 = ContaPoupanca()
    conta3.cadastrarContaPoupanca()
    conta3.exibirInformacoesContaPoupanca()
}