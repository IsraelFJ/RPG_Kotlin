class Loja {
    fun vender(champ: Champ): Boolean {








        println("Bem vindo à loja!")
        println("O que você precisa?")
        println("1- PORÇÃO - custo[50][cura 50] e [restaura 5 de Mana] \n2- Sair da Loja")
        val escolha = readln().toInt()








        when (escolha) {
            1 -> {
                if (champ.dinheiro >= 50) {
                    champ.dinheiro -= 50
                    champ.pocao++
                    println("Você comprou uma poção !")
                } else {
                    println("Você não tem dinheiro suficiente!")
                }
            }








            2 -> {
                println("Volte sempre!")
                return true
            }








            else -> println("Escolha inválida!")








        }
        return false
    }








}
