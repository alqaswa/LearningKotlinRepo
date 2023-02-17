

//Here we will learn about classes in kotlin.In kotlin all the classes are by default public
fun main(args: Array<String>)
{
    var person1=Person1()
    var person2=Person2(25,"Arshad")
    var person3=Person3(17,"Naved")

    person1.showInfo1()
    println()

    person2.showInfo2()
    println()

    person3.showInfo3()

    /*We can also reassign the values to the fields of classes like java but only for var fields and not for val fields like*/
    person1.age=15
    person1.name="Qasim"

}


//Class with no constructor or default constructor
class Person1
{
    var age=20
    var name="Arshad"
    fun showInfo1()
    {
        println("Name and age is $name,$age")
    }
}

//Class with parameterised constructor
class Person2(age:Int,name:String)/*Here these are the parameters and are used to assign the values to other fields But cannot use directly to access within a function*/
{
    var age=age
    var name=name

    fun showInfo2()
    {
        println("Name and age is $name,$age")
    }
}

class Person3(var age:Int, var name:String)/*Here these are not parameters but now become fields and can directly use*/
{
    fun showInfo3()
    {
        println("Name and age is $name,$age")
    }
}