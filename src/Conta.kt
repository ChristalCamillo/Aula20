//Crie um sistema bancário de criação de contas,
// onde a pessoa possa criar uma conta salário ou uma conta poupança ou conta corrente.
// Crie alguns objetos exemplo e mostre na tela o tipo da conta, o saldo e o nome da pessoa.

open class Conta(
    private var tipoDaconta: String = "",
    private  var saldo: Int = 0,
    private var nomeProprietario: String = ""
) {
    fun cadastrarConta(){
        println("Informe o tipo da conta: Salário, Corrente ou Poupança: ")
        this.tipoDaconta = readLine().toString()
        println("Informe o seu saldo: ")
        this.saldo = readLine()!!.toInt()
        println("Qual o nome do proprietário da conta?")
        this.nomeProprietario = readLine().toString()
    }

    fun exibirInformacoesConta() {
        println(" Sua conta é do tipo $tipoDaconta, seu saldo é de R$$saldo e é propriedade de $nomeProprietario")
    }
}