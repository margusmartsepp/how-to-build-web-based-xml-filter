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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for contactInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
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
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "contactInfo",
		propOrder = { "emailAddresses", "phoneNumbers" }) public class ContactInfo {
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
		return String.format(
				"ContactInfo [id=%s, emailAddresses=%s, phoneNumbers=%s]", id,
				emailAddresses, phoneNumbers);
	}

	/** The email addresses. */
	protected List<String> emailAddresses = new ArrayList<String>();

	/** The phone numbers. */
	protected List<String> phoneNumbers = new ArrayList<String>();

	/** The id. */
	@XmlAttribute protected Long id;

	/**
	 * Gets the value of the emailAddresses property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the emailAddresses property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEmailAddresses().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * @return the email addresses
	 */
	public List<String> getEmailAddresses() {
		if (emailAddresses == null) {
			emailAddresses = new ArrayList<String>();
		}
		return this.emailAddresses;
	}

	/**
	 * Gets the value of the phoneNumbers property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the phoneNumbers property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPhoneNumbers().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * @return the phone numbers
	 */
	public List<String> getPhoneNumbers() {
		if (phoneNumbers == null) {
			phoneNumbers = new ArrayList<String>();
		}
		return this.phoneNumbers;
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

	/**
	 * Instantiates a new contact info.
	 */
	public ContactInfo() {}

	/**
	 * Instantiates a new contact info.
	 * 
	 * @param id
	 *        the id
	 * @param emailAddresses
	 *        the email addresses
	 * @param phoneNumbers
	 *        the phone numbers
	 */
	public ContactInfo(Long id, List<String> emailAddresses,
			List<String> phoneNumbers) {
		super();
		this.id = id;
		this.emailAddresses = emailAddresses;
		this.phoneNumbers = phoneNumbers;
	}

}
