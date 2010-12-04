package entity.adhoc;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.joda.time.DateTime;
import com.google.common.base.Predicate;
import entity.Employee;
import entity.Employee.Data.CompensationDateSpan;
import entity.HumanResources;
import entity.Report;

// TODO: Auto-generated Javadoc
/**
 * <img style="float:right; height=12em;" src="doc-files/clap.gif">
 * <p>
 * After doing the heavy lifting of creating, annotating and commenting the data
 * structure and its behavior, then this ad-hoc class provides the data
 * filtering predicates.
 * <p>
 * Contains:
 * <ul>
 * <li>{@link #filter0(HumanResources)}
 * <li>{@link #filter1(HumanResources, String)}
 * <li>{@link #filter2(HumanResources, int)}
 * <li>{@link #filter3(HumanResources, Double)}
 * <li>{@link #filter4(HumanResources, String)}
 * </ul>
 * 
 * @see XSLT
 * @see JAXB
 * @see entity.Employee
 * @see entity.HumanResources
 * @author Margus Martsepp
 * 
 */
public class PXML {
	/**
	 * <img style="float:right; height=12em;" src="doc-files/bruteforce.jpg">
	 * <p>
	 * Note: This class contains AppEngine workaround hack in static context. Lack
	 * of it caused most annoying bug when initiating xslt transformation. This is
	 * also the sole reason why xalan implementation is needed :P.
	 * <p>
	 * 
	 * @see PXML
	 * @see JAXB
	 * @see entity.Employee
	 * @see entity.HumanResources
	 * @author Margus Martsepp
	 * 
	 */
	public static class XSLT {

		static {
			System.setProperty("javax.xml.transform.TransformerFactory",
					"org.apache.xalan.xsltc.trax.TransformerFactoryImpl");
		}

		/**
		 * T writer.
		 * 
		 * @param fXML
		 *        the f xml
		 * @param fXSL
		 *        the f xsl
		 * @param sw
		 *        the sw
		 * @return the writer
		 * @throws TransformerException
		 *         the transformer exception
		 * @see PXML
		 * @see XSLT
		 */
		public static Writer tWriter(String fXML, String fXSL, Writer sw) throws TransformerException {
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer(new StreamSource(fXSL));
			transformer.transform(new StreamSource(fXML), new StreamResult(sw));
			return sw;
		}

		/**
		 * T writer.
		 * 
		 * @param fXML
		 *        the f xml
		 * @param fXSL
		 *        the f xsl
		 * @param sw
		 *        the sw
		 * @return the writer
		 * @throws TransformerException
		 *         the transformer exception
		 * @see PXML
		 * @see XSLT
		 */
		public static Writer tWriter(Reader fXML, String fXSL, Writer sw) throws TransformerException {
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer(new StreamSource(fXSL));
			transformer.transform(new StreamSource(fXML), new StreamResult(sw));
			return sw;
		}

		/**
		 * T writer.
		 * 
		 * <pre>
		 * java.util.Scanner sc = new java.util.Scanner(new File(fXSL));
		 * while (sc.hasNext()) {
		 * 	o.println(sc.next());
		 * }
		 * </pre>
		 * 
		 * @param fXML
		 *        the f xml
		 * @param fXSL
		 *        the f xsl
		 * @param os
		 *        the os
		 * @throws TransformerException
		 *         the transformer exception
		 * @throws IOException
		 * @see PXML
		 * @see XSLT
		 */
		public static void tWriter(Reader fXML, String fXSL, OutputStream os) throws TransformerException,
				IOException {

			String xsl = readFileAsString(fXSL);
			StringReader rxsl = new StringReader(xsl);
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer(new StreamSource(rxsl));
			transformer.transform(new StreamSource(fXML), new StreamResult(os));
		}

		/**
		 * To xml.
		 * 
		 * @param hm
		 *        the hm
		 * @param os
		 *        the os
		 * @throws Exception
		 *         the exception
		 * @see PXML
		 * @see XSLT
		 */
		public static void toXML(HumanResources hm, OutputStream os) throws Exception {
			JAXB.write(hm, os);
		}

		/**
		 * To html.
		 * 
		 * @param hm
		 *        the hm
		 * @param os
		 *        the os
		 * @throws Exception
		 *         the exception
		 * @see PXML
		 * @see XSLT
		 */
		public static void toHTML(HumanResources hm, OutputStream os) throws Exception {
			StringWriter sw = new StringWriter();
			JAXB.write(hm, sw);
			StringReader sr = new StringReader(sw.toString());
			tWriter(sr, "data//xsl//simple.xsl", os);
		}
		public static String readFileAsString(String filePath) throws java.io.IOException {
			byte[] buffer = new byte[(int) (new java.io.File(filePath)).length()];
			BufferedInputStream f = null;
			try {
				f = new BufferedInputStream(new FileInputStream(filePath));
				f.read(buffer);
			} finally {
				if (f != null) try {
					f.close();
				} catch (IOException ignored) {}
			}
			return new String(buffer);
		}
		/**
		 * To cvs.
		 * 
		 * @param hm
		 *        the hm
		 * @param os
		 *        the os
		 * @throws Exception
		 *         the exception
		 * @see PXML
		 * @see XSLT
		 */
		public static void toCVS(HumanResources hm, OutputStream os) throws Exception {
			StringWriter sw = new StringWriter();
			JAXB.write(hm, sw);
			StringReader sr = new StringReader(sw.toString());
			tWriter(sr, "data//xsl//csv.xsl", os);
		}
	}

	/**
	 * Filter0.
	 * 
	 * @param hm
	 *        the hm
	 * @return the int
	 * @see PXML
	 */
	public static int filter0(HumanResources hm) {
		return hm.size();
	}

	/**
	 * Filter1.
	 * 
	 * @param hm
	 *        the hm
	 * @param department
	 *        the department
	 * @see PXML
	 */
	public static void filter1(HumanResources hm, final String department) {
		hm.filter(new Predicate<Employee>() {
			@Override public boolean apply(Employee em) {
				return em.getData().getDepartmentTitle().equalsIgnoreCase(
						department.trim()) ? true : false;
			}
		});
	}

	/**
	 * Filter2.
	 * 
	 * @param hm
	 *        the hm
	 * @param month
	 *        the month
	 * @see PXML
	 */
	public static void filter2(HumanResources hm, final int month) {
		hm.filter(new Predicate<Employee>() {
			@Override public boolean apply(Employee em) {
				Date now = new Date();
				for (CompensationDateSpan vs : em.getData().getVacation()) {
					if (vs == null) continue;
					if (vs.getEnd().compareTo(now) >= 0) //
						if (new DateTime(vs.getStart()).getMonthOfYear() == month || new DateTime(
								vs.getEnd()).getMonthOfYear() == month) //
							return true;
				}
				return false;
			}
		});
	}

	/**
	 * Filter3.
	 * 
	 * @param hm
	 *        the hm
	 * @param size
	 *        the size
	 * @see PXML
	 */
	public static void filter3(HumanResources hm, final Double size) {
		hm.filter(new Predicate<Employee>() {
			@Override public boolean apply(Employee em) {
				return em.getData().getHourRate() > size ? true : false;
			}
		});
	}

	/**
	 * Filter4.
	 * 
	 * @param hm
	 *        the hm
	 * @param job
	 *        the job
	 * @see PXML
	 */
	public static void filter4(HumanResources hm, final String job) {
		hm.filter(new Predicate<Employee>() {
			@Override public boolean apply(Employee em) {
				return em.getData().getOccupationTitle().equalsIgnoreCase(job.trim());
			}
		});
	}
	public static Report filter5(HumanResources hm) {
		Report r = new Report();

		for (Employee em : hm) {
			r.push(em.getData().getDepartmentTitle(), em.getData().getHourRate());
		}
		return r;
	}
}
