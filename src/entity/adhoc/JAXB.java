/*
 * 
 */
package entity.adhoc;

import static com.google.common.base.Preconditions.checkNotNull;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.Node;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import com.google.common.base.Preconditions;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * This class provides tools to further simplify the automation of the entity
 * mappings between Java objects and XML data (from various sources) using JAXB
 * 2.
 * <p>
 * IMPORTANT: This class does not work <strong>if Java Security is
 * enabled</strong>. To fix this: you can extend and rewrite contents of
 * methods, so that <code>marshal</code>, <code>unmarshal</code> and
 * <code>JAXBContext.newInstance</code> acquire privileges from
 * {@link java.security.AccessController}.<strong>doPrivileged</strong>. <br/>
 * <strong>Source</strong>: <a
 * href=http://publib.boulder.ibm.com/infocenter/wasinfo
 * /v7r0/index.jsp?topic=/com
 * .ibm.websphere.express.doc/info/exp/ae/twbs_jaxbmarshalxml.html> link</a>
 * <p>
 * IMPORTANT: {@link java.io.FileOutputStream} (and a like) is not supported by
 * Google App Engine's Java runtime environment. When using Google App Engine,
 * edit preferences to add validationExclusion for this class. If you have
 * Google App Engine plugin for Eclipse, then Eclipse can fix this for you.
 * <p>
 * IMPORTANT: If you find, that this class does not do what you want, you do not
 * have to use it. This is convenience hack class, so even unit tests (proof
 * that this works as expected) are not provided, even if there exists a
 * problem, it is with utmost certainty that under laying layer is to blame.
 * <p>
 * JAXB definition: <blockquote> Java Architecture for XML Binding (JAXB) allows
 * Java developers to map Java classes to XML representations. JAXB provides two
 * main features: the ability to marshal Java objects into XML and the inverse,
 * i.e. to unmarshal XML back into Java objects. In other words, JAXB allows
 * storing and retrieving data in memory in any XML format, without the need to
 * implement a specific set of XML loading and saving routines for the program's
 * class structure. It is similar to xsd.exe and xmlserializers in .Net
 * Framework.</blockquote> <strong>Source:</strong> <a href
 * ="http://en.wikipedia.org/wiki/Java_Architecture_for_XML_Binding">Wikipedia
 * </a>.
 * <p>
 * Contains:
 * <ul>
 * <li>{@link #read(Class, InputSource)}
 * <li>{@link #read(Class, InputStream)}
 * <li>{@link #read(Class, Node)}
 * <li>{@link #read(Class, Reader)}
 * <li>{@link #read(Class, Reader)}
 * <li>{@link #read(Class, String)}
 * <li>{@link #read(Class, URL)}
 * <li>{@link #read(Class, XMLEventReader)}
 * <li>{@link #read(Class, XMLStreamReader)}
 * <li>{@link #write(Object, ContentHandler)}
 * <li>{@link #write(Object, Node)}
 * <li>{@link #write(Object, OutputStream)}
 * <li>{@link #write(Object, Result)}
 * <li>{@link #write(Object, String)}
 * <li>{@link #write(Object, Writer)}
 * <li>{@link #write(Object, XMLEventWriter)}
 * <li>{@link #write(Object, XMLStreamWriter)}
 * </ul>
 * 
 * @see PXML
 * @see entity.Employee
 * @see entity.HumanResources
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class JAXB
/**
 * Trivial example on how to get privileges.
 * 
 * <pre>
 * JAXBContext context = java.security.AccessController.doPrivileged( //
 * new java.security.PrivilegedAction&lt;JAXBContext&gt;() {
 * 	public JAXBContext run() {
 * 		try {
 * 			return JAXBContext.newInstance(HumanResources.class);
 * 		} catch (JAXBException e) {
 * 			e.printStackTrace();
 * 		}
 * 		return null;
 * 	}
 * });
 * </pre>
 */
{

	/**
	 * SAX input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param is
	 *        the is
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(
			Class<T> t, InputSource is) throws Exception {
		Preconditions.checkNotNull(is);
		Preconditions.checkNotNull(t);
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(is);
	}

	/**
	 * Stream input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param is
	 *        the is
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(
			Class<T> t, InputStream is) throws Exception {
		Preconditions.checkNotNull(is);
		Preconditions.checkNotNull(t);
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(is);
	}

	/**
	 * SOAP input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param soap
	 *        the soap
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(Class<T> t, Node soap) throws Exception {
		Preconditions.checkNotNull(soap);
		Preconditions.checkNotNull(t);
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(soap);
	}

	/**
	 * Reader input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param r
	 *        the r
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(Class<T> t, Reader r) throws Exception {
		Preconditions.checkNotNull(r);
		Preconditions.checkNotNull(t);
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(r);
	}

	/**
	 * <p>
	 * File input. You may have been looking for {@link #read(Class, Reader)},
	 * with {@link StringReader}.
	 * <p>
	 * Examples:
	 * 
	 * <pre>
	 * HumanResources hm = JAXB.read(HumanResources.class, filename);
	 * Employee em = JAXB.read(Employee.class, filename);
	 * </pre>
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param filename
	 *        the filename
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(
			Class<T> t, String filename) throws Exception {
		Preconditions.checkNotNull(filename);
		Preconditions.checkNotNull(t);
		java.io.File f = checkNotNull(new java.io.File(filename));
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(f);
	}

	/**
	 * URL input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param url
	 *        the url
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(Class<T> t, URL url) throws Exception {
		System.out.println(url);
		Preconditions.checkNotNull(url);
		Preconditions.checkNotNull(t);
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(url);
	}

	/**
	 * StAX Event input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param reader
	 *        the reader
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(
			Class<T> t, XMLEventReader reader) throws Exception {
		Preconditions.checkNotNull(reader);
		Preconditions.checkNotNull(t);
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(reader);
	}

	/**
	 * StAX Stream input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param reader
	 *        the reader
	 * 
	 * 
	 * 
	 * @return the t * @throws Exception the exception * @see JAXB
	 */
	@SuppressWarnings("unchecked") public static <T> T read(
			Class<T> t, XMLStreamReader reader) throws Exception {
		Preconditions.checkNotNull(reader);
		Preconditions.checkNotNull(t);
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller u = context.createUnmarshaller();
		return (T) u.unmarshal(reader);
	}

	/**
	 * Write.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param ch
	 *        the ch
	 * 
	 * 
	 * @throws Exception
	 *         the exception * @see JAXB
	 */
	public static <T> void write(T t, ContentHandler ch) throws Exception {
		Preconditions.checkNotNull(ch);
		Preconditions.checkNotNull(t);
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, ch);
	}

	/**
	 * Write.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param node
	 *        the node
	 * 
	 * 
	 * @throws Exception
	 *         the exception * @see JAXB
	 */
	public static <T> void write(T t, Node node) throws Exception {
		Preconditions.checkNotNull(node);
		Preconditions.checkNotNull(t);
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, node);
	}

	/**
	 * Write.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param os
	 *        the os
	 * 
	 * 
	 * @throws Exception
	 *         the exception * @see JAXB
	 */
	public static <T> void write(T t, OutputStream os) throws Exception {
		Preconditions.checkNotNull(os);
		Preconditions.checkNotNull(t);
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, os);
	}

	/**
	 * Write.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param os
	 *        the os
	 * 
	 * 
	 * @throws Exception
	 *         the exception * @see JAXB
	 */
	public static <T> void write(T t, Result os) throws Exception {
		Preconditions.checkNotNull(os);
		Preconditions.checkNotNull(t);
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, os);
	}

	/**
	 * Write.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param filename
	 *        the filename
	 * 
	 * 
	 * @throws Exception
	 *         the exception * @see JAXB
	 */
	public static <T> void write(T t, String filename) throws Exception {
		Preconditions.checkNotNull(filename);
		Preconditions.checkNotNull(t);
		java.io.File f = checkNotNull(new java.io.File(filename));
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, f);
	}

	/**
	 * Writer input.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param ws
	 *        the ws
	 * 
	 * @see JAXB
	 * @throws Exception
	 *         the exception
	 */
	public static <T> void write(T t, Writer ws) throws Exception {
		Preconditions.checkNotNull(ws);
		Preconditions.checkNotNull(t);
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, ws);
	}

	/**
	 * Write.
	 * 
	 * 
	 * @param t
	 *        the t
	 * @param os
	 *        the os
	 * 
	 * 
	 * @throws Exception
	 *         the exception * @see JAXB
	 */
	public static <T> void write(T t, XMLEventWriter os) throws Exception {
		Preconditions.checkNotNull(os);
		Preconditions.checkNotNull(t);
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, os);
	}

	/**
	 * Write.
	 * 
	 * @param t
	 *        the t
	 * @param os
	 *        the os
	 * @throws Exception
	 *         the exception * @see JAXB * @see entity.HumanResources
	 */
	public static <T> void write(T t, XMLStreamWriter os) throws Exception {
		Preconditions.checkNotNull(os);
		Preconditions.checkNotNull(t);
		JAXBContext context = checkNotNull(JAXBContext.newInstance(t.getClass()));
		Marshaller m = checkNotNull(context.createMarshaller());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(t, os);
	}
}
