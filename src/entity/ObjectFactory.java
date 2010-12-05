//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.04 at 10:55:57 PM EET 
//


package entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


// TODO: Auto-generated Javadoc
/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _HumanResources_QNAME. */
    private final static QName _HumanResources_QNAME = new QName("", "humanResources");
    
    /** The Constant _Person_QNAME. */
    private final static QName _Person_QNAME = new QName("", "person");
    
    /** The Constant _Raport_QNAME. */
    private final static QName _Raport_QNAME = new QName("", "raport");
    
    /** The Constant _CompensationDateSpan_QNAME. */
    private final static QName _CompensationDateSpan_QNAME = new QName("", "compensationDateSpan");
    
    /** The Constant _Data_QNAME. */
    private final static QName _Data_QNAME = new QName("", "data");
    
    /** The Constant _Employee_QNAME. */
    private final static QName _Employee_QNAME = new QName("", "employee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity.
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employee }.
     *
     * @return the employee
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Data }.
     *
     * @return the data
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link Raport }.
     *
     * @return the raport
     */
    public Raport createRaport() {
        return new Raport();
    }

    /**
     * Create an instance of {@link CompensationDateSpan }.
     *
     * @return the compensation date span
     */
    public CompensationDateSpan createCompensationDateSpan() {
        return new CompensationDateSpan();
    }

    /**
     * Create an instance of {@link ContactInfo }.
     *
     * @return the contact info
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link StringToDoubleMapAdapter }.
     *
     * @return the string to double map adapter
     */
    public StringToDoubleMapAdapter createStringToDoubleMapAdapter() {
        return new StringToDoubleMapAdapter();
    }

    /**
     * Create an instance of {@link HumanResources }.
     *
     * @return the human resources
     */
    public HumanResources createHumanResources() {
        return new HumanResources();
    }

    /**
     * Create an instance of {@link Person }.
     *
     * @return the person
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link MapTypeEntry }.
     *
     * @return the map type entry
     */
    public MapTypeEntry createMapTypeEntry() {
        return new MapTypeEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HumanResources }{@code >}}.
     *
     * @param value the value
     * @return the JAXB element< human resources>
     */
    @XmlElementDecl(namespace = "", name = "humanResources")
    public JAXBElement<HumanResources> createHumanResources(HumanResources value) {
        return new JAXBElement<HumanResources>(_HumanResources_QNAME, HumanResources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}.
     *
     * @param value the value
     * @return the JAXB element< person>
     */
    @XmlElementDecl(namespace = "", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Raport }{@code >}}.
     *
     * @param value the value
     * @return the JAXB element< raport>
     */
    @XmlElementDecl(namespace = "", name = "raport")
    public JAXBElement<Raport> createRaport(Raport value) {
        return new JAXBElement<Raport>(_Raport_QNAME, Raport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompensationDateSpan }{@code >}}.
     *
     * @param value the value
     * @return the JAXB element< compensation date span>
     */
    @XmlElementDecl(namespace = "", name = "compensationDateSpan")
    public JAXBElement<CompensationDateSpan> createCompensationDateSpan(CompensationDateSpan value) {
        return new JAXBElement<CompensationDateSpan>(_CompensationDateSpan_QNAME, CompensationDateSpan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Data }{@code >}}.
     *
     * @param value the value
     * @return the JAXB element< data>
     */
    @XmlElementDecl(namespace = "", name = "data")
    public JAXBElement<Data> createData(Data value) {
        return new JAXBElement<Data>(_Data_QNAME, Data.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}.
     *
     * @param value the value
     * @return the JAXB element< employee>
     */
    @XmlElementDecl(namespace = "", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

}