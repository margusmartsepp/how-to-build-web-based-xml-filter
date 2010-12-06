package entity;

import org.junit.*;
import entity.MapTypeEntry;
import static org.junit.Assert.*;

/**
 * The class <code>MapTypeEntryTest</code> contains tests for the class <code>{@link MapTypeEntry}</code>.
 *
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class MapTypeEntryTest {
	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		MapTypeEntry fixture = new MapTypeEntry();
		fixture.setValue(1.0);
		fixture.setKey("");

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		MapTypeEntry fixture = new MapTypeEntry();
		fixture.setValue(1.0);
		fixture.setKey("");

		double result = fixture.getValue();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the void setKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetKey_1()
		throws Exception {
		MapTypeEntry fixture = new MapTypeEntry();
		fixture.setValue(1.0);
		fixture.setKey("");
		String value = "";

		fixture.setKey(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		MapTypeEntry fixture = new MapTypeEntry();
		fixture.setValue(1.0);
		fixture.setKey("");
		double value = 1.0;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MapTypeEntry fixture = new MapTypeEntry();
		fixture.setValue(1.0);
		fixture.setKey("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MapTypeEntry [value=1.0, key=]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MapTypeEntryTest.class);
	}
}