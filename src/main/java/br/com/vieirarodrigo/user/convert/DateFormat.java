package br.com.vieirarodrigo.user.convert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static String getDateFormat() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}