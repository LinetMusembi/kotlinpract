fun main() {
var str1 = "Have a nice day"
    println(str1.length)
var str2 = {}

//    lists
    var numbers = listOf(1,2,3,4,5,6)
    println(numbers)
    println(numbers.size)
    println(numbers.get(0))
    println(numbers.size-0)
//first() will print the first element
//last() will print the last element in a list.
    println(numbers.first())
    println(numbers.last())
//    contain() used to check whether a particular element is contained in a list.
    println(numbers.contains(4))
    println(numbers.contains(10))

//lists are read only meaning that you cannot
    val colors = listOf("green","orange","blue")
    println(colors.reversed())
    println(colors.sorted())

//    sorted function on a list of unsorted numbers
    val oddNumbers = listOf(3,9,1,4,10)
    println(oddNumbers.sorted())

//    Mutable lists
    val entrees = mutableListOf<String>()
    println(entrees)
//    Adding elements to a list
    println(entrees.add("noodles"))
    println(entrees.add("spaghetti"))
//    Instead of adding elements one by one you can use addAll() to add multiple elements at once.
    val moreItems = listOf("margarine","oils","butter")
    println("Add list:${entrees.addAll(moreItems)}")
    println(entrees)
//    Removing elements from a list
//    remove() is used to remove elements from a list
    println(entrees.remove("spaghetti"))
//    Will bring true because spaghetti has been succsesfully removed from the list.

//   removeAt() specifies the index of the element to remove.
    println(entrees.removeAt(0))
//    clear() used to remove all items in a list
    println(entrees.clear())
//  Here,you will get an empty list.
    println(entrees)


//    Looping through lists
//    While loops
    val guestsPerFamily = listOf(2,4,1,3,)
    var totalGuests = 0
    var index = 0
    while (index<guestsPerFamily.size){
        totalGuests += guestsPerFamily[index]
        index++
    }
    println(totalGuests)

//    Using for loops to iterate through a list
    val names = listOf("lynet","ann","yvonne","irene")
    for (name in names){
        println(name)
    }




    var name = "Lynet"
    var age = 19
    println("My name is ${name} and i am ${age} years old my name has ${name.length} characters")

    println( simpleArraySum(arrayOf(2,3,4,5,6,6,7)))

    println(addArrays(arrayOf(2,3,4,5,6,6,7)))

    println( shortSum(arrayOf(2,3,4,5,6,6,7)))

//Kotlin functions

    println( birthdayGreeting())
    birthdayGreet("788",19)

}
fun simpleArraySum(arr:Array<Int>):Int{
    var sum = 0
    for (element in arr){
        sum += element
    }
    return sum

}
fun addArrays(numbers:Array<Int>):Int{
    var sum = 0
    numbers.forEach { sum += it }
    return sum

}
fun shortSum(ar:Array<Int>):Int{
    return ar.sum()



}
fun birthdayGreeting():String{
    val nameGreeting = "Happy birthday Lynet"
    val ageGreeting = "You are now 20years old"
    return "$nameGreeting\n$ageGreeting"
}
//Default Arguments
//To add a default argument,you add the assignment operator(=)after the data type for the parameter.
fun birthdayGreet(name:String = "Lynet",age:Int):String{
    return "Happy Birthday $name! You are now $age years "

}
