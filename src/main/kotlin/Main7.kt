

//Here we learn functions in kotlin and type of parameters like default,optional and named parameter
fun main(args: Array<String>)
{
    sum(5)//As here we did not pass the value to the num2 and still did not get any error
    sum(10,25)//Here num2 default value will be override

    var result:String

    result=namedArg(name = "Arshad")//Not passing default parameters
    println(result)

    result=namedArg("Naved", illiterate = true)//overriding one default parameter value
    println(result)

    result=namedArg(pass = false, illiterate = true, name = "Qasim")//passing values using parameters name in any order
    println(result)
}

    /*Such type of functions called unit functions because these function does not return any value and like java we use void for such functions but
    * in kotlin we don't need to put unit explicitly it will be done automatically by kotlin compiler*/
    /*Here the parameter num2 is default parameter or optional parameter because we pass a default value to this parameter which mean if during calling
    * of this function if we don't pass value to num2 then we didn't get any error and if we pass the value then this passing value will override the default value*/
fun sum(num1:Int,num2:Int=7)
{
    println("$num1 + $num2=${num1+num2}")
}

fun namedArg(name:String,pass:Boolean=true,illiterate:Boolean=false):String/*This is return type of this method*/
{
    return if (name=="Arshad")
    {
        "Not passing default parameters"
    }
    else if (name=="Naved" && illiterate==true)
    {
        "overriding one default parameter value"
    }
    else
    {
        "passing values using parameters name in any order"
    }
}