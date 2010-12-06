package entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ContactInfoTest</code> contains tests for the class
 * <code>{@link ContactInfo}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:06
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class ContactInfoTest {
	/**
	 * Run the ContactInfo() constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testContactInfo_1() throws Exception {
		ContactInfo result = new ContactInfo();

		// add additional test code here

		Assert.assertNotNull(result);
		Assert.assertEquals(
				"ContactInfo [id=null, emailAddresses=[], phoneNumbers=[]]",
				result.toString());
		Assert.assertEquals(null, result.getId());
		Assert.assertNotNull(result.getEmailAddresses());
		Assert.assertNotNull(result.getPhoneNumbers());
	}

	/**
	 * Run the ContactInfo(Long,List<String>,List<String>) constructor test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testContactInfo_2() throws Exception {
		Long id = new Long(1L);
		List<String> emailAddresses = new ArrayList<String>();
		List<String> phoneNumbers = new ArrayList<String>();

		ContactInfo result = new ContactInfo(id, emailAddresses, phoneNumbers);

		// add additional test code here
		assertNotNull(result);
		assertEquals("ContactInfo [id=1, emailAddresses=[], phoneNumbers=[]]",
				result.toString());
		assertEquals(new Long(1L), result.getId());
	}

	/**
	 * Run the List<String> getEmailAddresses() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetEmailAddresses_1() throws Exception {
		ContactInfo fixture = new ContactInfo(new Long(1L), (List<String>) null,
				new ArrayList<String>());

		List<String> result = fixture.getEmailAddresses();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getEmailAddresses() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetEmailAddresses_2() throws Exception {
		ContactInfo fixture = new ContactInfo(new Long(1L),
				new ArrayList<String>(), new ArrayList<String>());

		List<String> result = fixture.getEmailAddresses();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Long getId() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetId_1() throws Exception {
		ContactInfo fixture = new ContactInfo(new Long(1L),
				new ArrayList<String>(), new ArrayList<String>());

		Long result = fixture.getId();

		assertNotNull(result);
		assertEquals(1L, result.longValue());
	}

	/**
	 * Run the List<String> getPhoneNumbers() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetPhoneNumbers_1() throws Exception {
		ContactInfo fixture = new ContactInfo(new Long(1L),
				new ArrayList<String>(), (List<String>) null);

		List<String> result = fixture.getPhoneNumbers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getPhoneNumbers() method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testGetPhoneNumbers_2() throws Exception {
		ContactInfo fixture = new ContactInfo(new Long(1L),
				new ArrayList<String>(), new ArrayList<String>());

		List<String> result = fixture.getPhoneNumbers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setId(Long) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:06
	 */
	@Test public void testSetId_1() throws Exception {
		ContactInfo fixture = new ContactInfo(new Long(1L),
				new ArrayList<String>(), new ArrayList<String>());
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
		ContactInfo fixture = new ContactInfo(new Long(1L),
				new ArrayList<String>(), new ArrayList<String>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("ContactInfo [id=1, emailAddresses=[], phoneNumbers=[]]",
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
		new org.junit.runner.JUnitCore().run(ContactInfoTest.class);
	}
}
