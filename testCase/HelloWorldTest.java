import static org.junit.Assert.*;
import org.junit.Test;
public class HelloWorldTest {
	public HelloWorld hello = new HelloWorld();
	@Test
	public void testHello(){
		hello.hello();
		assertEquals("Hello World!", hello.getStr());
	}
}
