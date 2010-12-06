package entity;

import java.text.DateFormat;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EmployeeTest</code> contains tests for the class <code>{@link Employee}</code>.
 *
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class EmployeeTest {
	/**
	 * Run the Employee() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testEmployee_1()
		throws Exception {

		Employee result = new Employee();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPerson());
		assertEquals(null, result.getModifiedDate());
		assertEquals("Employee [id=null, person=null, data=null, modifiedDate=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getData());
	}

	/**
	 * Run the Employee(Long,Person,Data,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testEmployee_2()
		throws Exception {
		Long id = new Long(1L);
		Person person = new Person();
		Data data = new Data();
		Date modifiedDate = new Date();

		Employee result = new Employee(id, person, data, modifiedDate);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Employee [id=1, person=Person [id=null, name=null, isMale=false, birthday=null, iCi=null], data=Data [id=null, creditCard=null, occupationTitle=null, departmentTitle=null, hireDate=null, hourRate=0.0, vacation=null, holiday=null, std=null, ltd=null], modifiedDate=Mon Dec 06 01:06:40 EET 2010]", result.toString());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the Data getData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetData_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());

		Data result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCreditCard());
		assertEquals(null, result.getOccupationTitle());
		assertEquals(null, result.getDepartmentTitle());
		assertEquals(null, result.getHireDate());
		assertEquals(0.0, result.getHourRate(), 1.0);
		assertEquals("Data [id=null, creditCard=null, occupationTitle=null, departmentTitle=null, hireDate=null, hourRate=0.0, vacation=[], holiday=[], std=[], ltd=[]]", result.toString());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the Long getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());

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
	 * Run the Date getModifiedDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetModifiedDate_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());

		Date result = fixture.getModifiedDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1291590400677L)), DateFormat.getInstance().format(result));
		assertEquals(1291590400677L, result.getTime());
	}

	/**
	 * Run the Person getPerson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetPerson_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());

		Person result = fixture.getPerson();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getICi());
		assertEquals(null, result.getBirthday());
		assertEquals(false, result.isIsMale());
		assertEquals("Person [id=null, name=null, isMale=false, birthday=null, iCi=null]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the void setData(Data) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());
		Data value = new Data();

		fixture.setData(value);

		// add additional test code here
	}

	/**
	 * Run the void setId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());
		Long value = new Long(1L);

		fixture.setId(value);

		// add additional test code here
	}

	/**
	 * Run the void setModifiedDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetModifiedDate_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());
		Date value = new Date();

		fixture.setModifiedDate(value);

		// add additional test code here
	}

	/**
	 * Run the void setPerson(Person) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetPerson_1()
		throws Exception {
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());
		Person value = new Person();

		fixture.setPerson(value);

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
		Employee fixture = new Employee(new Long(1L), new Person(), new Data(), new Date());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Employee [id=1, person=Person [id=null, name=null, isMale=false, birthday=null, iCi=null], data=Data [id=null, creditCard=null, occupationTitle=null, departmentTitle=null, hireDate=null, hourRate=0.0, vacation=null, holiday=null, std=null, ltd=null], modifiedDate=Mon Dec 06 01:06:40 EET 2010]", result);
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
		new org.junit.runner.JUnitCore().run(EmployeeTest.class);
	}
}