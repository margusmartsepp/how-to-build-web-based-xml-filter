package entity.adhoc;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import entity.Employee;
import entity.HumanResources;

/**
 * The class <code>PXMLTest</code> contains tests for the class
 * <code>{@link PXML}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class PXMLTest {
	/**
	 * Run the int filter0(HumanResources) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testFilter0_1() throws Exception {
		HumanResources hm = new HumanResources(new ArrayList<Employee>());
		int result = PXML.filter0(hm);

		assertEquals(0, result);
	}
	@Test(expected = java.lang.NullPointerException.class)//
	public void testFilter0_2() throws Exception {
		PXML.filter0(null);
	}
	//
	// /**
	// * Run the void filter1(HumanResources,String) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter1_1() throws Exception {
	// HumanResources hm = new HumanResources();
	// String department = "";
	//
	// PXML.filter1(hm, department);
	//
	// // add additional test code here
	// // An unexpected exception was thrown in user code while executing this
	// // test:
	// // java.lang.NullPointerException
	// // at
	// //
	// com.google.common.base.Preconditions.checkNotNull(Preconditions.java:187)
	// // at entity.HumanResources.filter(HumanResources.java:127)
	// // at entity.adhoc.PXML.filter1(PXML.java:248)
	// }
	//
	// /**
	// * Run the void filter1(HumanResources,String) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test(expected = java.lang.NullPointerException.class) public void
	// testFilter1_2() throws Exception {
	// HumanResources hm = new HumanResources();
	// String department = "";
	//
	// PXML.filter1(hm, department);
	//
	// // add additional test code here
	// }
	//
	// /**
	// * Run the void filter2(HumanResources,int) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter2_1() throws Exception {
	// HumanResources hm = new HumanResources();
	// int month = 1;
	//
	// PXML.filter2(hm, month);
	//
	// // add additional test code here
	// // An unexpected exception was thrown in user code while executing this
	// // test:
	// // java.lang.NullPointerException
	// // at
	// //
	// com.google.common.base.Preconditions.checkNotNull(Preconditions.java:187)
	// // at entity.HumanResources.filter(HumanResources.java:127)
	// // at entity.adhoc.PXML.filter2(PXML.java:267)
	// }
	//
	// /**
	// * Run the void filter2(HumanResources,int) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test(expected = java.lang.NullPointerException.class) public void
	// testFilter2_2() throws Exception {
	// HumanResources hm = new HumanResources();
	// int month = 1;
	//
	// PXML.filter2(hm, month);
	//
	// // add additional test code here
	// }
	//
	// /**
	// * Run the void filter3(HumanResources,Double) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter3_1() throws Exception {
	// HumanResources hm = new HumanResources();
	// Double size = new Double(1.0);
	//
	// PXML.filter3(hm, size);
	//
	// // add additional test code here
	// // An unexpected exception was thrown in user code while executing this
	// // test:
	// // java.lang.NullPointerException
	// // at
	// //
	// com.google.common.base.Preconditions.checkNotNull(Preconditions.java:187)
	// // at entity.HumanResources.filter(HumanResources.java:127)
	// // at entity.adhoc.PXML.filter3(PXML.java:293)
	// }
	//
	// /**
	// * Run the void filter3(HumanResources,Double) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test(expected = java.lang.NullPointerException.class) public void
	// testFilter3_2() throws Exception {
	// HumanResources hm = new HumanResources();
	// Double size = new Double(1.0);
	//
	// PXML.filter3(hm, size);
	//
	// // add additional test code here
	// }
	//
	// /**
	// * Run the void filter4(HumanResources,String) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter4_1() throws Exception {
	// HumanResources hm = new HumanResources();
	// String job = "";
	//
	// PXML.filter4(hm, job);
	//
	// // add additional test code here
	// // An unexpected exception was thrown in user code while executing this
	// // test:
	// // java.lang.NullPointerException
	// // at
	// //
	// com.google.common.base.Preconditions.checkNotNull(Preconditions.java:187)
	// // at entity.HumanResources.filter(HumanResources.java:127)
	// // at entity.adhoc.PXML.filter4(PXML.java:311)
	// }
	//
	// /**
	// * Run the void filter4(HumanResources,String) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test(expected = java.lang.NullPointerException.class) public void
	// testFilter4_2() throws Exception {
	// HumanResources hm = new HumanResources();
	// String job = "";
	//
	// PXML.filter4(hm, job);
	//
	// // add additional test code here
	// }
	//
	// /**
	// * Run the Report filter5(HumanResources) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter5_1() throws Exception {
	// HumanResources hm = new HumanResources(new ArrayList<Employee>());
	//
	// Report result = PXML.filter5(hm);
	//
	// // add additional test code here
	// assertNotNull(result);
	// assertEquals(0.0, result.getGrandTotal(), 1.0);
	// assertEquals("Report [id=null, depWageSum={}, grandTotal=0.0]",
	// result.toString());
	// assertEquals(null, result.getId());
	// }
	//
	// /**
	// * Run the Report filter5(HumanResources) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter5_2() throws Exception {
	// HumanResources hm = new HumanResources(new ArrayList<Employee>());
	//
	// Report result = PXML.filter5(hm);
	//
	// // add additional test code here
	// assertNotNull(result);
	// assertEquals(0.0, result.getGrandTotal(), 1.0);
	// assertEquals("Report [id=null, depWageSum={}, grandTotal=0.0]",
	// result.toString());
	// assertEquals(null, result.getId());
	// }
	//
	// /**
	// * Run the Report filter5(HumanResources) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter5_3() throws Exception {
	// HumanResources hm = new HumanResources(new ArrayList<Employee>());
	//
	// Report result = PXML.filter5(hm);
	//
	// // add additional test code here
	// assertNotNull(result);
	// assertEquals(0.0, result.getGrandTotal(), 1.0);
	// assertEquals("Report [id=null, depWageSum={}, grandTotal=0.0]",
	// result.toString());
	// assertEquals(null, result.getId());
	// }
	//
	// /**
	// * Run the Report filter5(HumanResources) method test.
	// *
	// * @throws Exception
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Test public void testFilter5_4() throws Exception {
	// HumanResources hm = new HumanResources(new ArrayList<Employee>());
	//
	// Report result = PXML.filter5(hm);
	//
	// // add additional test code here
	// assertNotNull(result);
	// assertEquals(0.0, result.getGrandTotal(), 1.0);
	// assertEquals("Report [id=null, depWageSum={}, grandTotal=0.0]",
	// result.toString());
	// assertEquals(null, result.getId());
	// }
	//
	// /**
	// * Perform pre-test initialization.
	// *
	// * @throws Exception
	// * if the initialization fails for some reason
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @Before public void setUp() throws Exception {
	// // add additional set up code here
	// }
	//
	// /**
	// * Perform post-test clean-up.
	// *
	// * @throws Exception
	// * if the clean-up fails for some reason
	// *
	// * @generatedBy CodePro at 6.12.10 1:06
	// */
	// @After public void tearDown() throws Exception {
	// // Add additional tear down code here
	// }

	/**
	 * Launch the test.
	 * 
	 * @param args
	 *        the command line arguments
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PXMLTest.class);
	}
}
