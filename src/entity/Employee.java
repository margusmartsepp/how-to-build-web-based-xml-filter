//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.1.2-b01-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2010.12.04 at 10:55:57 PM EET
//

package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Preconditions;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for employee complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}person"/>
 *         &lt;element ref="{}data"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "employee", propOrder = {
		"person", "data", "modifiedDate" }) @XmlRootElement public class Employee
		implements Serializable {
	/**
	 * <p>
	 * This is stable compatibility validator. This is used among other things to
	 * determine if a deserialized file is compatible with this class.
	 * <p>
	 * For more information about why this class is useful, check <a href=
	 * "http://mindprod.com/jgloss/serialization.html#SERIALVERSIONUID" >this</a>
	 * out.
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override public String toString() {
		Preconditions.checkNotNull(modifiedDate);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return String.format(
				"Employee [id=%s, person=%s, data=%s, modifiedDate=%s]", id, person,
				data, dateFormat.format(modifiedDate));
	}

	/** The person. */
	@XmlElement(required = true) protected Person person;

	/** The data. */
	@XmlElement(required = true) protected Data data;

	/** The modified date. */
	@XmlElement(required = true) protected Date modifiedDate;

	/** The id. */
	@XmlAttribute protected Long id;

	/**
	 * Gets the value of the person property.
	 * 
	 * 
	 * 
	 * @return possible object is {@link Person }
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * Sets the value of the person property.
	 * 
	 * @param value
	 *        allowed object is {@link Person }
	 * 
	 */
	public void setPerson(Person value) {
		this.person = value;
	}

	/**
	 * Gets the value of the data property.
	 * 
	 * 
	 * 
	 * @return possible object is {@link Data }
	 */
	public Data getData() {
		return data;
	}

	/**
	 * Sets the value of the data property.
	 * 
	 * @param value
	 *        allowed object is {@link Data }
	 * 
	 */
	public void setData(Data value) {
		this.data = value;
	}

	/**
	 * Gets the value of the modifiedDate property.
	 * 
	 * 
	 * 
	 * @return possible object is {@link Date }
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * Sets the value of the modifiedDate property.
	 * 
	 * @param value
	 *        allowed object is {@link Date }
	 * 
	 */
	public void setModifiedDate(Date value) {
		this.modifiedDate = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * 
	 * 
	 * @return possible object is {@link Long }
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

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {}

	/**
	 * Instantiates a new employee.
	 * 
	 * @param id
	 *        the id
	 * @param person
	 *        the person
	 * @param data
	 *        the data
	 * @param modifiedDate
	 *        the modified date
	 */
	public Employee(Long id, Person person, Data data, Date modifiedDate) {
		super();
		this.id = id;
		this.person = person;
		this.data = data;
		this.modifiedDate = modifiedDate;
	}

}
