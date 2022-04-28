import java.util.Scanner

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
