import kotlinx.browser.document
import kotlinx.dom.appendText

fun main() {
    println("Hello, ${greet()}")
    val greeter: Greeter = SimpleGreeter()
    document.body?.appendText(greeter.greet())
}

interface Greeter {

    fun greet(): String
}

class SimpleGreeter : Greeter {

    override fun greet() = "Hello, you're using Kotlin/Wasm!"
}

fun greet() = "world"