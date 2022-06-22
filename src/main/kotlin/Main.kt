import org.rimumarkup.render

fun main() {
    val msg = sayHello()
    println(msg)
}

fun sayHello(): String{
    return render("Hello *Rimu*!")
}