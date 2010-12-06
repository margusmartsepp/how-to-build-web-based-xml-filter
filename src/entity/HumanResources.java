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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.appengine.repackaged.com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for humanResources complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="humanResources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee" type="{}employee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "humanResources",
		propOrder = { "employee" }) @XmlRootElement public class HumanResources
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
	/** The employee. */
	@XmlElement(name = "Employee") protected List<Employee> employee = Lists.newArrayList();

	/**
	 * Gets the value of the employee property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the employee property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEmployee().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Employee }
	 * 
	 * 
	 * 
	 * @return the employee
	 */
	public List<Employee> getEmployee() {
		if (employee == null) {
			employee = new ArrayList<Employee>();
		}
		return this.employee;
	}

	/**
	 * Instantiates a new human resources.
	 */
	public HumanResources() {}

	/**
	 * Instantiates a new human resources.
	 * 
	 * @param employee
	 *        the employee
	 */
	public HumanResources(List<Employee> employee) {
		super();
		this.employee = employee;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override public String toString() {
		return String.format("HumanResources [employee=%s]", employee);
	}

	/**
	 * Filter.
	 * 
	 * @param predicate
	 *        the predicate
	 * 
	 * 
	 * @return the human resources * @throws NullPointerException the null pointer
	 *         exception
	 */
	public HumanResources filter(Predicate<Employee> predicate) throws NullPointerException {
		Preconditions.checkNotNull(employee);
		final ArrayList<Employee> result = new ArrayList<Employee>();
		synchronized (employee) {
			for (Employee element : employee) {
				if (element != null) //
					if (predicate.apply(element)) //
						result.add(element);
			}
			employee.clear();
			employee.addAll(result);
		}
		result.clear();

		return this;
	}
}
