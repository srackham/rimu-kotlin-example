import org.rimumarkup.render

fun main() {
    val msg = sayHello()
    println(msg)

/*
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
*/
}

fun sayHello(): String{
    return render("Hello *Rimu*!")
}