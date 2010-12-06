package entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Date;
import javax.xml.bind.JAXBElement;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ObjectFactoryTest</code> contains tests for the class
 * <code>{@link ObjectFactory}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class ObjectFactoryTest {
	/**
	 * Run the ObjectFactory() constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testObjectFactory_1() throws Exception {

		ObjectFactory result = new ObjectFactory();

		// add additional test code here
		assertNotNull(result);
	}
	static Date d1 = new DateTime(2010, 12, 6, 0, 0, 0, 0).toDate();
	static Date d2 = new DateTime(2010, 12, 7, 0, 0, 0, 0).toDate();

	/**
	 * Run the CompensationDateSpan createCompensationDateSpan() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateCompensationDateSpan_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		CompensationDateSpan result = fixture.createCompensationDateSpan();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStart());
		assertEquals(null, result.getEnd());
		assertEquals(false, result.isCompensated());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the JAXBElement<CompensationDateSpan>
	 * createCompensationDateSpan(CompensationDateSpan) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateCompensationDateSpan_2() throws Exception {
		ObjectFactory fixture = new ObjectFactory();
		CompensationDateSpan value = new CompensationDateSpan();

		JAXBElement<CompensationDateSpan> result = fixture.createCompensationDateSpan(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isNil());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the ContactInfo createContactInfo() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateContactInfo_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		ContactInfo result = fixture.createContactInfo();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the Data createData() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateData_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		Data result = fixture.createData();

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
	 * Run the JAXBElement<Data> createData(Data) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateData_2() throws Exception {
		ObjectFactory fixture = new ObjectFactory();
		Data value = new Data();

		JAXBElement<Data> result = fixture.createData(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isNil());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the Employee createEmployee() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateEmployee_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		Employee result = fixture.createEmployee();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPerson());
		assertEquals(null, result.getModifiedDate());
		assertEquals(null, result.getId());
		assertEquals(null, result.getData());
	}

	/**
	 * Run the JAXBElement<Employee> createEmployee(Employee) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateEmployee_2() throws Exception {
		ObjectFactory fixture = new ObjectFactory();
		Employee value = new Employee();

		JAXBElement<Employee> result = fixture.createEmployee(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isNil());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the HumanResources createHumanResources() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateHumanResources_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		HumanResources result = fixture.createHumanResources();

		// add additional test code here
		assertNotNull(result);
		assertEquals("HumanResources [employee=[]]", result.toString());
	}

	/**
	 * Run the JAXBElement<HumanResources> createHumanResources(HumanResources)
	 * method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateHumanResources_2() throws Exception {
		ObjectFactory fixture = new ObjectFactory();
		HumanResources value = new HumanResources();

		JAXBElement<HumanResources> result = fixture.createHumanResources(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isNil());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the MapTypeEntry createMapTypeEntry() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateMapTypeEntry_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		MapTypeEntry result = fixture.createMapTypeEntry();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals(null, result.getKey());
	}

	/**
	 * Run the Person createPerson() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreatePerson_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		Person result = fixture.createPerson();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getICi());
		assertEquals(null, result.getBirthday());
		assertEquals(false, result.isIsMale());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the JAXBElement<Person> createPerson(Person) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreatePerson_2() throws Exception {
		ObjectFactory fixture = new ObjectFactory();
		Person value = new Person();

		JAXBElement<Person> result = fixture.createPerson(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isNil());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the Report createRaport() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateRaport_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		Report result = fixture.createRaport();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getGrandTotal(), 1.0);
		assertEquals(null, result.getId());
	}

	/**
	 * Run the JAXBElement<Report> createRaport(Report) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateRaport_2() throws Exception {
		ObjectFactory fixture = new ObjectFactory();
		Report value = new Report();

		JAXBElement<Report> result = fixture.createRaport(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isGlobalScope());
		assertEquals(false, result.isNil());
		assertEquals(false, result.isTypeSubstituted());
	}

	/**
	 * Run the StringToDoubleMapAdapter createStringToDoubleMapAdapter() method
	 * test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testCreateStringToDoubleMapAdapter_1() throws Exception {
		ObjectFactory fixture = new ObjectFactory();

		StringToDoubleMapAdapter result = fixture.createStringToDoubleMapAdapter();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(ObjectFactoryTest.class);
	}
}
