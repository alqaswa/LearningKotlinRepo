

//Here we will learn about primary constructor,secondary constructors and init block
fun main(args: Array<String>)
{
    var second=Second(24,"Arshad")
    second.showInfo()

    var secondaryConstructor=Third("Arshad")

    var fourth1=Fourth()/*Acts as default constructor*/
    var fourth2=Fourth(15)/*Acts as single parameter constructor*/
    var fourth3=Fourth(20,"Naved")/*Acts as double parameter constructor*/
}

//Primary Constructor
/*And it is important to note that there is only one primary constructor can be used for any class*/
class First(age:Int,name:String)//This is called primary constructor
{
    var age =age
    var name =name
}

//InIt block
/*Whenever an object of class is create the code of the class which execute first is the init block.It is just like the static block in java because
* static block is also execute first when the object of class is created
* Only primary constructor or default constructor is executed before this block, and it should be because in order to execute thi init block a class
* must be initialised, and it is done only when an object of class is created by using constructor of that class */
class Second(age:Int,name:String)
{
    var age =age
    var name =name

    fun showInfo()
    {
        println("This ia method which Always called after the init")
        println("These values are changed in init from the values we pass in object creation of this class")
        println("name and age is :$name , $age")
    }
    init
    {
        println("This init block called first whatever the position of this block in the class")
        this.age=20
        this.name="Naved"
    }
}

//Secondary constructors
/*Secondary constructors are used when we want constructors overloading*/
class Third(age:Int,name:String)
{
    var age =age
    var name =name

    /*It is important to note that when we create secondary constructor then we have to call primary constructor explicitly ,and it is not mandatory
    * that we have to use primary constructor in order to create secondary constructor we can also create secondary constructor without creating
    * primary constructor and in this case we don't need to call primary constructor explicitly like
    * constructor(name: String)
    {
        this.name=name
        println("This is secondary constructor which required only one parameter\n$name")
    }*
    But when we use primary constructor as well secondary constructor then we have to call primary constructor explicitly*/
    constructor(name: String):this(10,"default")
    {
        this.name=name
        println("This is secondary constructor which required only one parameter\n$name")
    }

    init
    {
        println("This init block called first whatever the position of this block in the class")

    }
}

//In kotlin we most rarely used secondary constructor because we can use a single primary constructor in different ways by using default parameters like
class Fourth(var age:Int=10,var name:String="Arshad")
{

}