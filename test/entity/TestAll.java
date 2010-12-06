package entity;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 6.12.10 1:07
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	StringToDoubleMapAdapterTest.class,
	HumanResourcesTest.class,
	CompensationDateSpanTest.class,
	ObjectFactoryTest.class,
	EmployeeTest.class,
	DataTest.class,
	ReportTest.class,
	PersonTest.class,
	MapTypeEntryTest.class,
	ContactInfoTest.class,
	entity.adhoc.TestAll.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6.12.10 1:07
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
