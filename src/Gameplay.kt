open class Gameplay {


    private fun exibirStatus(jogador: Champ, inimigo: Enemy.Inimigo) {
        println("========================================")
        println("Status do Jogador:")
        println("Nome: ${jogador.nome}  \nVida: ${jogador.vida} | \nMana: ${jogador.mana}  | Dinheiro: ${jogador.dinheiro} | Poções: ${jogador.pocao}")
        println("========================================")
        println("Status do Inimigo: ${inimigo.nome}")
        println("Vida: ${inimigo.vida} |Ouro: ${inimigo.dinheiro}")
        println("========================================")
    }


    open fun gamestart(jogador: Champ, inimigo: Enemy.Inimigo) {
        var sairDoMenu = false
        while (!sairDoMenu) {
            println("========================================")
            println("Qual seu nome esfarrapado?")
            jogador.nome = readln()
            Thread.sleep(1000)
            println("========================================")
            println(
                "Então se chama [${jogador.nome}] mais não importa muito todos vocês morrem mesmo HAHAHAHAHAH!!!!!!! " +
                        "\nvai la esfarrapado, tenta derrotar a criatura que vive ai, dizem que ele foi o primeiro a se aventurar " +
                        "\nchegou tão longe que se tornou parte da maldição.  "
            )
            Thread.sleep(1000)
            println("========================================")
            println(
                "Que bom que vcs sempre vem!!!" +
                        "\nOs monstros se reproduzem e tentam sair e invadir o reino "
            )
            println("========================================")
            Thread.sleep(1000)
            println(
                "Então vai la, mata o maximo que puder antes de morrer HAHAHAHAHA!!!! " +
                        "\nlembra de voltar pra pegar uma poção pra eu fazer minha grana!"
            )
            println("========================================")
            Thread.sleep(1000)
            println("Eu fico aqui na entrada vendendo minhas poções mais não vendo fiado vcs nunca voltam pra pagar HAHAHAHA!!!!!")
            println("========================================")
            Thread.sleep(1000)
            println("O que vai fazer, ${jogador.nome}?")
            println("1 - Entrar no calabouço\n2 - Loja\n3 - Fugir como um covarde")
            println("[ESCOLHA]")
            when (readln().toInt()) {
                1 -> {
                    iniciarBatalha(jogador, inimigo)


                    sairDoMenu = true
                }


                2 -> {
                    var sairDaLoja = false
                    while (!sairDaLoja) {
                        sairDaLoja = Loja().vender(jogador)
                    }
                }


                3 -> {
                    println("Você fugiu! GAME OVER.")
                    sairDoMenu = true
                    break
                }


                else -> println("Escolha inválida!")
            }
            println("========================================")
            println(
                "você conseguiu derrotar uma orda de Slimes ate que vc é bom, mais foi por pouco hein HAHAHAHAHAH!!! " +
                        "\nSim [${jogador.nome}]!!!!!!" +
                        "\neu consigo falar com vc enquanto esta no calabouço HAHAHAHAH!!! então não chore!!!! eu posso te ouvir!!!!!! "
            )
            Thread.sleep(1000)
        }
    }
    open fun gamestart2(jogador: Champ, inimigo: Enemy.Inimigo) {
        var sairDoMenu = false
        println("========================================")
        println("O que vai fazer, ${jogador.nome}?")
        println("1 - Continuar explorando no calabouço\n2 - Loja\n3 - Fugir como um covarde")
        println("[ESCOLHA]")
        when (readln().toInt()) {
            1 -> {
                iniciarBatalha(jogador, inimigo)
                sairDoMenu = true
            }


            2 -> {
                var sairDaLoja = false
                while (!sairDaLoja) {
                    sairDaLoja = Loja().vender(jogador)
                }
            }


            3 -> {
                println("Você fugiu! GAME OVER.")
                sairDoMenu = true


            }


            else -> println("Escolha inválida!")
        }
    }
    open fun gamestart3(jogador: Champ, inimigo: Enemy.Inimigo) {
        var sairDoMenu = false
        println("========================================")
        println("você conseguiu!!!!! estou surpreso, a maioria morre chorando bem ai HAHAHAHAHAH!!! ")
        println("Continue explorando quem sabe vc consegue!")
        println("========================================")
        Thread.sleep(1000)
        println("O que vai fazer, ${jogador.nome}?")
        println("1 - Continuar explorando no calabouço\n2 - Loja\n3 - Fugir como um covarde")
        println("[ESCOLHA]")
        when (readln().toInt()) {
            1 -> {
                iniciarBatalha(jogador, inimigo)
                sairDoMenu = true
            }


            2 -> {
                var sairDaLoja = false
                while (!sairDaLoja) {
                    sairDaLoja = Loja().vender(jogador)
                }
            }


            3 -> {
                println("Você fugiu! GAME OVER.")
                sairDoMenu = true
            }


            else -> println("Escolha inválida!")
        }


    }




    open fun gamestart4(jogador: Champ, inimigo: Enemy.Inimigo) {
        var sairDoMenu = false
        println("========================================")
        println("Adeus [${jogador.nome}] minha magia só chega ate ai ")
        println("é sua ultima chance de comprar algo, não vou mais conseguir te ouvir tente não morrer nem se tornar parte da maldição ")
        println("Boa sorte ninguem nunca chegou tão longe!")
        println("========================================")
        Thread.sleep(1000)
        println("O que vai fazer, ${jogador.nome}?")
        println("1 - Etrar na ultima sala do caabouço\n2 - Loja\n3 - Fugir como um covarde")
        println("[ESCOLHA]")
        when (readln().toInt()) {
            1 -> {
                iniciarBatalha(jogador, inimigo)
                sairDoMenu = true
            }


            2 -> {
                var sairDaLoja = false
                while (!sairDaLoja) {
                    sairDaLoja = Loja().vender(jogador)
                }
            }


            3 -> {
                println("Você fugiu! GAME OVER.")
                sairDoMenu = true
            }


            else -> println("Escolha inválida!")
        }
        println(
            "Depois de muita luta, você finalmente conseguiu derrotar o Warlord. " +
                    "\nFoi uma batalha árdua e sofrida, mas você prevaleceu. " +
                    "\nParabéns, aventureiro! Diante de você está a Gema do Poder, " +
                    "\nsímbolo da sua vitória e bravura. Agora, com esse artefato em suas mãos, " +
                    "\nnovas aventuras e desafios aguardam sua coragem"
        )
        println("1- [pegar a Gema?] 2-[Deixar o calabouço?]")
        when (readln().toInt()) {
            1 -> {
                println(
                    "Você pegou a Gema imediatamente, mas algo sinistro aconteceu. \n" +
                            "Ela começou a consumir sua alma, e, antes que pudesse reagir, você foi marcado pela maldição. " +
                            "\nAgora, você é parte do calabouço, transformado no novo Warlord, encarregado de guardar o lugar. \n" +
                            "A história dos aventureiros que tentaram derrotá-lo se perde no tempo, pois ninguém jamais retorna. " +
                            "\nEnquanto isso, o misterioso vendedor permanece na entrada do calabouço, aguardando novos aventureiros, sem saber o destino que os espera..."
                )
            }




            2 -> {
                println(
                    "ocê sentiu uma energia maligna emanando da gema, e, após um momento de reflexão, decidiu não pegá-la. " +
                            "\nCom um arrepio na espinha, você deu as costas ao calabouço, agora vazio, e agradeceu ao vendedor misterioso por sua ajuda. " +
                            "\nSentindo um dever cumprido, seguiu em novas aventuras. Com o passar dos anos, o calabouço se transformou em ruínas, " +
                            "\nmas a gema amaldiçoada nunca foi destruída. Agora, você aguarda o momento certo, pronto para exterminar a próxima maldição que surgir..."
                )
            }
        }


    }




    private fun dice(): Int {




        return (1..20).random()
    }




    /*duas funções dividas uma para iniciar a batalha comas regras do jogo e outra para  entrar e sair da loja bem como chamar a função da luta */


    private fun iniciarBatalha(jogador: Champ, inimigo: Enemy.Inimigo) {
        val resultadoDado = dice()
        while (jogador.vida > 0 && inimigo.vida > 0) {
            exibirStatus(jogador, inimigo)
            println("Encontrou inimigo")
            println("\nO que você vai fazer?")
            println("1 - Atacar\n2 - Usar poção (cura 50 de vida) (restaura 5 de mana)\n3 - Usar ataque especial custo (1 de Mana)\n4 - Fugir")
            when (readln().toInt()) {
                1 -> {
                    println("Você tentou atacar!")
                    println("PRESS ENTER PRA ROLAL O DADO!")
                    readln()
                    Thread.sleep(1000)
                    println("========================================")
                    if (resultadoDado > 8) { // valor do dado defini a sorte ou dificuldade do joguinho
                        println("Resultado do dado $resultadoDado")
                        println("Conseguiu atacar!")
                        println("${jogador.vida}")
                        println("${jogador.nome} ataca o ${inimigo.nome}!")
                        println("========================================")
                        inimigo.vida -= jogador.dano
                        println("${inimigo.nome} recebeu ${jogador.dano} de dano! Vida restante: ${inimigo.vida}")
                        println("========================================")
                    } else {
                        println("Resultado do dado $resultadoDado}")
                        println("Errou o ataque ")
                    }
                }


                2 -> {
                    if (jogador.pocao < 0) {
                        println("${jogador.nome} usa uma poção!")
                        jogador.vida += 50
                        jogador.mana += 5
                        jogador.pocao--
                        println("Você recuperou 50 de vida! Sua vida atual: ${jogador.vida}")
                    } else {
                        println("Voce não tem poçao")
                    }
                }


                3 -> {
                    println("Voce tentou usar golpe especial")
                    println("PRESS ENTER PRA ROLAL O DADO!")
                    readln()
                    Thread.sleep(1000)


                    println("========================================")
                    if (dice() > 10 && jogador.mana > 0) {
                        println("Resultado do dado $resultadoDado")
                        println("Acertou golpe especial ")
                        jogador.mana--
                        println("${jogador.vida}")
                        println("${jogador.nome} ataca o ${inimigo.nome} com ataque especial ${jogador.special} causando 30 de dano adcional")
                        println("========================================")
                        inimigo.vida -= jogador.dano + jogador.magico
                        println("${inimigo.nome} recebeu ${jogador.dano} de dano! Vida restante: ${inimigo.vida}")
                        println("========================================")
                    } else {
                        println("Resultado do dado ${dice()}")
                        println("Você errou o ataque")
                        println("========================================")
                    }
                }


                4 -> {
                    println("Você tentou fugir...")
                    println("PRESS ENTER PRA ROLAL O DADO!")
                    readln()
                    Thread.sleep(1000)
                    println("========================================")
                    if (resultadoDado > 10) {
                        println("Resultado : $resultadoDado")
                        println(" Você conseguiu escapar!")
                        break


                    } else {
                        println("Resultado : $resultadoDado")
                        println("O ${inimigo.nome} bloqueou sua fuga!")
                    }
                }


                else -> println("Escolha inválida!")
            }
            if (inimigo.vida > 0) {
                println("${inimigo.nome} contra-ataca!")
                jogador.vida -= inimigo.dano
                println("Você recebeu ${inimigo.dano} de dano! Sua vida: ${jogador.vida}")
            }


        }


        if (jogador.vida > 0) {
            println("========================================")
            println("Você derrotou o ${inimigo.nome} ganhou ${inimigo.dinheiro} de OURO e reccebeu ${inimigo.mana} de MANA!")
            println("========================================")
            jogador.dinheiro += inimigo.dinheiro
            jogador.mana += inimigo.mana


        } else {
            println("========================================")
            println("Você foi derrotado pelo ${inimigo.nome}... Fim de jogo!")
            println("Se arroumbou-se todin")
            println("========================================")


        }


    }


}
