import org.junit.Test
import static org.junit.Assert.*

class HelloWorldTest {
    @Test
    void sayHallo() {
        def helloWorld = new HelloWorld()
        assertEquals "Hello", helloWorld.sayHello()
    }
}
