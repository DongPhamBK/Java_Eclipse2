 package format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert {
public static void main(String[] args) throws ParseException {
	String ng  = "10-03-2019";
	String pattern = "dd-MM-yyyy";
	SimpleDateFormat p = new SimpleDateFormat(pattern);
	Date date= p.parse(ng);
	System.out.println(date);
	// nhìn kĩ vào nhé !
}
}
