package dateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Java8Date_time {

	public static void main(String[] args) {

		ZoneId zid=ZoneId.of("GMT+05:30");
		LocalDate lde=LocalDate.now();
		System.out.println("date= "+lde);
		System.out.println("Java8Date_time.main()"+lde.atStartOfDay(zid));
		System.out.println("Java8Date_time.main()"+LocalDate.now(zid));
		System.out.println("Java8Date_time.main()"+new Date());
	}

}
