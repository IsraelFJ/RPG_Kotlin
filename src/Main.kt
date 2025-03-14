fun main() {
    var reset : Int
    do{
        println("==========================DUNGEON BATTLE==================================")
        println("======================APERTE ENTER PARA INICIAR==========================")
        readln()
        Thread.sleep(1000)
        println("HEI! Novato, chegou por aqui agora?")
        Thread.sleep(500)
        println("Está buscando glória e fama? HAHAHAHA!!!! Todos estão!")
        Thread.sleep(500)
        println("Olha como está esfarrapado! HAHAHAH!!!!! Me diga o que você é, aventureiro?")
        println("=========================================================================")
        Thread.sleep(1000)
        println("===================")
        println("1-Gerreiro")
        println("===================")
        println("STATUS")
        val champ = Champ(100,"",20,10,1,5,5,"Golpe forte")
        println("|Vida: ${champ.vida} |Dano: ${champ.dano} |Mana: ${champ.mana} |Dano magico: ${champ.magico}" +
                "\n|Ouro: ${champ.dinheiro} |Poção: ${champ.pocao}")
        Thread.sleep(1000)
        println("===================")
        println("2-Mago")
        println("===================")
        println("STATUS")
        val champ2 = Champ(110,"",15,10,1,5,5,"Golpe magico")
        println("|Vida: ${champ2.vida} |Dano: ${champ2.dano} |Mana: ${champ2.mana} |Dano magico: ${champ2.magico}" +
                "\n|Ouro: ${champ2.dinheiro} |Poção: ${champ2.pocao}")
        Thread.sleep(1000)
        println("===================")
        println("3-Espadachim")
        println("===================")
        println("STATUS")
        val champ3 = Champ(130,"",8,10,1,5,5,"Dano de espada")
        println("|Vida: ${champ3.vida} |Dano: ${champ3.dano} |Mana: ${champ3.mana} |Dano magico: ${champ3.magico}" +
                "\n|Ouro: ${champ3.dinheiro} |Poção: ${champ3.pocao}")
        println("===================")


        Thread.sleep(1000)


        val slime = Enemy.Inimigo(10,"Slime",0,1,1,1,0,"")
        val soulessKnigth = Enemy.Inimigo(15,"Souless Knight",1,1,0,1,0,"")
        val ghoul = Enemy.Inimigo(20,"Ghoul",0,1,1,1,0,"")
        val warLord = Enemy.Inimigo(30,"War Lord",0,1,1,1,0,"")


        println("Escolha seu champ ")
        when (readln().toInt()) {
            1 -> {
                Gameplay().gamestart(champ,slime)
                if (champ.vida <= 0) break
                Gameplay().gamestart2(champ,ghoul)
                if (champ.vida <= 0) break
                Gameplay().gamestart3(champ,soulessKnigth)
                if (champ.vida <= 0) break
                Gameplay().gamestart4(champ,warLord)
                if (champ.vida <= 0) break


            }
            2 -> {
                Gameplay().gamestart(champ,slime)
                if (champ2.vida <= 0) break
                Gameplay().gamestart2(champ,ghoul)
                if (champ2.vida <= 0) break
                Gameplay().gamestart3(champ,soulessKnigth)
                if (champ2.vida <= 0) break
                Gameplay().gamestart4(champ,warLord)
                if (champ2.vida <= 0) break


            }
            3 -> {
                Gameplay().gamestart(champ,slime)
                if (champ3.vida <= 0) break
                Gameplay().gamestart2(champ,ghoul)
                if (champ3.vida <= 0) break
                Gameplay().gamestart3(champ,soulessKnigth)
                if (champ3.vida <= 0) break
                Gameplay().gamestart4(champ,warLord)
                if (champ3.vida <= 0) break
            }
            else -> println("Escolha inválida!")
        }
        println("PLAY AGAIN?\nPRESS 1 - (Sim) 2 - (Não)")
        reset = readln().toInt()
    } while (reset == 1)








}


