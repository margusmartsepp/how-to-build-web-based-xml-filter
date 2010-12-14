package server;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.common.base.Preconditions;
import entity.HumanResources;
import entity.adhoc.JAXB;
import entity.adhoc.PXML;

/**
 * Servlet implementation class Filter
 */
@WebServlet(description = "Filters xml", urlPatterns = { "/filter" }) public class Filter
		extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Filter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override protected void doGet(
			HttpServletRequest req, HttpServletResponse resp) throws ServletException,
			IOException {

		ServletOutputStream os = resp.getOutputStream();
		try {
			String arg1, arg2, f, out = req.getParameter("out");

			if (out == null || out.compareToIgnoreCase("csv") == 0) resp.setContentType("text/plain; charset=utf-8");
			else if (out.compareToIgnoreCase("html") == 0) resp.setContentType("text/html; charset=utf-8");
			else if (out.compareToIgnoreCase("xml") == 0)
				resp.setContentType("application/xml; charset=utf-8");

			java.io.File fileRoot = new java.io.File("/data/testdata.xml");
			System.out.println(fileRoot.getAbsolutePath() + " " + fileRoot.getCanonicalPath());

			HumanResources hm = JAXB.read(HumanResources.class, "/data/testdata.xml");

			Preconditions.checkNotNull(hm);

			if ((f = req.getParameter("f")) == null) {
				// No filter
			} else if (f.equals("1") && (arg1 = req.getParameter("department")) != null//
					&& (arg2 = req.getParameter("month")) != null) {
				try {
					Integer mon = Integer.parseInt(arg2);
					PXML.filter1(hm, arg1);
					PXML.filter2(hm, mon);
					os.println(PXML.filter0(hm));
				} catch (Exception e) {}
				return;
			} else if (f.equals("2") && (arg1 = req.getParameter("decile")) != null) {
				try {
					Double mon = Double.parseDouble(arg1);
					PXML.filter3(hm, mon);
				} catch (Exception e) {}
			} else if (f.equals("3") && (arg1 = req.getParameter("occupation")) != null) {
				PXML.filter4(hm, arg1);
				os.println(PXML.filter0(hm));
			} else if (f.equals("report")) {
				resp.setContentType("application/xml; charset=utf-8");
				StringWriter sw = new StringWriter();
				JAXB.write(PXML.filter5(hm), sw);
				os.println(sw.toString());
				return;
			}

			if (out == null || out.compareToIgnoreCase("csv") == 0) {
				entity.adhoc.PXML.XSLT.toCSV(hm, os);
			} else if (out.compareToIgnoreCase("html") == 0) {
				entity.adhoc.PXML.XSLT.toHTML(hm, os);
			} else if (out.compareToIgnoreCase("xml") == 0) {
				entity.adhoc.PXML.XSLT.toXML(hm, os);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendRedirect("./");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
	}

}
