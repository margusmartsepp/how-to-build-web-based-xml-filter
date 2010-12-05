//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.1.2-b01-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2010.12.04 at 10:55:57 PM EET
//

package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for data complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
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
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "data", propOrder = {
		"creditCard", "occupationTitle", "departmentTitle", "hireDate", "hourRate",
		"vacation", "holiday", "std", "ltd" }) public class Data {

	@XmlElement(required = true) protected String creditCard;
	@XmlElement(required = true) protected String occupationTitle;
	@XmlElement(required = true) protected String departmentTitle;
	@XmlElement(required = true) protected Date hireDate;
	protected double hourRate;
	protected List<CompensationDateSpan> vacation;
	protected List<CompensationDateSpan> holiday;
	protected List<CompensationDateSpan> std;
	protected List<CompensationDateSpan> ltd;
	@XmlAttribute protected Long id;
	public Data() {};
	public Data(Long id, String creditCard, String occupationTitle,
			String departmentTitle, Date hireDate, double hourRate,
			List<CompensationDateSpan> vacation, List<CompensationDateSpan> holiday,
			List<CompensationDateSpan> std, List<CompensationDateSpan> ltd) {
		super();
		this.id = id;
		this.creditCard = creditCard;
		this.occupationTitle = occupationTitle;
		this.departmentTitle = departmentTitle;
		this.hireDate = hireDate;
		this.hourRate = hourRate;
		this.vacation = vacation;
		this.holiday = holiday;
		this.std = std;
		this.ltd = ltd;
	}

	/**
	 * Gets the value of the creditCard property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreditCard() {
		return creditCard;
	}

	/**
	 * Sets the value of the creditCard property.
	 * 
	 * @param value
	 *        allowed object is {@link String }
	 * 
	 */
	public void setCreditCard(String value) {
		this.creditCard = value;
	}

	/**
	 * Gets the value of the occupationTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOccupationTitle() {
		return occupationTitle;
	}

	/**
	 * Sets the value of the occupationTitle property.
	 * 
	 * @param value
	 *        allowed object is {@link String }
	 * 
	 */
	public void setOccupationTitle(String value) {
		this.occupationTitle = value;
	}

	/**
	 * Gets the value of the departmentTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDepartmentTitle() {
		return departmentTitle;
	}

	/**
	 * Sets the value of the departmentTitle property.
	 * 
	 * @param value
	 *        allowed object is {@link String }
	 * 
	 */
	public void setDepartmentTitle(String value) {
		this.departmentTitle = value;
	}

	/**
	 * Gets the value of the hireDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getHireDate() {
		return hireDate;
	}

	@Override public String toString() {
		return String.format(
				"Data [id=%s, creditCard=%s, occupationTitle=%s, departmentTitle=%s, hireDate=%s, hourRate=%s, vacation=%s, holiday=%s, std=%s, ltd=%s]",
				id, creditCard, occupationTitle, departmentTitle, hireDate, hourRate,
				vacation, holiday, std, ltd);
	}

	/**
	 * Sets the value of the hireDate property.
	 * 
	 * @param value
	 *        allowed object is {@link Date }
	 * 
	 */
	public void setHireDate(Date value) {
		this.hireDate = value;
	}

	/**
	 * Gets the value of the hourRate property.
	 * 
	 */
	public double getHourRate() {
		return hourRate;
	}

	/**
	 * Sets the value of the hourRate property.
	 * 
	 */
	public void setHourRate(double value) {
		this.hourRate = value;
	}

	/**
	 * Gets the value of the vacation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the vacation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getVacation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CompensationDateSpan }
	 * 
	 * 
	 */
	public List<CompensationDateSpan> getVacation() {
		if (vacation == null) {
			vacation = new ArrayList<CompensationDateSpan>();
		}
		return this.vacation;
	}

	/**
	 * Gets the value of the holiday property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the holiday property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getHoliday().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CompensationDateSpan }
	 * 
	 * 
	 */
	public List<CompensationDateSpan> getHoliday() {
		if (holiday == null) {
			holiday = new ArrayList<CompensationDateSpan>();
		}
		return this.holiday;
	}

	/**
	 * Gets the value of the std property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the std property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getStd().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CompensationDateSpan }
	 * 
	 * 
	 */
	public List<CompensationDateSpan> getStd() {
		if (std == null) {
			std = new ArrayList<CompensationDateSpan>();
		}
		return this.std;
	}

	/**
	 * Gets the value of the ltd property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the ltd property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLtd().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CompensationDateSpan }
	 * 
	 * 
	 */
	public List<CompensationDateSpan> getLtd() {
		if (ltd == null) {
			ltd = new ArrayList<CompensationDateSpan>();
		}
		return this.ltd;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *        allowed object is {@link Long }
	 * 
	 */
	public void setId(Long value) {
		this.id = value;
	}

}
