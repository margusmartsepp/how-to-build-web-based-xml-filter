package entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Date;
import org.joda.time.DateTime;
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
	@Test(timeout = 3000) public void testCompensationDateSpan_1() throws Exception {

		CompensationDateSpan result = new CompensationDateSpan();

		assertNotNull(result);
		assertEquals(null, result.getStart());
		assertEquals(null, result.getEnd());
		assertEquals(false, result.isCompensated());
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

		assertNotNull(result);
		assertEquals(true, result.isCompensated());
		assertEquals(
				"CompensationDateSpan [id=1, start=2010-12-06, end=2010-12-07, compensated=true]",
				result.toString());
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

		assertNotNull(result);
		assertEquals(true, result.isCompensated());
		assertEquals(new Long(1L), result.getId());
	}
	@Test(expected = java.lang.IllegalArgumentException.class) public void testCompensationDateSpan_4() throws Exception {
		Long id = new Long(1L);
		Date start = d2;
		Date end = d1;
		boolean compensated = true;
		new CompensationDateSpan(id, start, end, compensated);
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

		assertNotNull(result);
		assertEquals(result, d2);
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

		assertNotNull(result);
		assertEquals(1L, result.longValue());
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

		assertNotNull(result);
		assertEquals(result, d1);
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
		CompensationDateSpan fixture = new CompensationDateSpan(l1, d1, d2, false);

		boolean result = fixture.isCompensated();

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
		boolean value = false;

		fixture.setCompensated(value);

		assertEquals(false, fixture.isCompensated());
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
		Date value = new DateTime(2010, 12, 8, 0, 0, 0, 0).toDate();

		fixture.setEnd(value);

		assertEquals(value, fixture.getEnd());
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

		assertEquals(value, fixture.getId());
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
		Date value = new DateTime(2010, 12, 8, 0, 0, 0, 0).toDate();

		fixture.setStart(value);

		assertEquals(value, fixture.getStart());
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
				"CompensationDateSpan [id=1, start=2010-12-06, end=2010-12-07, compensated=true]",
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

	}
	CompensationDateSpan fixture;
	static Date d1 = new DateTime(2010, 12, 6, 0, 0, 0, 0).toDate();
	static Date d2 = new DateTime(2010, 12, 7, 0, 0, 0, 0).toDate();
	static Long l1 = new Long(1L);
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
