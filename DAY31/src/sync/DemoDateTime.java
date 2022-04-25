package sync;

import java.time.LocalDateTime;
import java.time.ZoneId;
public class DemoDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime ld=LocalDateTime.now(ZoneId.of("GMT"));
System.out.println(ld);
	}

}