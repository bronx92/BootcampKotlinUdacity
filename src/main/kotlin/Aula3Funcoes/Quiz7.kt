/*
    Crie um programa com uma função que retorna uma mensagem do cookie da sorte (fortune cookie) que você possa imprimir.

    1. Crie uma função main().
    2. A partir da função main(), acione uma função getFortuneCookie(), que retorne uma String.
    3. Crie uma função getFortuneCookie () que não demande argumentos e retorne uma String.
    4. No corpo de getFortuneCookie (), crie uma lista de fortunas. Aqui vão algumas ideias:
        "You will have a great day!"
        "Things will go well for you today."
        "Enjoy a wonderful day of success."
        "Be humble and all will turn out well."
        "Today is a good day for exercising restraint."
        "Take it easy and enjoy life!"
        "Treasure your friends because they are your greatest fortune."
    5. Abaixo da lista, imprima: "Enter your birthday: "
        Dica: Use print() e não println()
    6. Crie uma variável birthday.
    7. Leia o formulário de input do usuário e atribua-o a birthday. Se não houver input válido, defina birthday como 1.
        Dica: Use readLine() para ler uma linha de input (completada com Enter) como uma String.
        Dica: No Kotlin, você pode usar o toIntOrNull() para converter um número como uma String em um Integer numérico. Se o usuário digitar "", toIntOrNull retornará "null".
        Dica: Verifique se há null usando o operador ?, e use o operador ?: para gerenciar o caso null.
    8. Divida o aniversário pelo número de fortunas e use o restante como o índice do que dever ser retornado.
    9. Retorne a fortuna.
    10. In main(), print: "Your fortune is: ", seguido da string de fortuna.

    Prática extra:
    Use um loop for que execute o código até o máximo de 10 vezes ou até que a fortuna "Take it easy" seja encontrada.
 */
fun main(){
    for (i in 1..10) {
        var fortune: String = getFortuneCookie()
        print("Your fortune is: ${ fortune }\n")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie(): String {
    val message = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday: ")
    val birth = readLine()?.toIntOrNull() ?: 1
    return message[birth.rem(message.size)]
}
