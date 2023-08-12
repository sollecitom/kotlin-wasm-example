import kotlinx.browser.document
import kotlinx.dom.appendText

fun main() {
    println("Hello, ${greet()}")
    document.body?.appendText("Hello, you're using Kotlin/Wasm!")
}

fun greet() = "world"