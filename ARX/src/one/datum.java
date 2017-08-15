package one;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class datum {
	public static String date() {
		String datum = new String();
		datum="-1";
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		datum=(dateFormat.format(cal.getTime()));
		
		return datum;
	}
}
