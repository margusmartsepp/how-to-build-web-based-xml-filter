/*
 * 
 */
package entity;

import java.io.Serializable;
import java.util.HashMap;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The Class Report.
 */
@XmlRootElement public class Report implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Report() {}
	public Double getGrandTotal() {
		return grandTotal;
	}

	/** The dep wage sum. */
	@XmlJavaTypeAdapter(GenericMapAdapter.class)//
	private final HashMap<String, Double> depWageSum = //
	new HashMap<String, Double>();

	/** The grand total. */
	@XmlElement(required = true) private Double grandTotal = 0d;

	/**
	 * Push.
	 * 
	 * @param departmentTitle
	 *        the department title
	 * @param hourRate
	 *        the hour rate
	 */
	public void push(String departmentTitle, Double hourRate) {
		grandTotal += hourRate;
		if (this.depWageSum.containsKey(departmentTitle)) this.depWageSum.put(
				departmentTitle, this.depWageSum.get(departmentTitle) + hourRate);
		else this.depWageSum.put(departmentTitle, hourRate);
	}

}
