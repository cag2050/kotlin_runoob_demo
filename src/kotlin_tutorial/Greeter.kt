package kotlin_tutorial

class Greeter (private val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter("world").greet()
}