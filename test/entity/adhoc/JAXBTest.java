package entity.adhoc;

import static org.junit.Assert.assertNotNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import org.apache.xalan.templates.StylesheetRoot;
import org.apache.xml.utils.DefaultErrorHandler;
import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.XMLStreamWriter2;
import org.codehaus.stax2.ri.Stax2EventWriterImpl;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;
import org.codehaus.stax2.ri.Stax2WriterAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;
import com.ctc.wstx.api.ReaderConfig;
import com.ctc.wstx.api.WriterConfig;
import com.ctc.wstx.dom.WstxDOMWrappingReader;
import com.ctc.wstx.dom.WstxDOMWrappingWriter;
import com.ctc.wstx.evt.DefaultEventAllocator;
import com.ctc.wstx.evt.WstxEventReader;

/**
 * The class <code>JAXBTest</code> contains tests for the class
 * <code>{@link JAXB}</code>.
 * 
 * @generatedBy CodePro at 6.12.10 1:07
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
public class JAXBTest {
	/**
	 * Run the Object read(Class<T>,InputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_1() throws Exception {
		Class<Object> t = Object.class;
		InputStream is = new ByteArrayInputStream("".getBytes());

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,InputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_2() throws Exception {
		Class<Object> t = Object.class;
		InputStream is = new ByteArrayInputStream("".getBytes());

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,InputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_3() throws Exception {
		Class<Object> t = Object.class;
		InputStream is = new ByteArrayInputStream("".getBytes());

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,InputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_4() throws Exception {
		Class<Object> t = Object.class;
		InputStream is = new ByteArrayInputStream("".getBytes());

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Reader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_5() throws Exception {
		Class<Object> t = Object.class;
		Reader r = new StringReader("");

		Object result = JAXB.read(t, r);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Reader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_6() throws Exception {
		Class<Object> t = Object.class;
		Reader r = new StringReader("");

		Object result = JAXB.read(t, r);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Reader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_7() throws Exception {
		Class<Object> t = Object.class;
		Reader r = new StringReader("");

		Object result = JAXB.read(t, r);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Reader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_8() throws Exception {
		Class<Object> t = Object.class;
		Reader r = new StringReader("");

		Object result = JAXB.read(t, r);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_9() throws Exception {
		Class<Object> t = Object.class;
		String filename = "";

		Object result = JAXB.read(t, filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_10() throws Exception {
		Class<Object> t = Object.class;
		String filename = "";

		Object result = JAXB.read(t, filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_11() throws Exception {
		Class<Object> t = Object.class;
		String filename = "";

		Object result = JAXB.read(t, filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_12() throws Exception {
		Class<Object> t = Object.class;
		String filename = "";

		Object result = JAXB.read(t, filename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,URL) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.net.MalformedURLException.class) public void testRead_13() throws Exception {
		Class<Object> t = Object.class;
		URL url = new URL("");

		Object result = JAXB.read(t, url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,URL) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.net.MalformedURLException.class) public void testRead_14() throws Exception {
		Class<Object> t = Object.class;
		URL url = new URL("");

		Object result = JAXB.read(t, url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,URL) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.net.MalformedURLException.class) public void testRead_15() throws Exception {
		Class<Object> t = Object.class;
		URL url = new URL("");

		Object result = JAXB.read(t, url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,URL) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.net.MalformedURLException.class) public void testRead_16() throws Exception {
		Class<Object> t = Object.class;
		URL url = new URL("");

		Object result = JAXB.read(t, url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_17() throws Exception {
		Class<Object> t = Object.class;
		javax.xml.soap.Node soap = null;

		Object result = JAXB.read(t, soap);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_18() throws Exception {
		Class<Object> t = Object.class;
		javax.xml.soap.Node soap = null;

		Object result = JAXB.read(t, soap);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_19() throws Exception {
		Class<Object> t = Object.class;
		javax.xml.soap.Node soap = null;

		Object result = JAXB.read(t, soap);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_20() throws Exception {
		Class<Object> t = Object.class;
		javax.xml.soap.Node soap = null;

		Object result = JAXB.read(t, soap);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLEventReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_21() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		WstxDOMWrappingReader wstxDOMWrappingReader = WstxDOMWrappingReader.createFrom(
				dOMSource, ReaderConfig.createFullDefaults());
		XMLStreamReader2 xMLStreamReader2 = Stax2ReaderAdapter.wrapIfNecessary(wstxDOMWrappingReader);
		XMLEventReader reader = new WstxEventReader(
				DefaultEventAllocator.getDefaultInstance(), xMLStreamReader2);

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLEventReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_22() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		WstxDOMWrappingReader wstxDOMWrappingReader = WstxDOMWrappingReader.createFrom(
				dOMSource, ReaderConfig.createFullDefaults());
		XMLStreamReader2 xMLStreamReader2 = Stax2ReaderAdapter.wrapIfNecessary(wstxDOMWrappingReader);
		XMLEventReader reader = new WstxEventReader(
				DefaultEventAllocator.getDefaultInstance(), xMLStreamReader2);

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLEventReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_23() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		WstxDOMWrappingReader wstxDOMWrappingReader = WstxDOMWrappingReader.createFrom(
				dOMSource, ReaderConfig.createFullDefaults());
		XMLStreamReader2 xMLStreamReader2 = Stax2ReaderAdapter.wrapIfNecessary(wstxDOMWrappingReader);
		XMLEventReader reader = new WstxEventReader(
				DefaultEventAllocator.getDefaultInstance(), xMLStreamReader2);

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLEventReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_24() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		WstxDOMWrappingReader wstxDOMWrappingReader = WstxDOMWrappingReader.createFrom(
				dOMSource, ReaderConfig.createFullDefaults());
		XMLStreamReader2 xMLStreamReader2 = Stax2ReaderAdapter.wrapIfNecessary(wstxDOMWrappingReader);
		XMLEventReader reader = new WstxEventReader(
				DefaultEventAllocator.getDefaultInstance(), xMLStreamReader2);

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLStreamReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_25() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		XMLStreamReader reader = WstxDOMWrappingReader.createFrom(dOMSource,
				ReaderConfig.createFullDefaults());

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLStreamReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_26() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		XMLStreamReader reader = WstxDOMWrappingReader.createFrom(dOMSource,
				ReaderConfig.createFullDefaults());

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLStreamReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_27() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		XMLStreamReader reader = WstxDOMWrappingReader.createFrom(dOMSource,
				ReaderConfig.createFullDefaults());

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,XMLStreamReader) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testRead_28() throws Exception {
		Class<Object> t = Object.class;
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMSource dOMSource = new DOMSource(stylesheetRoot);
		XMLStreamReader reader = WstxDOMWrappingReader.createFrom(dOMSource,
				ReaderConfig.createFullDefaults());

		Object result = JAXB.read(t, reader);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,InputSource) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_29() throws Exception {
		Class<Object> t = Object.class;
		InputSource is = new InputSource();

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,InputSource) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_30() throws Exception {
		Class<Object> t = Object.class;
		InputSource is = new InputSource();

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,InputSource) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_31() throws Exception {
		Class<Object> t = Object.class;
		InputSource is = new InputSource();

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object read(Class<T>,InputSource) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = javax.xml.bind.UnmarshalException.class) public void testRead_32() throws Exception {
		Class<Object> t = Object.class;
		InputSource is = new InputSource();

		Object result = JAXB.read(t, is);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void write(T,OutputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_1() throws Exception {
		OutputStream os = new ByteArrayOutputStream();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,OutputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_2() throws Exception {
		OutputStream os = new ByteArrayOutputStream();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,OutputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_3() throws Exception {
		OutputStream os = new ByteArrayOutputStream();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,OutputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_4() throws Exception {
		OutputStream os = new ByteArrayOutputStream();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,OutputStream) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_5() throws Exception {
		OutputStream os = new ByteArrayOutputStream();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Writer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_6() throws Exception {
		Writer ws = new StringWriter();

		JAXB.write(null, ws);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Writer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_7() throws Exception {
		Writer ws = new StringWriter();

		JAXB.write(null, ws);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Writer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_8() throws Exception {
		Writer ws = new StringWriter();

		JAXB.write(null, ws);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Writer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_9() throws Exception {
		Writer ws = new StringWriter();

		JAXB.write(null, ws);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Writer) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_10() throws Exception {
		Writer ws = new StringWriter();

		JAXB.write(null, ws);

		// add additional test code here
	}

	/**
	 * Run the void write(T,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_11() throws Exception {
		String filename = "";

		JAXB.write(null, filename);

		// add additional test code here
	}

	/**
	 * Run the void write(T,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_12() throws Exception {
		String filename = "";

		JAXB.write(null, filename);

		// add additional test code here
	}

	/**
	 * Run the void write(T,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_13() throws Exception {
		String filename = "";

		JAXB.write(null, filename);

		// add additional test code here
	}

	/**
	 * Run the void write(T,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_14() throws Exception {
		String filename = "";

		JAXB.write(null, filename);

		// add additional test code here
	}

	/**
	 * Run the void write(T,String) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_15() throws Exception {
		String filename = "";

		JAXB.write(null, filename);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_16() throws Exception {
		javax.xml.soap.Node node = null;

		JAXB.write(null, node);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_17() throws Exception {
		javax.xml.soap.Node node = null;

		JAXB.write(null, node);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_18() throws Exception {
		javax.xml.soap.Node node = null;

		JAXB.write(null, node);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_19() throws Exception {
		javax.xml.soap.Node node = null;

		JAXB.write(null, node);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Node) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_20() throws Exception {
		javax.xml.soap.Node node = null;

		JAXB.write(null, node);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLEventWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.IllegalArgumentException.class) public void testWrite_21() throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(
				printWriter2);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMResult dOMResult = new DOMResult(stylesheetRoot2, stylesheetRoot);
		WstxDOMWrappingWriter wstxDOMWrappingWriter = WstxDOMWrappingWriter.createFrom(
				WriterConfig.createFullDefaults(), dOMResult);
		XMLStreamWriter2 xMLStreamWriter2 = Stax2WriterAdapter.wrapIfNecessary(wstxDOMWrappingWriter);
		XMLEventWriter os = new Stax2EventWriterImpl(xMLStreamWriter2);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLEventWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.IllegalArgumentException.class) public void testWrite_22() throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler2);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		DOMResult dOMResult = new DOMResult(stylesheetRoot2, stylesheetRoot);
		WstxDOMWrappingWriter wstxDOMWrappingWriter = WstxDOMWrappingWriter.createFrom(
				WriterConfig.createFullDefaults(), dOMResult);
		XMLStreamWriter2 xMLStreamWriter2 = Stax2WriterAdapter.wrapIfNecessary(wstxDOMWrappingWriter);
		XMLEventWriter os = new Stax2EventWriterImpl(xMLStreamWriter2);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLEventWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.IllegalArgumentException.class) public void testWrite_23() throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(
				printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler2);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler);
		DOMResult dOMResult = new DOMResult(stylesheetRoot, stylesheetRoot2);
		WstxDOMWrappingWriter wstxDOMWrappingWriter = WstxDOMWrappingWriter.createFrom(
				WriterConfig.createFullDefaults(), dOMResult);
		XMLStreamWriter2 xMLStreamWriter2 = Stax2WriterAdapter.wrapIfNecessary(wstxDOMWrappingWriter);
		XMLEventWriter os = new Stax2EventWriterImpl(xMLStreamWriter2);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLEventWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.IllegalArgumentException.class) public void testWrite_24() throws Exception {
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler2);
		DOMResult dOMResult = new DOMResult(stylesheetRoot, stylesheetRoot2);
		WstxDOMWrappingWriter wstxDOMWrappingWriter = WstxDOMWrappingWriter.createFrom(
				WriterConfig.createFullDefaults(), dOMResult);
		XMLStreamWriter2 xMLStreamWriter2 = Stax2WriterAdapter.wrapIfNecessary(wstxDOMWrappingWriter);
		XMLEventWriter os = new Stax2EventWriterImpl(xMLStreamWriter2);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLEventWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.IllegalArgumentException.class) public void testWrite_25() throws Exception {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter2 = new PrintWriter(stringWriter);
		DefaultErrorHandler defaultErrorHandler = new DefaultErrorHandler(
				printWriter2);
		StylesheetRoot stylesheetRoot = new StylesheetRoot(defaultErrorHandler);
		StringWriter stringWriter2 = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter2);
		DefaultErrorHandler defaultErrorHandler2 = new DefaultErrorHandler(
				printWriter);
		StylesheetRoot stylesheetRoot2 = new StylesheetRoot(defaultErrorHandler2);
		DOMResult dOMResult = new DOMResult(stylesheetRoot, stylesheetRoot2);
		WstxDOMWrappingWriter wstxDOMWrappingWriter = WstxDOMWrappingWriter.createFrom(
				WriterConfig.createFullDefaults(), dOMResult);
		XMLStreamWriter2 xMLStreamWriter2 = Stax2WriterAdapter.wrapIfNecessary(wstxDOMWrappingWriter);
		XMLEventWriter os = new Stax2EventWriterImpl(xMLStreamWriter2);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLStreamWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_26() throws Exception {
		XMLStreamWriter os = Stax2WriterAdapter.wrapIfNecessary((XMLStreamWriter) null);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLStreamWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_27() throws Exception {
		XMLStreamWriter os = Stax2WriterAdapter.wrapIfNecessary((XMLStreamWriter) null);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLStreamWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_28() throws Exception {
		XMLStreamWriter os = Stax2WriterAdapter.wrapIfNecessary((XMLStreamWriter) null);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLStreamWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_29() throws Exception {
		XMLStreamWriter os = Stax2WriterAdapter.wrapIfNecessary((XMLStreamWriter) null);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,XMLStreamWriter) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_30() throws Exception {
		XMLStreamWriter os = Stax2WriterAdapter.wrapIfNecessary((XMLStreamWriter) null);

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Result) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_31() throws Exception {
		Result os = new DOMResult();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Result) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_32() throws Exception {
		Result os = new DOMResult();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Result) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_33() throws Exception {
		Result os = new DOMResult();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Result) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_34() throws Exception {
		Result os = new DOMResult();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,Result) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_35() throws Exception {
		Result os = new DOMResult();

		JAXB.write(null, os);

		// add additional test code here
	}

	/**
	 * Run the void write(T,ContentHandler) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_36() throws Exception {
		ContentHandler ch = new DefaultHandler();

		JAXB.write(null, ch);

		// add additional test code here
	}

	/**
	 * Run the void write(T,ContentHandler) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_37() throws Exception {
		ContentHandler ch = new DefaultHandler();

		JAXB.write(null, ch);

		// add additional test code here
	}

	/**
	 * Run the void write(T,ContentHandler) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_38() throws Exception {
		ContentHandler ch = new DefaultHandler();

		JAXB.write(null, ch);

		// add additional test code here
	}

	/**
	 * Run the void write(T,ContentHandler) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_39() throws Exception {
		ContentHandler ch = new DefaultHandler();

		JAXB.write(null, ch);

		// add additional test code here
	}

	/**
	 * Run the void write(T,ContentHandler) method test.
	 * 
	 * @throws Exception
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Test(expected = java.lang.NullPointerException.class) public void testWrite_40() throws Exception {
		ContentHandler ch = new DefaultHandler();

		JAXB.write(null, ch);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 * 
	 * @throws Exception
	 *         if the initialization fails for some reason
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@Before public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 * 
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	@After public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 * 
	 * @param args
	 *        the command line arguments
	 * 
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JAXBTest.class);
	}
}
