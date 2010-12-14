package entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * The class <code>ReportTest</code> contains tests for the class
 * <code>{@link Report}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class ReportTest {
	/**
	 * Run the Report() constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testReport_1() throws Exception {

		Report result = new Report();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getGrandTotal(), 1.0);
		assertEquals("Report [id=null, depWageSum={}, grandTotal=0.0]",
				result.toString());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the Report(HashMap<String,Double>,Long) constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testReport_2() throws Exception {
		HashMap<String, Double> depWageSum = Maps.newHashMap();
		Long id = new Long(1L);

		Report result = new Report(depWageSum, id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getGrandTotal(), 1.0);
		assertEquals("Report [id=1, depWageSum={}, grandTotal=0.0]",
				result.toString());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the Report(HashMap<String,Double>,Long) constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testReport_3() throws Exception {
		HashMap<String, Double> depWageSum = Maps.newHashMap();
		Long id = new Long(1L);

		Report result = new Report(depWageSum, id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getGrandTotal(), 1.0);
		assertEquals("Report [id=1, depWageSum={}, grandTotal=0.0]",
				result.toString());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the ImmutableMap<String, Double> getDepWageSum() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetDepWageSum_1() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;

		ImmutableMap<String, Double> result = fixture.getDepWageSum();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the double getGrandTotal() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetGrandTotal_1() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;

		double result = fixture.getGrandTotal();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the Long getId() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetId_1() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;

		Long result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the void push(String,Double) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testPush_1() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		String departmentTitle = "";
		Double hourRate = new Double(1.0);

		fixture.push(departmentTitle, hourRate);

		// add additional test code here
	}

	/**
	 * Run the void push(String,Double) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testPush_2() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		String departmentTitle = "";
		Double hourRate = new Double(1.0);

		fixture.push(departmentTitle, hourRate);

		// add additional test code here
	}
	/**
	 * Run the void push(String,Double) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testPush_3() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		String departmentTitle = "";
		Double hourRate = new Double(1.0);

		fixture.push(departmentTitle, hourRate);
		fixture.push(departmentTitle, hourRate);
		// add additional test code here
	}
	/**
	 * Run the void push(String,Double) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test(expected = Exception.class) public void testPush_4() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		String departmentTitle = "";
		Double hourRate = new Double(-1.0);

		fixture.push(departmentTitle, hourRate);

	}
	/**
	 * Run the void setDepWageSum(HashMap<String,Double>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetDepWageSum_1() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		HashMap<String, Double> depWageSum = Maps.newHashMap();

		fixture.setDepWageSum(depWageSum);

		// add additional test code here
	}

	/**
	 * Run the void setDepWageSum(HashMap<String,Double>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetDepWageSum_2() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		HashMap<String, Double> depWageSum = Maps.newHashMap();

		fixture.setDepWageSum(depWageSum);

		// add additional test code here
	}

	/**
	 * Run the void setDepWageSum(HashMap<String,Double>) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetDepWageSum_3() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		HashMap<String, Double> depWageSum = Maps.newHashMap();

		fixture.setDepWageSum(depWageSum);

		// add additional test code here
	}

	/**
	 * Run the void setDepWageSum(HashMap<String,Double>) method test.
	 * 
	 * @throws Exception
	 * 
	 */
	@Test public void testSetDepWageSum_4() throws Exception {
		HashMap<String, Double> hm = Maps.newHashMap();
		hm.put("1", 5.3);
		Report fixture = new Report(hm, 1L);
		hm.put("1", 55.6);
		fixture.setDepWageSum(hm);
		// add additional test code here
	}
	/**
	 * Run the void setDepWageSum(HashMap<String,Double>) method test.
	 * 
	 * @throws Exception
	 * 
	 */
	@Test public void testSetDepWageSum_5() throws Exception {
		HashMap<String, Double> hm = Maps.newHashMap();
		hm.put("1", 5.3);
		Report fixture = new Report(hm, 1L);
		hm.put("1", -55.6);
		fixture.setDepWageSum(hm);
		// add additional test code here
	}
	/**
	 * Run the void setId(Long) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetId_1() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;
		Long value = new Long(1L);

		fixture.setId(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testToString_1() throws Exception {
		Report fixture = new Report();
		fixture.setId(new Long(1L));
		fixture.depWageSum = Maps.newHashMap();
		fixture.grandTotal = 1.0;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Report [id=1, depWageSum={}, grandTotal=1.0]", result);
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
		new org.junit.runner.JUnitCore().run(ReportTest.class);
	}
}
