import java.util.*;

fun main(){
    print(getFortuneCookie())
}

fun getFortuneCookie(): String{
    val fortunes = listOf ("You will have a great day!" , "Things will go well for you today.", "Enjoy a wonderful day of success."
    ,"Be humble and all will turn out wll.","Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday: ")
    val birthday =  readLine()?.toIntOrNull()?:return ("Please enter your birthday.")

    if(birthday > 100 || birthday < 1){
        print("Please enter your birthday.")
    }

    return "Your fortune is: " + fortunes[birthday % fortunes.size]
}
