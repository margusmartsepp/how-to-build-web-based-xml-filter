package entity;

import java.text.DateFormat;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PersonTest</code> contains tests for the class <code>{@link Person}</code>.
 *
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class PersonTest {
	/**
	 * Run the Person() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testPerson_1()
		throws Exception {

		Person result = new Person();

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
	 * Run the Person(Long,boolean,String,Date,ContactInfo) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testPerson_2()
		throws Exception {
		Long id = new Long(1L);
		boolean isMale = true;
		String name = "";
		Date birthday = new Date();
		ContactInfo iCi = new ContactInfo();

		Person result = new Person(id, isMale, name, birthday, iCi);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isIsMale());
		assertEquals("Person [id=1, name=, isMale=true, birthday=Mon Dec 06 01:06:44 EET 2010, iCi=ContactInfo [id=null, emailAddresses=[], phoneNumbers=[]]]", result.toString());
		assertEquals("", result.getName());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the Date getBirthday() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetBirthday_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());

		Date result = fixture.getBirthday();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1291590405992L)), DateFormat.getInstance().format(result));
		assertEquals(1291590405992L, result.getTime());
	}

	/**
	 * Run the ContactInfo getICi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetICi_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());

		ContactInfo result = fixture.getICi();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ContactInfo [id=null, emailAddresses=[], phoneNumbers=[]]", result.toString());
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
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());

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
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isIsMale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testIsIsMale_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());

		boolean result = fixture.isIsMale();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIsMale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testIsIsMale_2()
		throws Exception {
		Person fixture = new Person(new Long(1L), false, "", new Date(), new ContactInfo());

		boolean result = fixture.isIsMale();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setBirthday(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetBirthday_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());
		Date value = new Date();

		fixture.setBirthday(value);

		// add additional test code here
	}

	/**
	 * Run the void setICi(ContactInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetICi_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());
		ContactInfo value = new ContactInfo();

		fixture.setICi(value);

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
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());
		Long value = new Long(1L);

		fixture.setId(value);

		// add additional test code here
	}

	/**
	 * Run the void setIsMale(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetIsMale_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());
		boolean value = true;

		fixture.setIsMale(value);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());
		String value = "";

		fixture.setName(value);

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
		Person fixture = new Person(new Long(1L), true, "", new Date(), new ContactInfo());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Person [id=1, name=, isMale=true, birthday=Mon Dec 06 01:06:44 EET 2010, iCi=ContactInfo [id=null, emailAddresses=[], phoneNumbers=[]]]", result);
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
		new org.junit.runner.JUnitCore().run(PersonTest.class);
	}
}