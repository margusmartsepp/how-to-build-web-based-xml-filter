package entity;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.vercer.engine.persist.annotation.Key;
import entity.Employee.Data.Person;

@XmlRootElement public class Employee {
	private static final long serialVersionUID = 1L;
	@XmlAttribute @Key protected Long id;
	@XmlElement(required = true) protected Person person;
	@XmlElement(required = true) protected Data data;
	@XmlElement(required = true) protected Date modifiedDate;

	@XmlRootElement public static class Data {
		private static final long serialVersionUID = 1L;
		@XmlAttribute @Key protected Long id;
		@XmlElement(required = true) protected String creditCard;
		@XmlElement(required = true) protected String occupationTitle;
		@XmlElement(required = true) protected String departmentTitle;
		@XmlElement(required = true) protected Date hireDate;
		@XmlElement(required = true) protected Double hourRate;
		@XmlElement(required = false) protected List<CompensationDateSpan> vacation;
		@XmlElement(required = false) protected List<CompensationDateSpan> holiday;
		@XmlElement(required = false) protected List<CompensationDateSpan> std;
		@XmlElement(required = false) protected List<CompensationDateSpan> ltd;

		@XmlRootElement public static class CompensationDateSpan {
			private static final long serialVersionUID = 1L;
			@XmlAttribute @Key protected Long id;
			@XmlElement(required = true) protected Date start;
			@XmlElement(required = true) protected Date end;
			@XmlElement(required = true) protected Boolean compensated;
		}

		@XmlRootElement public static class Person {
			private static final long serialVersionUID = 1L;
			@XmlAttribute @Key protected Long id;
			@XmlElement(required = true) protected Boolean isMale;
			@XmlElement(required = true) protected String name;
			@XmlElement(required = true) protected Date birthday;
			@XmlElement(required = false) protected ContactInfo iCi;

			@XmlRootElement public static class ContactInfo {
				private static final long serialVersionUID = 1L;
				@XmlAttribute @Key protected Long id;
				@XmlElement(required = false) protected List<String> emailAddresses;
				@XmlElement(required = false) protected List<String> phoneNumbers;
			}
		}
	}
}
