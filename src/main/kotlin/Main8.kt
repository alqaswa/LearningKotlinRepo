

//Here we will learn about varargs keyword
/*varargs keyword is used when we don't know the exact number of parameters a function can accept or this keyword is used in that situation when
* we want to multiple number of arguments which may be decided dynamically */
fun main(args: Array<String>)
{
    multiply1(2,3,5,6)
    multiply2(2,5,3,4)
}

/*In this method we know that only two parameters are required by this method*/
fun sums(num1:Int,num2:Int)
{
    println("$num1+$num2=${num1+num2}")
}

/*Here num1 is now not a single number ,but it is an array of int*/
fun multiply1(vararg num1: Int)
{
    var result=1
    for (i in num1)
    {
        result *= i
    }
    println("Multiplication is = $result")
}

fun multiply2(num1: Int,vararg num2: Int)
{
    var result=1
    for (i in num2)
    {
        result*=i
    }
    result *= num1
    println("Multiplication is = $result")
}