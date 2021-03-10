package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether1"
    var cpf: String = "123.123.123-11"
        private set

    constructor()

    fun pessoaInfo() =  "$nome e $cpf"

    //inner class Endereco{
    //    var rua: String = "Rua Teste"
    //}

}

fun main(){
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)

    //println(jether.Endereco().rua)
    println(jether.pessoaInfo())
}