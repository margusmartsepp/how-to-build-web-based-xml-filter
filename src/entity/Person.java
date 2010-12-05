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
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for person complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isMale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="iCi" type="{}contactInfo" minOccurs="0"/>
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "person", propOrder = {
		"name", "isMale", "birthday", "iCi" }) public class Person implements
		Serializable {
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
	/** The is male. */
	protected boolean isMale;

	/** The name. */
	@XmlElement(required = true) protected String name;

	/** The birthday. */
	@XmlElement(required = true) protected Date birthday;

	/** The i ci. */
	protected ContactInfo iCi;

	/** The id. */
	@XmlAttribute protected Long id;

	/**
	 * Instantiates a new person.
	 */
	public Person() {}

	/**
	 * Instantiates a new person.
	 * 
	 * @param id
	 *        the id
	 * @param isMale
	 *        the is male
	 * @param name
	 *        the name
	 * @param birthday
	 *        the birthday
	 * @param iCi
	 *        the i ci
	 */
	public Person(Long id, boolean isMale, String name, Date birthday,
			ContactInfo iCi) {
		super();
		this.id = id;
		this.isMale = isMale;
		this.name = name;
		this.birthday = birthday;
		this.iCi = iCi;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override public String toString() {
		return String.format(
				"Person [id=%s, name=%s, isMale=%s, birthday=%s, iCi=%s]", id, name,
				isMale, birthday, iCi);
	}

	/**
	 * Gets the value of the isMale property.
	 * 
	 * 
	
	 * @return true, if is checks if is male */
	public boolean isIsMale() {
		return isMale;
	}

	/**
	 * Sets the value of the isMale property.
	 * 
	 * @param value
	 *        the new checks if is male
	 */
	public void setIsMale(boolean value) {
		this.isMale = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * 
	 * 
	
	 * @return possible object is {@link String } */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *        allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the birthday property.
	 * 
	 * 
	 * 
	
	 * @return possible object is {@link Date } */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * Sets the value of the birthday property.
	 * 
	 * @param value
	 *        allowed object is {@link Date }
	 * 
	 */
	public void setBirthday(Date value) {
		this.birthday = value;
	}

	/**
	 * Gets the value of the iCi property.
	 * 
	 * 
	 * 
	
	 * @return possible object is {@link ContactInfo } */
	public ContactInfo getICi() {
		return iCi;
	}

	/**
	 * Sets the value of the iCi property.
	 * 
	 * @param value
	 *        allowed object is {@link ContactInfo }
	 * 
	 */
	public void setICi(ContactInfo value) {
		this.iCi = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * 
	 * 
	
	 * @return possible object is {@link Long } */
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
