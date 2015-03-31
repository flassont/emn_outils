package po.td1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HelloTest {

	private Hello hello;
	
	@Before
	public void setUp() throws Exception {
		hello = new Hello(); 
	}

	@After
	public void tearDown() throws Exception {
		hello = null;
	}

	@Test
	public void testGreetings() {
		String expected = "Hello World!";
		String actual = hello.greetings();
		Assert.assertEquals("greetings is expected to return \"" + expected + "\"", expected, actual);
	}

}
