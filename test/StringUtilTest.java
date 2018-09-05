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
	public void moreTestIndexOf(){

		String[] animal = {"Cat", "Dog", "Dog","Bat"};
		assertEquals(1, StringUtil.indexOf("Dog", animal));

	}

	@Test
	public void moreTestIndexOf2(){

		String[] color = {"Blue", "Red", "Yellow","Pink"};
		assertEquals(-1, StringUtil.indexOf("Green", color));
	}

	//TODO write more tests. Test other cases.
}
