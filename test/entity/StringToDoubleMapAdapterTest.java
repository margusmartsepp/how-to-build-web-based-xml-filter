package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StringToDoubleMapAdapterTest</code> contains tests for the class <code>{@link StringToDoubleMapAdapter}</code>.
 *
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class StringToDoubleMapAdapterTest {
	/**
	 * Run the StringToDoubleMapAdapter() constructor test.
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testStringToDoubleMapAdapter_1()
		throws Exception {
		StringToDoubleMapAdapter result = new StringToDoubleMapAdapter();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the StringToDoubleMapAdapter marshal(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		StringToDoubleMapAdapter fixture = new StringToDoubleMapAdapter();
		fixture.entry = new ArrayList<StringToDoubleMapAdapter.MapTypeEntry>();
		Map v = new HashMap();

		StringToDoubleMapAdapter result = fixture.marshal(v);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringToDoubleMapAdapter marshal(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testMarshal_2()
		throws Exception {
		StringToDoubleMapAdapter fixture = new StringToDoubleMapAdapter();
		fixture.entry = new ArrayList<StringToDoubleMapAdapter.MapTypeEntry>();
		Map v = new HashMap();

		StringToDoubleMapAdapter result = fixture.marshal(v);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map unmarshal(StringToDoubleMapAdapter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		StringToDoubleMapAdapter fixture = new StringToDoubleMapAdapter();
		fixture.entry = new ArrayList<StringToDoubleMapAdapter.MapTypeEntry>();
		StringToDoubleMapAdapter v = new StringToDoubleMapAdapter();
		v.entry = new ArrayList<StringToDoubleMapAdapter.MapTypeEntry>();

		Map result = fixture.unmarshal(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map unmarshal(StringToDoubleMapAdapter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testUnmarshal_2()
		throws Exception {
		StringToDoubleMapAdapter fixture = new StringToDoubleMapAdapter();
		fixture.entry = new ArrayList<StringToDoubleMapAdapter.MapTypeEntry>();
		StringToDoubleMapAdapter v = new StringToDoubleMapAdapter();
		v.entry = new ArrayList<StringToDoubleMapAdapter.MapTypeEntry>();

		Map result = fixture.unmarshal(v);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		new org.junit.runner.JUnitCore().run(StringToDoubleMapAdapterTest.class);
	}
}