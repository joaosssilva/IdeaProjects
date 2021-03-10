package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("digeOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank(nome = "Banco 2")
}
