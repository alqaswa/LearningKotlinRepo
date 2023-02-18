

fun main(args: Array<String>)
{
    //Calling members of class which are within only object block
    Members.Member1.rno
    Members.Member1.sum1()


    //Calling members of class which are within companion object.Here we don't need object name and call directly by suing class name
    Members.name
    Members.sum2()

    //Static variables declared outside the class
    StaticVariables.mAge
}

//Object and companion Object
/*Like in java we have some members which we can access directly by using class name and these members(variables or methods) are called static members
* Similarly in kotlin in order to create static methods or variable we used object keyword But we have two approaches for this let's discuss*/

class Members
{
    var age=10

    //When we use simple 'object' to make variables or methods static then we can access these variables and methods by simply using class name followed
    //by object name and then name of required variable or method.Also, we can create one or more objects in same class
    object Member1
    {
        var rno=25;
        fun sum1()
        {
            name /*In these objects we can use only those member which are declared within companion object or simply object block.Here variable age can't access*/
        }
    }

    //This is also work same as above but only the difference is that the members or methods inside this object can be call directly by using simple
    //class name followed by member name and here we did not use object name to call these members.Also,we can create only one companion object within
    //same class
    companion object
    {
        var name="Arshad"
        fun sum2()
        {
            Member1.rno /*In these objects we can use only those member which are declared within companion object or simply object block*/
        }
    }
}

//We can also create these static fields outside the class which can be accessed throughout the package like.
object StaticVariables
{
    var mAge=20
}
