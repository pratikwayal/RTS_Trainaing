package Utilities;

import java.util.Date;

public class date_print {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		String date1 = date.toString().replace(" ", "_").replace(":", "-");
		System.out.println(date1);

}
}
