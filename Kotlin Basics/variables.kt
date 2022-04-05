fun main(){
    /*  Variable declared using val can only be set once.
        Can not change its value later in the program.

        Variable declared using var is changeable which we'll use that later.
    */    
    val age = 21

    println("Happy birthday, Adem")
    println("You're ${age} years old.")
    println("Adem leveled up to ${age}")

    val age1 = 21 * 365
    
    println("Happy birthday, Adem")
    println("You're ${age1} days old.")

    val name = "Adem"

    println("Happy birthday, ${name}")
    println("You're ${age1} days old.")
    printBorder()
    println("Happy birthday, ${name}")
    printBorder()
    println("You're ${age1} days old.")

    repeatBorder()
    println("Happy birthday, ${name}")
    repeatBorder()
    println("You're ${age1} days old.")


    val border = "."
    val border2 ="-"
    val repeattime = 24

    changeableBorder(border, border2, repeattime)
    println("Happy birthday, ${name}")
    changeableBorder(border2, border, repeattime)
    println("You're ${age1} days old.")
}

fun printBorder(){
    println("=======================")
}

fun repeatBorder(){
    repeat(25){   // Used for loops
        print("=")
    }
    println()
}
// Parameters should have a name and a type.
fun changeableBorder(border: String, border2: String, times2repeat: Int){
    repeat(times2repeat){
        print(border)
        print(border2)
    }
    println()
}