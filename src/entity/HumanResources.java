package entity;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

/**
 * <img style="float:right;" src="doc-files/shy.png">
 * <p>
 * This class is a wrapper container for {@link Employee} class collection.
 * Among other more obvious things, by design, this class "protects"
 * serializability of the wrapped collection and enables methods like
 * {@link #filter} and {@link #transform}.
 * <p>
 * IMPORTANT: You can get live collection from this wrapper by unwrapping the
 * Employee class collection from this container. You can do this with
 * {@link #getEmployees}.
 * <p>
 * IMPORTANT: This class contains mutable data and against popular belief can
 * not guarantee thread-safety (if you need that, redesign to use immutable data
 * ). But from class point of view, it does it's best effort to not brake.
 * <p>
 * IMPORTANT: Synchronization order - this before that .
 * <p>
 * Java class for HumanResources complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="HumanResources">
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
 * @see entity.adhoc.JAXB
 * @see entity.adhoc.PXML
 * @see Employee
 * @author Margus Martsepp
 */
@XmlRootElement @XmlAccessorType(XmlAccessType.FIELD)//
@XmlType(name = "HumanResources", propOrder = { "employee" })//
public class HumanResources implements Serializable, Iterable<Employee>,
		Collection<Employee>
/**
 * NOTE: It is funny to, to think, that I actually can store generic class info,
 * if that would be nessesary
 * HumanResources<Employee<Data<CompensationDateSpan>,Person<ContactInfo>>>
 */
{
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
	private static final long serialVersionUID = 2L;

	/** The employee. */
	@XmlElement(name = "Employee") protected Collection<Employee> employee;

	/**
	 * Instantiates a new human resources.
	 */
	public HumanResources() {
		this.employee = new ArrayList<Employee>(0);
	}

	/**
	 * Instantiates a new human resources.
	 * 
	 * @param employees
	 *        the employees
	 */
	public HumanResources(final Iterable<Employee> employees) {
		this.employee = (Collection<Employee>) employees;
	}

	/**
	 * Instantiates a new human resources.
	 * 
	 * @param employees
	 *        the employees
	 */
	public HumanResources(final Employee... employees) {
		final ArrayList<Employee> result = new ArrayList<Employee>();
		for (Employee e : employees) {
			if (e != null) {
				result.add(e);
			}
		}
		this.employee = result;
	}

	/**
	 * <p>
	 * <b>Unwrapper</b> and also gets the value of the employee property.
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the employee property.
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEmployees().add(newItem);
	 * </pre>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Employee }
	 * 
	 * @return the employees
	 */
	public Collection<Employee> getEmployees() {
		synchronized (checkNotNull(employee)) {
			if (employee == null) {
				employee = new ArrayList<Employee>();
			}

			return this.employee;
		}
	}

	/**
	 * Gets the.
	 * 
	 * @param itemIndex
	 *        the item index
	 * @return the employee
	 */
	public Employee get(int itemIndex) {
		synchronized (checkNotNull(employee)) {
			return Iterables.get(employee, itemIndex);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override public String toString() {
		synchronized (checkNotNull(employee)) {
			return "HumanResources [Employees=" + employee + "]";
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override public Iterator<Employee> iterator() {
		synchronized (checkNotNull(employee)) {
			checkArgument(!employee.isEmpty());
			return employee.iterator();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#add(java.lang.Object)
	 */
	@Override public boolean add(Employee coll) {
		synchronized (checkNotNull(employee)) {
			return employee.add(coll);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#addAll(java.util.Collection)
	 */
	@Override public boolean addAll(Collection<? extends Employee> coll) {
		synchronized (checkNotNull(employee)) {
			return employee.addAll(coll);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#clear()
	 */
	@Override public void clear() {
		synchronized (checkNotNull(employee)) {
			employee.clear();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#contains(java.lang.Object)
	 */
	@Override public boolean contains(Object coll) {

		synchronized (checkNotNull(employee)) {
			try {
				return employee.contains(coll);
			} catch (ClassCastException e) {
				return false;
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#containsAll(java.util.Collection)
	 */
	@Override public boolean containsAll(Collection<?> coll) {
		synchronized (checkNotNull(employee)) {
			return employee.containsAll(coll);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#isEmpty()
	 */
	@Override public boolean isEmpty() {
		synchronized (checkNotNull(employee)) {
			return employee.isEmpty();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#remove(java.lang.Object)
	 */
	@Override public boolean remove(Object o) {
		synchronized (checkNotNull(employee)) {
			return employee.remove(o);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#removeAll(java.util.Collection)
	 */
	@Override public boolean removeAll(Collection<?> c) {
		synchronized (checkNotNull(employee)) {
			return employee.removeAll(c);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#retainAll(java.util.Collection)
	 */
	@Override public boolean retainAll(Collection<?> c) {
		synchronized (checkNotNull(employee)) {
			return employee.retainAll(c);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#size()
	 */
	@Override public int size() {
		synchronized (checkNotNull(employee)) {
			return employee.size();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#toArray()
	 */
	@Override public Object[] toArray() {
		synchronized (checkNotNull(employee)) {
			return employee.toArray();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Collection#toArray(T[])
	 */
	@Override public <T> T[] toArray(T[] arg0) {
		synchronized (checkNotNull(employee)) {
			return employee.toArray(arg0);
		}
	}

	/**
	 * Frequency.
	 * 
	 * @param em
	 *        the em
	 * @return the int
	 */
	public int frequency(Employee em) {
		synchronized (checkNotNull(employee)) {
			return Iterables.frequency(employee, em);
		}
	}

	/**
	 * Padded partition.
	 * 
	 * @param size
	 *        the size
	 * @return the iterable
	 */
	public Iterable<List<Employee>> paddedPartition(int size) {
		synchronized (checkNotNull(employee)) {
			return Iterables.paddedPartition(this, size);
		}
	}

	/**
	 * Filter.
	 * 
	 * @param predicate
	 *        the predicate
	 * @return the human resources
	 */
	public HumanResources filter(Predicate<Employee> predicate) {
		final ArrayList<Employee> result = new ArrayList<Employee>();
		synchronized (checkNotNull(employee)) {
			for (Employee element : employee) {
				if (element != null) if (predicate.apply(element)) result.add(element);
			}
			employee.clear();
			employee.addAll(result);
		}
		result.clear();

		return this;
	}

	/**
	 * Transform.
	 * 
	 * @param function
	 *        the function
	 * @return the human resources
	 */
	public HumanResources transform(Function<Employee, Employee> function) {
		synchronized (checkNotNull(employee)) {
			for (Employee element : employee) {
				if (element != null) element = function.apply(element);
			}
		}

		return this;
	}

	/**
	 * Transforms.
	 * 
	 * @param <T>
	 *        the generic type
	 * @param function
	 *        the function
	 * @return the array list
	 */
	public <T> ArrayList<T> transforms(Function<Employee, T> function) {
		ArrayList<T> result = new ArrayList<T>();
		synchronized (checkNotNull(employee)) {
			for (Employee element : employee) {
				if (element == null) {
					result.add(null);
				} else {
					result.add(function.apply(element));
				}
			}
		}
		return result;
	}

	/**
	 * Union.
	 * 
	 * @param that
	 *        the that
	 * @return the sets the view
	 */
	public SetView<Employee> union(HumanResources that) {
		synchronized (checkNotNull(employee)) {
			synchronized (checkNotNull(that.getEmployees())) {
				return Sets.union(Sets.newHashSet(this), Sets.newHashSet(that));
			}
		}
	}

	/**
	 * Difference.
	 * 
	 * @param that
	 *        the that
	 * @return the sets the view
	 */
	public SetView<Employee> difference(HumanResources that) {
		synchronized (checkNotNull(employee)) {
			synchronized (checkNotNull(that.getEmployees())) {
				return Sets.difference(Sets.newHashSet(this), Sets.newHashSet(that));
			}
		}
	}

	/**
	 * Intersection.
	 * 
	 * @param that
	 *        the that
	 * @return the sets the view
	 */
	public SetView<Employee> intersection(HumanResources that) {
		synchronized (checkNotNull(employee)) {
			synchronized (checkNotNull(that.getEmployees())) {
				return Sets.intersection(Sets.newHashSet(this), Sets.newHashSet(that));
			}
		}
	}

	/**
	 * Find.
	 * 
	 * @param predicate
	 *        the predicate
	 * @return the employee
	 */
	public Employee find(Predicate<Employee> predicate) {
		synchronized (checkNotNull(employee)) {
			return Iterables.find(employee, predicate);
		}
	}

	/**
	 * Index of.
	 * 
	 * @param predicate
	 *        the predicate
	 * @return the int
	 */
	public int indexOf(Predicate<Employee> predicate) {
		synchronized (checkNotNull(employee)) {
			return Iterables.indexOf(employee, predicate);
		}
	}

	/**
	 * Any.
	 * 
	 * @param predicate
	 *        the predicate
	 * @return true, if successful
	 */
	public boolean any(Predicate<Employee> predicate) {
		synchronized (checkNotNull(employee)) {
			return Iterables.any(employee, predicate);
		}
	}

	/**
	 * All.
	 * 
	 * @param predicate
	 *        the predicate
	 * @return true, if successful
	 */
	public boolean all(Predicate<Employee> predicate) {
		synchronized (checkNotNull(employee)) {
			return Iterables.all(employee, predicate);
		}
	}

	/**
	 * Validate.
	 * 
	 * @param predicate
	 *        the predicate
	 */
	public void validate(Predicate<Employee> predicate) {
		synchronized (checkNotNull(employee)) {
			for (Employee em : employee) {
				if (!predicate.apply(em)) {
					em = null;
				}
			}
		}
	}
}
