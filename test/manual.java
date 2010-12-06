import junit.framework.Assert;
import entity.ContactInfo;

public class manual {
	public static void main(String[] args) {
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
}
