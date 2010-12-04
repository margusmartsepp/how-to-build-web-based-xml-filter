package entity;

import static com.google.common.base.Preconditions.checkNotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.vercer.engine.persist.annotation.Key;
import entity.Employee.Data.CompensationDateSpan;

/**
 * <img style="float:right;  height=12em;" src="doc-files/kitten.gif">
 * <p>
 * Java class for employee complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person" type="{}person"/>
 *         &lt;element name="data" type="{}data"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @see entity.adhoc.JAXB
 * @see entity.adhoc.PXML
 * @see HumanResources
 * @author Margus Martsepp
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "employee", propOrder = {
		"person", "data", "modifiedDate" }) @XmlRootElement public class Employee
		implements Serializable, Comparable<Employee> {

	/**
	 * <img style="float:right; height=12em;" src="doc-files/shoot.gif">
	 * <p>
	 * This class contains bare minimum recordset of what big-company's might
	 * store about their employee: credit card information(where to pay wage),
	 * work department(who is responsible) and occupation(skills used), hire
	 * date(to determine wage, benefits and experts), hourRate(precalculated wage
	 * per hour).
	 * <p>
	 * Also all holiday/vacation/disability days are stored. Based on company's
	 * employee benefits policy they are used to determine wage at any given time.
	 * Depending on nation and company size some benefits are obligatory.
	 * <p>
	 * For more about policies, check <a
	 * href=http://humanresources.about.com/od/policysamples
	 * /a/policy_samples.htm>this</a> out.
	 * <p>
	 * Java class for data complex type.
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType name="data">
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="creditCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="occupationTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="departmentTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="hourRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
	 *         &lt;element name="vacation" type="{}compensationDateSpan" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="holiday" type="{}compensationDateSpan" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="std" type="{}compensationDateSpan" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="ltd" type="{}compensationDateSpan" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * @author Margus Martsepp
	 */
	@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "data", propOrder = {
			"creditCard", "occupationTitle", "departmentTitle", "hireDate",
			"hourRate", "vacation", "holiday", "std", "ltd" }) @XmlRootElement//
	public static class Data implements Serializable {

		/**
		 * <p>
		 * Java class for compensationDateSpan complex type.
		 * <p>
		 * The following schema fragment specifies the expected content contained
		 * within this class.
		 * 
		 * <pre>
		 * &lt;complexType name="compensationDateSpan">
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
		 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
		 *         &lt;element name="compensated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
		 *       &lt;/sequence>
		 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * @see entity.Data
		 * @author Margus Martsepp
		 */
		@XmlAccessorType(XmlAccessType.FIELD)//
		@XmlType(name = "compensationDateSpan", propOrder = { "start", "end",
				"compensated" }) @XmlRootElement public static class CompensationDateSpan
				implements Serializable {
			/**
			 * <img style="float:right; height=150px" src="doc-files/runtrouble.gif">
			 * <p>
			 * This is stable compatibility validator. This is used among other things
			 * to determine if a deserialized file is compatible with this class.
			 * <p>
			 * For more information about why this class is useful, check <a href=
			 * "http://mindprod.com/jgloss/serialization.html#SERIALVERSIONUID"
			 * >this</a> out.
			 * <p>
			 * "The Art Of Unix Programming" - Eric Raymond<br>
			 * 17. Rule of Extensibility: Design for the future, because it will be
			 * here sooner than you think.
			 */
			private static final long serialVersionUID = 1L;

			/** The compensated. */
			@XmlElement(required = true) protected Boolean compensated;
			/**
			 * Value of the id property.
			 */
			@XmlAttribute @Key protected Long id;
			/**
			 * Value of the start property.
			 */
			@XmlElement(required = true) protected Date start;
			/**
			 * Value of the end property.
			 */
			@XmlElement(required = true) protected Date end;

			/**
			 * <img style="float:right; height=150px;" src="doc-files/win.gif">
			 * <p>
			 * This private constructor ( don't change the visibility! ) is used by
			 * 
			 * @throws IllegalAccessException
			 *         the illegal access exception {@link JAXB} as part of
			 *         <u>constructor injection pattern</u> from dependency injection
			 *         pattern.
			 *         <p>
			 *         Not intended for manual use, and should not be visible to call
			 *         manually. Manual call will result in error, that will crash the
			 *         program.
			 *         <p>
			 *         And yes, contents of this method gives default values to final
			 *         fields. For more information about this design pattern, check
			 *         <a
			 *         href=http://en.wikipedia.org/wiki/Dependency_injection>this</a>
			 *         out.
			 */
			@SuppressWarnings("unused") private CompensationDateSpan()
					throws IllegalAccessException {
				super();
			}

			/**
			 * Instantiates a new compensation date span.
			 * 
			 * @param start
			 *        the start
			 * @param end
			 *        the end
			 * @param compensated
			 *        the compensated
			 */
			public CompensationDateSpan(final Date start, final Date end,
					final Boolean compensated) {
				super();
				if (!checkNotNull(start).before(checkNotNull(end))) { throw new IllegalArgumentException(
						"Vacation duration must exist."); }
				this.start = start;
				this.end = end;
				this.compensated = checkNotNull(compensated);
			}

			/**
			 * Gets the value of the compensated property.
			 * 
			 * @return the compensated
			 */
			public Boolean getCompensated() {
				return compensated;
			}

			/**
			 * Gets the value of the end property.
			 * 
			 * @return possible object is {@link Date }
			 */
			public Date getEnd() {
				return end;
			}

			/**
			 * Gets the value of the id property.
			 * 
			 * @return possible object is {@link Long }
			 */
			public Long getId() {
				return id;
			}

			/**
			 * Gets the value of the start property.
			 * 
			 * @return possible object is {@link Date }
			 */
			public Date getStart() {
				return start;
			}

			/*
			 * (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override public String toString() {
				return "CompenstionDateSpan [start=" + start + ", end=" + end + ", compensated=" + compensated + "]";
			}
		}
		/**
		 * <img style="float:right; height=150px" src="doc-files/runtrouble.gif">
		 * <p>
		 * This is stable compatibility validator. This is used among other things
		 * to determine if a deserialized file is compatible with this class.
		 * <p>
		 * For more information about why this class is useful, check <a href=
		 * "http://mindprod.com/jgloss/serialization.html#SERIALVERSIONUID"
		 * >this</a> out.
		 * <p>
		 * "The Art Of Unix Programming" - Eric Raymond<br>
		 * 17. Rule of Extensibility: Design for the future, because it will be here
		 * sooner than you think.
		 */
		private static final long serialVersionUID = 2L;
		/** Value of the creditCard property. */
		@XmlElement(required = true) protected String creditCard;
		/** Value of the occupationTitle property. */
		@XmlElement(required = true) protected String occupationTitle;
		/** Value of the departmentTitle property. */
		@XmlElement(required = true) protected String departmentTitle;
		/** Value of the hireDate property. */
		@XmlElement(required = true) protected Date hireDate;
		/** Value of the hourRate property. */
		@XmlElement(required = true) protected Double hourRate;
		/**
		 * Used and planned vacations. Vacation days are assigned based on company's
		 * employee benefits policy. For example - based on their employment time:
		 * <ul>
		 * <li>1st year: 15 days
		 * <li>4th year: 20 days
		 * <li>6th year: 25 days
		 */
		@XmlElement(required = false) protected List<CompensationDateSpan> //
		vacation;
		/**
		 * Used Holidays or sick days. Holidays are assigned based on company's
		 * employee benefits policy. For example 12 days in year.
		 */
		@XmlElement(required = false) protected List<CompensationDateSpan> //
		holiday;
		/**
		 * Used (STD) Short Term Disability days.
		 */
		@XmlElement(required = false) protected List<CompensationDateSpan> //
		std;
		/**
		 * Used (LTD) Long Term Disability days.
		 */
		@XmlElement(required = false) protected List<CompensationDateSpan> //
		ltd;

		/**
		 * Gets the value of the creditCard property.
		 * 
		 * @return possible object is {@link String }
		 */
		public String getCreditCard() {
			return creditCard;
		}

		/**
		 * Gets the value of the occupationTitle property.
		 * 
		 * @return possible object is {@link String }
		 */
		public String getOccupationTitle() {
			return occupationTitle;
		}

		/**
		 * Gets the value of the departmentTitle property.
		 * 
		 * @return possible object is {@link String }
		 */
		public String getDepartmentTitle() {
			return departmentTitle;
		}

		/**
		 * Gets the value of the hireDate property.
		 * 
		 * @return possible object is {@link Date }
		 */
		public Date getHireDate() {
			return hireDate;
		}

		/**
		 * Gets the value of the hourRate property.
		 * 
		 * @return the hour rate
		 */
		public Double getHourRate() {
			return hourRate;
		}

		/**
		 * Gets the value of the vacation property.
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list will
		 * be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the vacation property.
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getVacation().add(newItem);
		 * </pre>
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * 
		 * @return the vacation {@link CompensationDateSpan }
		 */
		public List<CompensationDateSpan> getVacation() {
			if (vacation == null)
				vacation = new ArrayList<Employee.Data.CompensationDateSpan>();

			return vacation;
		}

		/**
		 * Gets the value of the holiday property.
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list will
		 * be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the holiday property.
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getHoliday().add(newItem);
		 * </pre>
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * 
		 * @return the holiday {@link CompensationDateSpan }
		 */
		public List<CompensationDateSpan> getHoliday() {
			if (holiday == null)
				holiday = new ArrayList<Employee.Data.CompensationDateSpan>();
			return holiday;
		}

		/**
		 * Gets the value of the std property.
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list will
		 * be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the std property.
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getStd().add(newItem);
		 * </pre>
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * 
		 * @return the std {@link CompensationDateSpan }
		 */
		public List<CompensationDateSpan> getStd() {
			if (std == null)
				std = new ArrayList<Employee.Data.CompensationDateSpan>();
			return std;
		}

		/**
		 * Gets the value of the ltd property.
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list will
		 * be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the ltd property.
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getLtd().add(newItem);
		 * </pre>
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * 
		 * @return the ltd {@link CompensationDateSpan }
		 */
		public List<CompensationDateSpan> getLtd() {
			if (ltd == null)
				ltd = new ArrayList<Employee.Data.CompensationDateSpan>();
			return ltd;
		}

		/*
		 * (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Data [creditCard=").append(creditCard).append(
					", occupationTitle=").append(occupationTitle).append(
					", departmentTitle=").append(departmentTitle).append(", hireDate=").append(
					hireDate).append(", hourRate=").append(hourRate).append(", vacation=").append(
					vacation).append(", holiday=").append(holiday).append(", std=").append(
					std).append(", ltd=").append(ltd).append("]");
			return builder.toString();
		}

		/**
		 * Instantiates a new data.
		 * 
		 * @param creditCard
		 *        the credit card
		 * @param occupationTitle
		 *        the occupation title
		 * @param departmentTitle
		 *        the department title
		 * @param hireDate
		 *        the hire date
		 * @param hourRate
		 *        the hour rate
		 * @param vacation
		 *        the vacation
		 * @param holiday
		 *        the holiday
		 * @param std
		 *        the std
		 * @param ltd
		 *        the ltd
		 */
		public Data(String creditCard, String occupationTitle,
				String departmentTitle, Date hireDate, Double hourRate,
				List<CompensationDateSpan> vacation,
				List<CompensationDateSpan> holiday, List<CompensationDateSpan> std,
				List<CompensationDateSpan> ltd) {
			super();
			this.creditCard = checkNotNull(creditCard);
			this.occupationTitle = checkNotNull(occupationTitle);
			this.departmentTitle = checkNotNull(departmentTitle);
			this.hireDate = checkNotNull(hireDate);
			this.hourRate = checkNotNull(hourRate);
			this.vacation = Collections.synchronizedList(checkNotNull(vacation));
			this.holiday = Collections.synchronizedList(checkNotNull(holiday));
			this.std = Collections.synchronizedList(checkNotNull(std));
			this.ltd = Collections.synchronizedList(checkNotNull(ltd));
		}

		/**
		 * Instantiates a new data.
		 * 
		 * @param creditCard
		 *        the credit card
		 * @param occupationTitle
		 *        the occupation title
		 * @param departmentTitle
		 *        the department title
		 * @param hireDate
		 *        the hire date
		 * @param hourRate
		 *        the hour rate
		 * @param compensationDateSpan
		 *        the compensation date span
		 */
		public Data(String creditCard, String occupationTitle,
				String departmentTitle, Date hireDate, Double hourRate,
				CompensationDateSpan compensationDateSpan) {
			this.creditCard = checkNotNull(creditCard);
			this.occupationTitle = checkNotNull(occupationTitle);
			this.departmentTitle = checkNotNull(departmentTitle);
			this.hireDate = checkNotNull(hireDate);
			this.hourRate = checkNotNull(hourRate);
			this.vacation = Lists.newArrayList(compensationDateSpan);

		}

		/**
		 * <img style="float:right; height=150px;" src="doc-files/win.gif">
		 * <p>
		 * This private constructor ( don't change the visibility! ) is used by
		 * {@link JAXB} as part of <u>constructor injection pattern</u> from
		 * dependency injection pattern.
		 * <p>
		 * Not intended for manual use, and should not be visible to call manually.
		 * Manual call will result in error, that will crash the program.
		 * <p>
		 * And yes, contents of this method gives default values to final fields.
		 * For more information about this design pattern, check <a
		 * href=http://en.wikipedia.org/wiki/Dependency_injection>this</a> out.
		 */
		public Data() {
			super();
		}

		/**
		 * Instantiates a new data.
		 * 
		 * @param creditCard
		 *        the credit card
		 * @param occupationTitle
		 *        the occupation title
		 * @param departmentTitle
		 *        the department title
		 * @param hireDate
		 *        the hire date
		 * @param hourRate
		 *        the hour rate
		 */
		public Data(String creditCard, String occupationTitle,
				String departmentTitle, Date hireDate, Double hourRate) {
			this.creditCard = checkNotNull(creditCard);
			this.occupationTitle = checkNotNull(occupationTitle);
			this.departmentTitle = checkNotNull(departmentTitle);
			this.hireDate = checkNotNull(hireDate);
			checkNotNull(hireDate);
			this.hourRate = checkNotNull(hourRate);
		}

	}

	/**
	 * <img src="doc-files/kiss.png">
	 * <p>
	 * Java class for person complex type.
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType name="person">
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
	 *         &lt;element name="iCi" type="{}contactInfo" minOccurs="0"/>
	 *         &lt;element name="isMale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * <p>
	 * About name: <blockquote> All of these assumptions are wrong:
	 * <ol>
	 * <li>People have exactly one canonical full&nbsp;name.</li>
	 * <li>People have exactly one full name which they go&nbsp;by.</li>
	 * <li>People have, at this point in time, exactly one canonical
	 * full&nbsp;name.</li>
	 * <li>People have, at this point in time, one full name which they
	 * go&nbsp;by.</li>
	 * <li>People have exactly N names, for any value of&nbsp;N.</li>
	 * <li>People’s names fit within a certain defined amount of&nbsp;space.</li>
	 * <li>People’s names do not&nbsp;change.</li>
	 * <li>People’s names change, but only at a certain enumerated set
	 * of&nbsp;events.</li>
	 * <li>People’s names are written in&nbsp;ASCII.</li>
	 * <li>People’s names are written in any single character&nbsp;set.</li>
	 * <li>People’s names are all mapped in Unicode code&nbsp;points.</li>
	 * <li>People’s names are case&nbsp;sensitive.</li>
	 * <li>People’s names are case&nbsp;insensitive.</li>
	 * <li>People’s names sometimes have prefixes or suffixes, but you can
	 * safely ignore&nbsp;those.</li>
	 * <li>People’s names do not contain&nbsp;numbers.</li>
	 * <li>People’s names are not written in ALL&nbsp;CAPS.</li>
	 * <li>People’s names are not written in all lower case&nbsp;letters.</li>
	 * <li>People’s names have an order to them.&nbsp; Picking any ordering
	 * scheme will automatically result in consistent ordering among all systems,
	 * as long as both use the same ordering scheme for the same&nbsp;name.</li>
	 * <li>People’s first names and last names are, by
	 * necessity,&nbsp;different.</li>
	 * <li>People have last names, family names, or anything else which is shared
	 * by folks recognized as their&nbsp;relatives.</li>
	 * <li>People’s names are globally&nbsp;unique.</li>
	 * <li>People’s names are <em>almost</em> globally&nbsp;unique.</li>
	 * <li>Alright alright but surely people’s names are diverse enough such
	 * that no million people share the same&nbsp;name.</li>
	 * <li>My system will never have to deal with names from&nbsp;China.</li>
	 * <li>Or&nbsp;Japan.</li>
	 * <li>Or&nbsp;Korea.</li>
	 * <li>Or Ireland, the United Kingdom, the United States, Spain, Mexico,
	 * Brazil, Peru, Russia, Sweden, Botswana, South Africa, Trinidad, Haiti,
	 * France, or the Klingon Empire, all of which have weird naming schemes in
	 * common&nbsp;use.</li>
	 * <li>That Klingon Empire thing was a joke,&nbsp;right?</li>
	 * <li>Confound your cultural relativism!&nbsp; People<strong>
	 * <em>in my society</em></strong>, at least, agree on one commonly accepted
	 * standard for&nbsp;names.</li>
	 * <li>There exists an&nbsp;algorithm which transforms names and can be
	 * reversed losslessly. &nbsp;(Yes, yes, you can do it if your algorithm
	 * returns the input. &nbsp;You get a gold&nbsp;star.)</li>
	 * <li>I can safely assume that this dictionary of bad words contains no
	 * people’s names in&nbsp;it.</li>
	 * <li>People’s names are assigned at&nbsp;birth.</li>
	 * <li>OK, maybe not at birth, but at least pretty close to&nbsp;birth.</li>
	 * <li>Alright, alright, within a year or so of&nbsp;birth.</li>
	 * <li>Five&nbsp;years?</li>
	 * <li>You’re kidding me,&nbsp;right?</li>
	 * <li>Two different systems containing data about the same person will use
	 * the same name for that&nbsp;person.</li>
	 * <li>Two different data entry operators, given a person’s name, will by
	 * necessity enter bitwise equivalent strings on any single system, if the
	 * system is&nbsp;well-designed.</li>
	 * <li>People whose names break my system are weird outliers.&nbsp; They
	 * should have had solid, acceptable names, like {}.</li>
	 * <li>People have&nbsp;names.</li>
	 * </ol>
	 * </blockquote> <strong>Source<strong>: <a
	 * href=http://www.kalzumeus.com/2010/06
	 * /17/falsehoods-programmers-believe-about-names/>link</a>
	 * 
	 * @see entity.Employee
	 * @see
	 * @author Margus Martsepp
	 */
	@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "person", propOrder = {
			"name", "isMale", "birthday", "iCi" }) @XmlRootElement public static class Person
			implements Serializable, Comparable<Person> {

		/**
		 * <p>
		 * Java class for contactInfo complex type.
		 * <p>
		 * The following schema fragment specifies the expected content contained
		 * within this class.
		 * 
		 * <pre>
		 * &lt;complexType name="contactInfo">
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="emailAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
		 *         &lt;element name="phoneNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
		 *       &lt;/sequence>
		 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * @author Margus Martsepp
		 */
		@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "contactInfo",
				propOrder = { "emailAddresses", "phoneNumbers" }) public static class ContactInfo
				implements Serializable {
			/**
			 * <img style="float:right; height=150px" src="doc-files/runtrouble.gif">
			 * <p>
			 * This is stable compatibility validator. This is used among other things
			 * to determine if a deserialized file is compatible with this class.
			 * <p>
			 * For more information about why this class is useful, check <a href=
			 * "http://mindprod.com/jgloss/serialization.html#SERIALVERSIONUID"
			 * >this</a> out.
			 * <p>
			 * "The Art Of Unix Programming" - Eric Raymond<br>
			 * 17. Rule of Extensibility: Design for the future, because it will be
			 * here sooner than you think.
			 */
			private static final long serialVersionUID = 2L;
			/**
			 * Value of the id property.
			 */
			@XmlAttribute @Key protected Long id;
			/**
			 * Value of the emailAddresses property.
			 */
			@XmlElement(required = false) protected List<String> emailAddresses;
			/**
			 * Value of the phoneNumbers property.
			 */
			@XmlElement(required = false) protected List<String> phoneNumbers;

			/**
			 * <img style="float:right;  height=150px" src="doc-files/win.gif">
			 * <p>
			 * This private constructor ( don't change the visibility! ) is used by
			 * {@link JAXB} as part of <u>constructor injection pattern</u> from
			 * dependency injection pattern.
			 * <p>
			 * Not intended for manual use, and should not be visible to call
			 * manually. Manual call will result in error, that will crash the
			 * program.
			 * <p>
			 * And yes, contents of this method gives default values to final fields.
			 * For more information about this design pattern, check <a
			 * href=http://en.wikipedia.org/wiki/Dependency_injection>this</a> out.
			 */
			@SuppressWarnings("unused") private ContactInfo() {
				super();
			}

			/**
			 * Instantiates a new contact info.
			 * 
			 * @param phoneNumbers
			 *        the phone numbers
			 * @param emailAddresses
			 *        the email addresses
			 */
			public ContactInfo(String phoneNumbers, String emailAddresses) {
				super();
				this.phoneNumbers = Collections.synchronizedList(Lists.newArrayList(checkNotNull(phoneNumbers)));
				this.emailAddresses = Collections.synchronizedList(Lists.newArrayList(checkNotNull(emailAddresses)));
			}

			/**
			 * Instantiates a new contact info.
			 * 
			 * @param phoneNumbers
			 *        the phone numbers
			 * @param emailAddresses
			 *        the email addresses
			 */
			public ContactInfo(List<String> phoneNumbers, List<String> emailAddresses) {
				super();
				this.phoneNumbers = Collections.synchronizedList(checkNotNull(phoneNumbers));
				this.emailAddresses = Collections.synchronizedList(checkNotNull(emailAddresses));
			}

			/*
			 * (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("ContactInfo[").append(id).append("] [emailAddresses=").append(
						emailAddresses).append(", phoneNumbers=").append(phoneNumbers).append(
						"]");
				return builder.toString();
			}

			/**
			 * Gets the value of the emailAddresses property.
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned list will
			 * be present inside the JAXB object. This is why there is not a
			 * <CODE>set</CODE> method for the emailAddresses property.
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getEmailAddresses().add(newItem);
			 * </pre>
			 * <p>
			 * Objects of the following type(s) are allowed in the list {@link String }
			 * 
			 * @return the email addresses
			 */
			public List<String> getEmailAddresses() {
				return emailAddresses;
			}

			/**
			 * Gets the value of the id property.
			 * 
			 * @return possible object is {@link Long }
			 */
			public Long getId() {
				return id;
			}

			/**
			 * Gets the value of the phoneNumbers property.
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned list will
			 * be present inside the JAXB object. This is why there is not a
			 * <CODE>set</CODE> method for the phoneNumbers property.
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPhoneNumbers().add(newItem);
			 * </pre>
			 * <p>
			 * Objects of the following type(s) are allowed in the list {@link String }
			 * 
			 * @return the phone numbers
			 */
			public List<String> getPhoneNumbers() {
				return phoneNumbers;
			}

		}

		/**
		 * <img style="float:right; height=150px" src="doc-files/runtrouble.gif">
		 * <p>
		 * This is stable compatibility validator. This is used among other things
		 * to determine if a deserialized file is compatible with this class.
		 * <p>
		 * For more information about why this class is useful, check <a href=
		 * "http://mindprod.com/jgloss/serialization.html#SERIALVERSIONUID"
		 * >this</a> out.
		 * <p>
		 * "The Art Of Unix Programming" - Eric Raymond<br>
		 * 17. Rule of Extensibility: Design for the future, because it will be here
		 * sooner than you think.
		 */
		private static final long serialVersionUID = 5L;
		/**
		 * Value of the birthday property.
		 */
		@XmlElement(required = true) final protected Date birthday;
		/**
		 * Value of the iCi property.
		 */
		@XmlElement(required = false) protected ContactInfo iCi;
		/**
		 * Value of the id property.
		 */
		@XmlAttribute @Key protected Long id;
		/**
		 * Value of the isMale property.
		 */
		@XmlElement(required = true) final protected Boolean isMale;
		// @XmlElement(required = true) final protected List<String> lastName;
		// @XmlElement(required = false) protected String middleName;
		// @XmlElement(required = true) final protected List<String> firstName;
		// @XmlElement(required = true) protected Locale namingLocale;
		/**
		 * Value of the name property.
		 */
		@XmlElement(required = true) final protected String name;

		/**
		 * <img style="float:right;  height=12em;" src="doc-files/win.gif">
		 * <p>
		 * This private constructor ( don't change the visibility! ) is used by
		 * {@link JAXB} as part of <u>constructor injection pattern</u> from
		 * dependency injection pattern.
		 * <p>
		 * Not intended for manual use, and should not be visible to call manually.
		 * Manual call will result in error, that will crash the program.
		 * <p>
		 * And yes, contents of this method gives default values to final fields.
		 * For more information about this design pattern, check <a
		 * href=http://en.wikipedia.org/wiki/Dependency_injection>this</a> out.
		 */
		@SuppressWarnings("unused") private Person() {
			super();
			this.name = null;
			this.isMale = null;
			this.birthday = null;
		}

		/**
		 * Instantiates a new person.
		 * 
		 * @param lastName
		 *        the last name
		 * @param firstName
		 *        the first name
		 * @param isMale
		 *        the is male
		 * @param birthday
		 *        the birthday
		 * @param ICi
		 *        the i ci
		 */
		public Person(final String lastName, final String firstName,
				final Boolean isMale, final Date birthday, final ContactInfo ICi) {
			super();
			this.name = checkNotNull(lastName) + " " + checkNotNull(firstName);
			this.isMale = checkNotNull(isMale);
			this.birthday = checkNotNull(birthday);
			this.iCi = checkNotNull(ICi);
		}

		/*
		 * (non-Javadoc)
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		@Override public int compareTo(Person that) {
			return ComparisonChain.start().compare(
					this.name.compareToIgnoreCase(that.name), true).compare(
					this.birthday, that.birthday).compare(this.isMale, that.isMale).result();
		}

		/**
		 * Gets the value of the birthday property.
		 * 
		 * @return possible object is {@link Date }
		 */
		public Date getBirthday() {
			return birthday;
		}

		/**
		 * Gets the value of the iCi property.
		 * 
		 * @return possible object is {@link ContactInfo }
		 */
		public ContactInfo getICi() {
			return iCi;
		}

		/**
		 * Gets the value of the id property.
		 * 
		 * @return possible object is {@link Long }
		 */
		public Long getId() {
			return id;
		}

		/**
		 * Gets the value of the isMale property.
		 * 
		 * @return the checks if is male
		 */
		public Boolean getIsMale() {
			return isMale;
		}

		/**
		 * Gets the value of the name property.
		 * 
		 * @return possible object is {@link String }
		 */
		public String getName() {
			return name;
		}

		/*
		 * (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override public String toString() {
			final StringBuilder builder = new StringBuilder();
			builder.append("Person [id=").append(id).append(", name=").append(name).append(
					", isMale=").append(isMale).append(", birthday=").append(birthday).append(
					", iCi=").append(iCi).append("]");
			return builder.toString();
		}

	}

	/**
	 * <img style="float:right; height=150px" src="doc-files/runtrouble.gif">
	 * <p>
	 * This is stable compatibility validator. This is used among other things to
	 * determine if a deserialized file is compatible with this class.
	 * <p>
	 * For more information about why this class is useful, check <a href=
	 * "http://mindprod.com/jgloss/serialization.html#SERIALVERSIONUID" >this</a>
	 * out.
	 * <p>
	 * "The Art Of Unix Programming" - Eric Raymond<br>
	 * 17. Rule of Extensibility: Design for the future, because it will be here
	 * sooner than you think.
	 */
	private static final long serialVersionUID = 5L;
	/**
	 * Value of the id property.
	 */
	@XmlAttribute @Key protected Long id;
	/**
	 * Value of the person property.
	 */
	@XmlElement(required = true) final protected Person person;
	/**
	 * Value of the data property.
	 */
	@XmlElement(required = true) final protected Data data;
	/**
	 * Value of the modifiedDate property.
	 */
	@XmlElement(required = true) final protected Date modifiedDate;

	/**
	 * <img style="float:right;  height=12em;" src="doc-files/win.gif">
	 * <p>
	 * This private constructor ( don't change the visibility! ) is used by
	 * {@link JAXB} as part of <u>constructor injection pattern</u> from
	 * dependency injection pattern.
	 * <p>
	 * Not intended for manual use, and should not be visible to call manually.
	 * Manual call will result in error, that will crash the program.
	 * <p>
	 * And yes, contents of this method gives default values to final fields. For
	 * more information about this design pattern, check <a
	 * href=http://en.wikipedia.org/wiki/Dependency_injection>this</a> out.
	 */
	@SuppressWarnings("unused") private Employee() {
		super();
		this.person = null;
		this.data = null;
		this.modifiedDate = new Date();
	}

	/**
	 * Instantiates a new employee.
	 * 
	 * @param person
	 *        the person
	 * @param data
	 *        the data
	 */
	public Employee(final Person person, final Data data) {
		super();
		this.person = checkNotNull(person);
		this.data = checkNotNull(data);
		this.modifiedDate = new Date();
	}

	/**
	 * Instantiates a new employee.
	 * 
	 * @param firstName
	 *        the first name
	 * @param lastName
	 *        the last name
	 * @param isMale
	 *        the is male
	 * @param emailAddress
	 *        the email address
	 * @param phoneNumber
	 *        the phone number
	 * @param birthday
	 *        the birthday
	 * @param departmentTitle
	 *        the department title
	 * @param occupationTitle
	 *        the occupation title
	 * @param hireDate
	 *        the hire date
	 * @param creditCard
	 *        the credit card
	 * @param hourRate
	 *        the hour rate
	 * @param v1
	 *        the v1
	 * @param v2
	 *        the v2
	 */
	public Employee(final String firstName, final String lastName,
			final Boolean isMale, String emailAddress, String phoneNumber,
			Date birthday, String departmentTitle, String occupationTitle,
			Date hireDate, String creditCard, Double hourRate, Date v1, Date v2) {
		super();
		this.person = checkNotNull(new Person(lastName, firstName, isMale,
				birthday, new Person.ContactInfo(phoneNumber, emailAddress)));
		this.data = checkNotNull(new Employee.Data(creditCard, occupationTitle,
				departmentTitle, hireDate, hourRate, new CompensationDateSpan(v1, v2,
						false)));
		this.modifiedDate = new Date();
	}

	/**
	 * Instantiates a new employee.
	 * 
	 * @param firstName
	 *        the first name
	 * @param lastName
	 *        the last name
	 * @param isMale
	 *        the is male
	 * @param emailAddress
	 *        the email address
	 * @param phoneNumber
	 *        the phone number
	 * @param birthday
	 *        the birthday
	 * @param departmentTitle
	 *        the department title
	 * @param occupationTitle
	 *        the occupation title
	 * @param hireDate
	 *        the hire date
	 * @param creditCard
	 *        the credit card
	 * @param hourRate
	 *        the hour rate
	 */
	public Employee(final String firstName, final String lastName,
			final Boolean isMale, String emailAddress, String phoneNumber,
			Date birthday, String departmentTitle, String occupationTitle,
			Date hireDate, String creditCard, Double hourRate) {
		super();
		this.person = checkNotNull(new Person(lastName, firstName, isMale,
				birthday, new Person.ContactInfo(phoneNumber, emailAddress)));
		this.data = checkNotNull(new Data(creditCard, occupationTitle,
				departmentTitle, hireDate, hourRate));
		this.modifiedDate = new Date();
	}

	/**
	 * Gets the value of the person property.
	 * 
	 * @return possible object is {@link Person }
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Long }
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the value of the data property.
	 * 
	 * @return possible object is {@link Data }
	 */
	public Data getData() {
		return data;
	}

	/**
	 * Gets the value of the modifiedDate property.
	 * 
	 * @return possible object is {@link Date }
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override public int compareTo(Employee that) {
		return this.person.compareTo(that.person);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override public String toString() {
		return "Employee[" + id + "] [person=" + person + ", data=" + data + ", modifiedDate=" + modifiedDate + "]";
	}

}
