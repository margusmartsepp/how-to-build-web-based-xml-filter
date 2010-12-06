import java.util.Date;
import org.joda.time.DateTime;
import entity.CompensationDateSpan;

public class manual {
	static Date d1 = new DateTime(2010, 12, 6, 0, 0, 0, 0).toDate();
	static Date d2 = new DateTime(2010, 12, 7, 0, 0, 0, 0).toDate();
	static Long l1 = new Long(1L);
	public static void main(String[] args) {

		Long id = new Long(1L);
		Date start = d2;
		Date end = d1;
		boolean compensated = true;
		new CompensationDateSpan(id, start, end, compensated);
	}
}
