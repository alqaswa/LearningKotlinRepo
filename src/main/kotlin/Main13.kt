
//Universal main method or main method outside the class
/*fun main(args: Array<String>)
{
    println("Universal main method")
}*/


//In kotlin classes there is no predefined implementation of the main declared within the class and hence we declared main method at top level which is
//outside the class.But we can implement main method in the class but the only condition is that we have to make this method static which we do in
//companion object block and use annotation @JvmStatic.
class Main13
{
    object members
    {
        var age=30
    }
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            println("Main Method within the class\n")
            println("Can access only static variables like ${members.age}")
        }

    }
}