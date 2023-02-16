


//Here we learn while and do while lops in kotlin
fun main(args: Array<String>)
{
    val colorName= arrayOf("Red","Green","White","Yellow")

    var counter=0
    println("While loop will start from here")
    while (counter<colorName.size)
    {
        println(colorName[counter])
        /*println(colorName.get(counter))*///both are same
        counter++
    }
    println()

    counter=0
    println("Do while loop will start")
    do
    {
        println(colorName[counter])
        counter++
    }while (counter<colorName.size)
}