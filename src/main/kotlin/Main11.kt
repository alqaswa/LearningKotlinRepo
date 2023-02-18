

//Here we will learn about inheritance in kotlin
fun main(args: Array<String>)
{

}

/*Before inheriting any parent class in kotlin,it is very important to note that all the classes in kotlin are by default public and final and hence
in order to inherit any class we have to make that parent class inheritable which is done by using 'open' keyword Also if we want to override the
methods or variables of parent class in child class then these methods and variables also should be open as shown below*/

//Parent class having no constructor or default constructor
open class Parent1
{
    open var car:String="bmw"/*override by Child1 class*/
}

//Parent class having primary constructor
open class Parent2(age:Int,name:String)
{

}

//Parent class having only secondary constructor
open class Parent3
{
    constructor(age:Int,name:String)
    {

    }
}

//Parent class having both primary as well secondary constructor
open class Parent4(age:Int,name:String)
{
    constructor(rno:Int):this(0,"Parent4 constructor")
    {

    }
}


//Child class having no constructor and inheriting Parent1
class Child1:Parent1()
{
    override var car:String="mercedez"
}

//Child class having primary constructor and inheriting Parent2
class Child2(age:Int,name:String,rno:Int):Parent2(age,name)
{
    /*Whenever inheriting a parent class which contain a parametrised constructor then we should always call the constructor of parent class*/
}

//Child class having primary constructor and inheriting Parent3
/*class Child2(age:Int,name:String,rno:Int):Parent3(age,name)
{
    *//*Whenever inheriting a parent class which contain a parametrised constructor then we should always call the constructor of parent class*//*
}*/

//Child class having no constructor or having secondary constructor and inheriting Parent2
class Child3:Parent2
{
    constructor(age:Int,name:String,rno:Int):super(age,name)
    {

    }
}

//Child class having primary as well as secondary constructor and calling Parent 4 which also have both constructor
//Case:1
class Child4(age:Int,name:String):Parent4(age,name)/*Calling primary constructor of parent*/
{
    constructor(age:Int,name:String,rno:Int):this(age,name)
    {

    }
}
//Case:2
class Child5(age:Int,name:String):Parent4(age)/*Calling Secondary constructor of parent*/
{
    constructor(age:Int,name:String,rno:Int):this(age,name)
    {

    }
}