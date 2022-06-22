import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun sayHelloTest() {
        assertEquals("<p>Hello <em>Rimu</em>!</p>",sayHello())
    }
}