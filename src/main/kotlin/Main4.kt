import java.util.Scanner

fun main(args: Array<String>)
{
    //In this we implement switch cases in kotlin which are called when

    println("Enter your name")
    val name= readLine()

    when(name)
    {
        "Arshad","Ahmed"-> println("Your name is Arshad or Ahmed")//Here the input is match for both either Arshad or Ahmed
        "Qasim"-> println("Your name is Qasim")
        "Naved"-> println("Your name is Naved")
        else-> println("I don't know what is your name")
    }

    //We can also use when like an expression and can store result
    println("Enter your age")
    val scanner=Scanner(System.`in`)//We can simply use readLine() for input
    val age=scanner.nextInt()

    val result=when(age)
    {
        in 0..17->"You are not eligible for voting"
        in 18..59->"You can vote for your required candidate"
        else->"You are retired and old"
    }

    println(result)
}