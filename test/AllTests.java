import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import entity.CompensationDateSpanTest;
import entity.ContactInfoTest;
import entity.DataTest;
import entity.EmployeeTest;
import entity.PersonTest;

/**
 * The class <code>AllTests</code> builds a suite that can be used to run all of
 * the tests within its package as well as within any subpackages of its
 * package.
 * 
 * @generatedBy CodePro at 6.12.10 1:07
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class) @Suite.SuiteClasses({ CompensationDateSpanTest.class,
		ContactInfoTest.class, DataTest.class, EmployeeTest.class, PersonTest.class }) public class AllTests {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests.class);
	}
}
