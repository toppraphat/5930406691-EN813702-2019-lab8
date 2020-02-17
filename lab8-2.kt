import java.util.*;

fun main(){
    var fortune: String
    for(i in 1..10){
        fortune = getFortune(getBirthday())
        print("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}
fun getFortune(birthday: Int?): String{
    val fortunes = listOf ("You will have a great day!" , "Things will go well for you today.", "Enjoy a wonderful day of success."
        ,"Be humble and all will turn out wll.","Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    return when(birthday){

        in -100..0 -> "Please Enter a valid birthday (1-31).\n"
        in 32..100 -> "Please Enter a valid birthday (1-31).\n"
        7 -> "Have a good start the first week of month.\n"
        8 -> "Things will go well for you today.\n"
        11 -> "Today is a good day for exercising restraint.\n"
        12 -> "Take it easy and enjoy life!\n"
        13 -> "Treasure your friends because they are your greatest fortune.\n"
        in 28..31 -> "Enjoy that last days of month.\n"
        null -> "Please Enter a valid birthday (1-31).\n"
        else -> fortunes[birthday!! % fortunes.size ]+ "\n"
    }
}
fun getBirthday(): Int?{
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull()?:return null
}

