import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;
import junit.framework.Assert;
import org.joda.time.DateTime;
import entity.CompensationDateSpan;
import entity.ContactInfo;
import entity.Data;
import entity.Employee;
import entity.Person;
import entity.adhoc.JAXB;

public class manual {
	public static void main(String[] args) throws Exception {

		Date d1 = new DateTime(2010, 12, 6, 0, 0, 0, 0).toDate();
		Date d2 = new DateTime(2010, 12, 7, 0, 0, 0, 0).toDate();

		CompensationDateSpan cd = new CompensationDateSpan();
		ContactInfo ci = new ContactInfo();
		Data d = new Data();
		Person p = new Person();
		Employee em = new Employee();

		System.out.println("default");
		StringWriter sw;
		sw = new StringWriter();

		JAXB.write(d, sw);
		Assert.assertNotNull(sw);
		Assert.assertNotSame("", sw);

		sw = new StringWriter();
		JAXB.write(p, sw);
		Assert.assertNotNull(sw);
		Assert.assertNotSame("", sw);

		sw = new StringWriter();
		JAXB.write(cd, System.out);
		Assert.assertNotNull(cd);
		Assert.assertNotSame("", cd);

		sw = new StringWriter();
		JAXB.write(ci, System.out);
		Assert.assertNotNull(ci);
		Assert.assertNotSame("", ci);

		ci.setId(1L);
		ci.getEmailAddresses().add("some@where.com");
		ci.getPhoneNumbers().add("46326234623");

		cd.setId(1L);
		cd.setCompensated(false);
		cd.setStart(d1);
		cd.setEnd(d2);

		p.setId(1L);
		p.setBirthday(d1);
		p.setICi(ci);
		p.setIsMale(true);
		p.setName("Manual testing sucks");

		d.setId(1L);
		d.setCreditCard("23623623623");
		d.setDepartmentTitle("326346234623");
		d.setHireDate(d2);
		d.setHourRate(234.4);
		d.setOccupationTitle("sleeping beauty");
		d.getVacation().add(cd);
		d.getHoliday().add(cd);
		d.getStd().add(cd);
		d.getLtd().add(cd);

		em.setId(1L);
		em.setData(d);
		em.setPerson(p);
		em.setModifiedDate(d2);

		// System.out.println("values");
		// JAXB.write(em, System.out);
		/*
		 * <?xml version="1.0" encoding="UTF-8" standalone="yes"?> <employee id="1">
		 * <person id="1"> <name>Manual testing sucks</name> <isMale>true</isMale>
		 * <birthday>2010-12-06T00:00:00+02:00</birthday> <iCi id="1">
		 * <emailAddresses>some@where.com</emailAddresses>
		 * <phoneNumbers>46326234623</phoneNumbers> </iCi> </person> <data id="1">
		 * <creditCard>23623623623</creditCard> <occupationTitle>sleeping
		 * beauty</occupationTitle> <departmentTitle>326346234623</departmentTitle>
		 * <hireDate>2010-12-07T00:00:00+02:00</hireDate> <hourRate>234.4</hourRate>
		 * <vacation id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </vacation> <holiday id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </holiday> <std id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </std> <ltd id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </ltd> </data> <modifiedDate>2010-12-07T00:00:00+02:00</modifiedDate>
		 * </employee>
		 */
		System.out.println(em);
		StringWriter sw1 = new StringWriter();
		StringWriter sw2 = new StringWriter();
		JAXB.write(em, sw1);
		StringReader sr = new StringReader(sw1.toString());
		em = JAXB.read(Employee.class, sr);
		JAXB.write(em, sw2);
		/*
		 * <?xml version="1.0" encoding="UTF-8" standalone="yes"?> <employee id="1">
		 * <person id="1"> <name>Manual testing sucks</name> <isMale>true</isMale>
		 * <birthday>2010-12-06T00:00:00+02:00</birthday> <iCi id="1">
		 * <emailAddresses>some@where.com</emailAddresses>
		 * <phoneNumbers>46326234623</phoneNumbers> </iCi> </person> <data id="1">
		 * <creditCard>23623623623</creditCard> <occupationTitle>sleeping
		 * beauty</occupationTitle> <departmentTitle>326346234623</departmentTitle>
		 * <hireDate>2010-12-07T00:00:00+02:00</hireDate> <hourRate>234.4</hourRate>
		 * <vacation id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </vacation> <holiday id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </holiday> <std id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </std> <ltd id="1"> <start>2010-12-06T00:00:00+02:00</start>
		 * <end>2010-12-07T00:00:00+02:00</end> <compensated>false</compensated>
		 * </ltd> </data> <modifiedDate>2010-12-07T00:00:00+02:00</modifiedDate>
		 * </employee>
		 */
		if (!sw1.toString().equals(sw2.toString())) { throw new Exception(
				"Data has changed"); }
		System.out.println("ok");

	}
}
