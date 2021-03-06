import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests of the StringUtil methods.
 */
public class StringUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIndexOf() {
		String[] fruit = {"Apple", "Banana", "Grapes"};
		assertEquals(0, StringUtil.indexOf("Apple", fruit));
	}

	@Test
	public void testReturnTheFirstFound(){

		String[] animal = {"Cat", "Dog", "Dog","Bat"};
		assertEquals(1, StringUtil.indexOf("Dog", animal));

	}

	@Test
	public void testnoElementIndexOf(){

		String[] color = {"Blue", "Red", "Yellow","Pink"};
		assertEquals(-1, StringUtil.indexOf("Green", color));
	}



	@Test
	public void testUpperLetter (){

		String[] color = {"Blue", "Red", "Green","Pink"};
		assertEquals(2, StringUtil.indexOf("GREEN", color));

	}

	//TODO write more tests. Test other cases.
}
