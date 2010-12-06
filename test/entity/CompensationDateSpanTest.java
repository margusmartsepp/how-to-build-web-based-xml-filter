package entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.text.DateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>CompensationDateSpanTest</code> contains tests for the class
 * <code>{@link CompensationDateSpan}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:07
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class CompensationDateSpanTest {
	/**
	 * Run the CompensationDateSpan() constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testCompensationDateSpan_1() throws Exception {

		CompensationDateSpan result = new CompensationDateSpan();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStart());
		assertEquals(null, result.getEnd());
		assertEquals(false, result.isCompensated());
		assertEquals(
				"CompensationDateSpan [id=null, start=null, end=null, compensated=false]",
				result.toString());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CompensationDateSpan(Long,Date,Date,boolean) constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testCompensationDateSpan_2() throws Exception {
		Long id = l1;
		Date start = d1;
		Date end = d2;
		boolean compensated = true;

		CompensationDateSpan result = new CompensationDateSpan(id, start, end,
				compensated);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isCompensated());
		assertEquals(
				"CompensationDateSpan [id=1, start=2010-12-06, end=2010-12-07, compensated=true]",
				result.toString());
		System.out.println(result.toString());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the CompensationDateSpan(Long,Date,Date,boolean) constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testCompensationDateSpan_3() throws Exception {
		Long id = new Long(1L);
		Date start = d1;
		Date end = d2;
		boolean compensated = true;

		CompensationDateSpan result = new CompensationDateSpan(id, start, end,
				compensated);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isCompensated());
		assertEquals(
				"CompensationDateSpan [id=1, start=Mon Dec 06 01:07:30 EET 2010, end=Mon Dec 06 01:07:30 EET 2010, compensated=true]",
				result.toString());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the Date getEnd() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testGetEnd_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);

		Date result = fixture.getEnd();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1291590450015L)),
				DateFormat.getInstance().format(result));
		assertEquals(1291590450015L, result.getTime());
	}

	/**
	 * Run the Long getId() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testGetId_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);

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
	 * Run the Date getStart() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testGetStart_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);

		Date result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1291590449989L)),
				DateFormat.getInstance().format(result));
		assertEquals(1291590449989L, result.getTime());
	}

	/**
	 * Run the boolean isCompensated() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testIsCompensated_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);

		boolean result = fixture.isCompensated();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCompensated() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testIsCompensated_2() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);

		boolean result = fixture.isCompensated();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setCompensated(boolean) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testSetCompensated_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);
		boolean value = true;

		fixture.setCompensated(value);

		// add additional test code here
	}

	/**
	 * Run the void setEnd(Date) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testSetEnd_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);
		Date value = new Date();

		fixture.setEnd(value);

		// add additional test code here
	}

	/**
	 * Run the void setId(Long) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testSetId_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);
		Long value = new Long(1L);

		fixture.setId(value);

		// add additional test code here
	}

	/**
	 * Run the void setStart(Date) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testSetStart_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);
		Date value = new Date();

		fixture.setStart(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test public void testToString_1() throws Exception {
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, true);

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"CompensationDateSpan [id=1, start=Mon Dec 06 01:07:29 EET 2010, end=Mon Dec 06 01:07:29 EET 2010, compensated=true]",
				result);
	}

	/**
	 * Perform pre-test initialization.
	 * 
	 * @throws Exception
	 *         if the initialization fails for some reason
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Before public void setUp() throws Exception {
		d1 = new Date(2010, 12, 6);
		d2 = new Date(2010, 12, 7);
		fixture = new CompensationDateSpan(l1, d1, d2, true);
	}
	CompensationDateSpan fixture;
	Long l1 = new Long(1L);
	Date d1, d2;
	/**
	 * Perform post-test clean-up.
	 * 
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
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
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CompensationDateSpanTest.class);
	}
}
