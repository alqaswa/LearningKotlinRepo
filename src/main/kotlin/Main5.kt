import java.util.*

//Here we learn For loop in kotlin
fun main(args: Array<String>)
{
    val colorsName = arrayOf("Red","Green","Yellow","white")

    //ForEach loop in java we used is
    /*for(String name:colorsName)
    {
        println(name)
    }*/

    //ForEach loop in kotlin
    println("Using forEach loop")
    for (color in colorsName)
    {
        println(color)
    }

    //For loop in kotlin

    println("Using simple range operator")
    for (i in 0..10)/*In kotlin for loop boundaries are always included*/
    {
        print("$i ,")
    }
    println()

    println("Using range with step")
    for (i in 0..10 step 2)
    {
        print("$i ,")
    }
    println()

    println("Reverse iteration using down to method")
    /*It is very important to note that step cannot be negative and if we are using dot operators for range than starting boundary must be small
    * then end boundary BUT when we reverse iterate or when we use downTo method then starting boundary must be big then end boundary*/
    for (i in 10 downTo 0 step 2)
    {
        print("$i ,")
    }
    println()

    println("we can also iterate characters using for loop")
    for (i in 'a'..'z' step 3)
    {
        print("$i ")
    }
    println()


    //Using until method
    /*Until method is used when we want to exclude the end boundary like when we iterate arrays because array index is always one less than the size of
    * array and hence if we simply use range while iterating arrays then we get IndexOutOfBoundsException that's why we use until method in for loop
    * */
    println("Iterating using until operators in place of range")
    for (i in 0 until colorsName.size)
    {
        print(colorsName[i]+",")
    }
}