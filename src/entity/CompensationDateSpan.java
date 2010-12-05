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
import javax.xml.datatype.XMLGregorianCalendar;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for compensationDateSpan complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
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
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "compensationDateSpan",
		propOrder = { "start", "end", "compensated" }) public class CompensationDateSpan
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
		return String.format(
				"CompensationDateSpan [id=%s, start=%s, end=%s, compensated=%s]", id,
				start, end, compensated);
	}

	/** The start. */
	@XmlElement(required = true) protected Date start;

	/** The end. */
	@XmlElement(required = true) protected Date end;

	/** The compensated. */
	protected boolean compensated;

	/** The id. */
	@XmlAttribute protected Long id;

	/**
	 * Gets the value of the start property.
	 * 
	 * @return possible object is {@link Date }
	 * 
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * Sets the value of the start property.
	 * 
	 * @param value
	 *        allowed object is {@link Date }
	 * 
	 */
	public void setStart(Date value) {
		this.start = value;
	}

	/**
	 * Gets the value of the end property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * Sets the value of the end property.
	 * 
	 * @param value
	 *        allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setEnd(Date value) {
		this.end = value;
	}

	/**
	 * Gets the value of the compensated property.
	 * 
	 * @return true, if is compensated
	 */
	public boolean isCompensated() {
		return compensated;
	}

	/**
	 * Sets the value of the compensated property.
	 * 
	 * @param value
	 *        the new compensated
	 */
	public void setCompensated(boolean value) {
		this.compensated = value;
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
	 * Instantiates a new compensation date span.
	 */
	public CompensationDateSpan() {}

	/**
	 * Instantiates a new compensation date span.
	 * 
	 * @param id
	 *        the id
	 * @param start
	 *        the start
	 * @param end
	 *        the end
	 * @param compensated
	 *        the compensated
	 * @throws IllegalArgumentException
	 *         the illegal argument exception if start is after end
	 * @throws NullPointerException
	 *         the null pointer exception if start or end is null
	 */
	public CompensationDateSpan(Long id, Date start, Date end, boolean compensated)
			throws IllegalArgumentException, NullPointerException {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.compensated = compensated;

		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
	}

}
