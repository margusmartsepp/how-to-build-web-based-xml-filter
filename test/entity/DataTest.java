package entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import entity.CompensationDateSpan;
import entity.Data;

/**
 * The class <code>DataTest</code> contains tests for the class
 * <code>{@link Data}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class DataTest {
	static Date d1 = new DateTime(2010, 12, 6, 0, 0, 0, 0).toDate();
	static Date d2 = new DateTime(2010, 12, 7, 0, 0, 0, 0).toDate();

	/**
	 * Run the Data() constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testData_1() throws Exception {

		Data result = new Data();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCreditCard());
		assertEquals(null, result.getOccupationTitle());
		assertEquals(null, result.getDepartmentTitle());
		assertEquals(null, result.getHireDate());
		assertEquals(0.0, result.getHourRate(), 1.0);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the
	 * Data(Long,String,String,String,Date,double,List<CompensationDateSpan
	 * >,List<CompensationDateSpan
	 * >,List<CompensationDateSpan>,List<CompensationDateSpan>) constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testData_2() throws Exception {
		Long id = new Long(1L);
		String creditCard = "";
		String occupationTitle = "";
		String departmentTitle = "";
		Date hireDate = d1;
		double hourRate = 1.0;
		List<CompensationDateSpan> vacation = new ArrayList<CompensationDateSpan>();
		List<CompensationDateSpan> holiday = new ArrayList<CompensationDateSpan>();
		List<CompensationDateSpan> std = new ArrayList<CompensationDateSpan>();
		List<CompensationDateSpan> ltd = new ArrayList<CompensationDateSpan>();

		Data result = new Data(id, creditCard, occupationTitle, departmentTitle,
				hireDate, hourRate, vacation, holiday, std, ltd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getCreditCard());
		assertEquals("", result.getOccupationTitle());
		assertEquals("", result.getDepartmentTitle());
		assertEquals(1.0, result.getHourRate(), 1.0);
		assertEquals(
				"Data [id=1, creditCard=, occupationTitle=, departmentTitle=, hireDate=2010-12-06, hourRate=1.0, vacation=[], holiday=[], std=[], ltd=[]]",
				result.toString());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the String getCreditCard() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetCreditCard_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		String result = fixture.getCreditCard();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDepartmentTitle() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetDepartmentTitle_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		String result = fixture.getDepartmentTitle();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Date getHireDate() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetHireDate_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", d1, 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		Date result = fixture.getHireDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(d1, result);
	}

	/**
	 * Run the List<CompensationDateSpan> getHoliday() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetHoliday_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				(List<CompensationDateSpan>) null,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		List<CompensationDateSpan> result = fixture.getHoliday();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<CompensationDateSpan> getHoliday() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetHoliday_2() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		List<CompensationDateSpan> result = fixture.getHoliday();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the double getHourRate() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetHourRate_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		double result = fixture.getHourRate();

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
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

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
	 * Run the List<CompensationDateSpan> getLtd() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetLtd_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				(List<CompensationDateSpan>) null);

		List<CompensationDateSpan> result = fixture.getLtd();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<CompensationDateSpan> getLtd() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetLtd_2() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		List<CompensationDateSpan> result = fixture.getLtd();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getOccupationTitle() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetOccupationTitle_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		String result = fixture.getOccupationTitle();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<CompensationDateSpan> getStd() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetStd_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				(List<CompensationDateSpan>) null,
				new ArrayList<CompensationDateSpan>());

		List<CompensationDateSpan> result = fixture.getStd();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<CompensationDateSpan> getStd() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetStd_2() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		List<CompensationDateSpan> result = fixture.getStd();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<CompensationDateSpan> getVacation() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetVacation_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				(List<CompensationDateSpan>) null,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		List<CompensationDateSpan> result = fixture.getVacation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<CompensationDateSpan> getVacation() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetVacation_2() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		List<CompensationDateSpan> result = fixture.getVacation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setCreditCard(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetCreditCard_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());
		String value = "";

		fixture.setCreditCard(value);

		// add additional test code here
	}

	/**
	 * Run the void setDepartmentTitle(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetDepartmentTitle_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());
		String value = "";

		fixture.setDepartmentTitle(value);

		// add additional test code here
	}

	/**
	 * Run the void setHireDate(Date) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetHireDate_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());
		Date value = new Date();

		fixture.setHireDate(value);

		// add additional test code here
	}

	/**
	 * Run the void setHourRate(double) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetHourRate_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());
		double value = 1.0;

		fixture.setHourRate(value);

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
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());
		Long value = new Long(1L);

		fixture.setId(value);

		// add additional test code here
	}

	/**
	 * Run the void setOccupationTitle(String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetOccupationTitle_1() throws Exception {
		Data fixture = new Data(new Long(1L), "", "", "", new Date(), 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());
		String value = "";

		fixture.setOccupationTitle(value);

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
		Data fixture = new Data(new Long(1L), "", "", "", d1, 1.0,
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>(),
				new ArrayList<CompensationDateSpan>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"Data [id=1, creditCard=, occupationTitle=, departmentTitle=, hireDate=2010-12-06, hourRate=1.0, vacation=[], holiday=[], std=[], ltd=[]]",
				result);
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
		new org.junit.runner.JUnitCore().run(DataTest.class);
	}
}
