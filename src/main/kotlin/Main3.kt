import java.util.Scanner

fun main(args: Array<String>)
{
    println("enter your name")
    val name= readLine()

    //readLine and Scanner both are same which are used to take input from the user like we use Scanner in java
    /*val input=Scanner(System.`in`)
    val name=input.next()*/

    /*This is the benefit we get from kotlin that we can use if conditions as an expression to store result which id return by these conditions
    and this result can be used for further purpose*/
    val result=if (name=="Arshad")
    {
        "Your name is Qasim"
    }
    else
    {
        "your name is i don't know"
    }

    println(result)
}