//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.1.2-b01-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2010.12.04 at 10:55:57 PM EET
//

package entity;

import java.math.BigDecimal;
import java.util.HashMap;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for raport complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="raport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depWageSum" type="{}stringToDoubleMapAdapter" minOccurs="0"/>
 *         &lt;element name="grandTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "raport", propOrder = {
		"depWageSum", "grandTotal" }) public class Raport {
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
	/**
	 * Instantiates a new raport.
	 */
	public Raport() {}

	/**
	 * Instantiates a new raport.
	 * 
	 * @param depWageSum
	 *        the dep wage sum
	 * @param grandTotal
	 *        the grand total
	 * @param id
	 *        the id
	 */
	public Raport(HashMap<String, Double> depWageSum, double grandTotal, Long id) {
		super();
		this.depWageSum = depWageSum;
		this.grandTotal = grandTotal;
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override public String toString() {
		return String.format("Raport [id=%s, depWageSum=%s, grandTotal=%s]", id,
				depWageSum, grandTotal);
	}

	/** The dep wage sum. */
	protected HashMap<String, Double> depWageSum;

	/** The bd. */
	transient private BigDecimal bd = BigDecimal.ZERO;

	/** The grand total. */
	protected double grandTotal;

	/** The id. */
	@XmlAttribute protected Long id;

	/**
	 * Gets the value of the depWageSum property.
	 * 
	 * @return possible object is {@link HashMap<String, Double> }
	 * 
	 */
	public HashMap<String, Double> getDepWageSum() {
		return depWageSum;
	}

	/**
	 * Sets the value of the depWageSum property.
	 * 
	 * @param value
	 *        allowed object is {@link HashMap<String, Double> }
	 * 
	 */
	public void setDepWageSum(HashMap<String, Double> value) {
		this.depWageSum = value;
	}

	/**
	 * Gets the value of the grandTotal property.
	 * 
	 * @return the grand total
	 */
	public double getGrandTotal() {
		return grandTotal;
	}

	/**
	 * Sets the value of the grandTotal property.
	 * 
	 * @param value
	 *        the new grand total
	 */
	public void setGrandTotal(double value) {
		this.grandTotal = value;
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
	 * Push.
	 * 
	 * @param departmentTitle
	 *        the department title
	 * @param hourRate
	 *        the hour rate
	 */
	public void push(String departmentTitle, Double hourRate) {
		bd = bd.add(BigDecimal.valueOf(hourRate));
		grandTotal = bd.doubleValue();
		if (this.depWageSum.containsKey(departmentTitle)) this.depWageSum.put(
				departmentTitle, this.depWageSum.get(departmentTitle) + hourRate);
		else this.depWageSum.put(departmentTitle, hourRate);
	}
}
