package entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.google.common.base.Predicate;

/**
 * The class <code>HumanResourcesTest</code> contains tests for the class
 * <code>{@link HumanResources}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class HumanResourcesTest {
	/**
	 * Run the HumanResources() constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testHumanResources_1() throws Exception {

		HumanResources result = new HumanResources();

		// add additional test code here
		assertNotNull(result);
		assertEquals("HumanResources [employee=[]]", result.toString());
	}

	/**
	 * Run the HumanResources(List<Employee>) constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testHumanResources_2() throws Exception {
		List<Employee> employee = new ArrayList<Employee>();

		HumanResources result = new HumanResources(employee);

		// add additional test code here
		assertNotNull(result);
		assertEquals("HumanResources [employee=[]]", result.toString());
	}

	/**
	 * Run the HumanResources filter(Predicate<Employee>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testFilter_1() throws Exception {
		HumanResources fixture = new HumanResources(new ArrayList<Employee>());
		Predicate<Employee> predicate = null;

		HumanResources result = fixture.filter(predicate);

		// add additional test code here
		assertNotNull(result);
		assertEquals("HumanResources [employee=[]]", result.toString());
	}

	/**
	 * Run the HumanResources filter(Predicate<Employee>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testFilter_2() throws Exception {
		HumanResources fixture = new HumanResources(new ArrayList<Employee>());
		Predicate<Employee> predicate = null;

		HumanResources result = fixture.filter(predicate);

		// add additional test code here
		assertNotNull(result);
		assertEquals("HumanResources [employee=[]]", result.toString());
	}

	/**
	 * Run the HumanResources filter(Predicate<Employee>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testFilter_3() throws Exception {
		HumanResources fixture = new HumanResources(new ArrayList<Employee>());
		Predicate<Employee> predicate = null;

		HumanResources result = fixture.filter(predicate);

		// add additional test code here
		assertNotNull(result);
		assertEquals("HumanResources [employee=[]]", result.toString());
	}

	/**
	 * Run the HumanResources filter(Predicate<Employee>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testFilter_4() throws Exception {
		HumanResources fixture = new HumanResources(new ArrayList<Employee>());
		Predicate<Employee> predicate = null;

		HumanResources result = fixture.filter(predicate);

		// add additional test code here
		assertNotNull(result);
		assertEquals("HumanResources [employee=[]]", result.toString());
	}
	/**
	 * Run the HumanResources filter(Predicate<Employee>) method test.
	 * 
	 * @throws Exception
	 */
	@Test public void testFilter_5() throws Exception {
		HumanResources fixture = new HumanResources(new ArrayList<Employee>());
		Predicate<Employee> predicate = new Predicate<Employee>() {
			@Override public boolean apply(Employee arg0) {
				return true;
			}
		};
		fixture.getEmployee().add(new Employee());
		HumanResources result = fixture.filter(predicate);

		// add additional test code here
		assertNotNull(result);
	}
	/**
	 * Run the List<Employee> getEmployee() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetEmployee_1() throws Exception {
		HumanResources fixture = new HumanResources((List<Employee>) null);

		List<Employee> result = fixture.getEmployee();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Employee> getEmployee() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetEmployee_2() throws Exception {
		HumanResources fixture = new HumanResources(new ArrayList<Employee>());

		List<Employee> result = fixture.getEmployee();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String toString() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testToString_1() throws Exception {
		HumanResources fixture = new HumanResources(new ArrayList<Employee>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("HumanResources [employee=[]]", result);
	}

	/**
	 * Perform pre-test initialization.
	 * 
	 * @throws Exception
	 *         if the initialization fails for some reason
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Before public void setUp() throws Exception {
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
	@After public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 * 
	 * @param args
	 *        the command line arguments
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HumanResourcesTest.class);
	}
}
