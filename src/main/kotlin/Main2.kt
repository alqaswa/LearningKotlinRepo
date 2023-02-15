

//In This class we will learn logical operators logical &&,|| and Bitwise (and,or)
fun main(args: Array<String>)
{
    /*The main and important difference between logical and bitwise operator is that logical operators are not check all the conditions always only check first condition like for logical
    * && operator if the first condition is false then it will not check all other condition and return result will be false and if the first condition
    * is true then only it will check second condition
    * BUT logical || operator only check the first condition and not all condition like if the first condition is false result5 will be false and if
    * first condition is true result will be true*/

    val value1=true
    val value2=false

    println("Value1 && Value2=${value1 && value2}")//Here check both condition
    println("Value2 && Value1=${value2 && value1}")//Here check only first condition
    println("Value1 && Value2=${value1 || value2}")//Check second condition only when first is false

    /*BUT bitwise & and | operators always check all the condition and after that return the result.It is important to note that result will be same
    * either we are using bitwise or logical operators but the main motive to use bitwise operators is that sometimes it is required that we need to
    * execute some code either our result return false and in that case we need these operators
    * In java we use & and | symbols for bitwise operators but in Kotlin we simply use 'and' and 'or' keywords*/


    println("Evaluating result using bitwise operators")
    println("Which is wrong email or password or both ${isEmailValid() && isPasswordValid()}")//Check second condition only when first is true
    println("Which is wrong email or password or both ${isEmailValid() || isPasswordValid()}")//Check second condition only when first is false
    println()

    println("Which is wrong email or password or both ${isEmailValid() and isPasswordValid()}")//Always check both the conditions whether first is false or true
    println("Which is wrong email or password or both ${isEmailValid() or isPasswordValid()}")//Always check both the conditions whether first is false or true
}

fun isEmailValid():Boolean
{
    println("Email is wrong")
    return false
}

fun isPasswordValid():Boolean
{
    println("Password is wrong")
    return false
}