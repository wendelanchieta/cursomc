/**
 * 
 */
package com.wendelanchieta.cursomc.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author wendel.anchieta
 *
 */
public class TimeUtil {

	public TimeUtil() {
	}

	public static void main(String[] args) {
		
		TimeZone tz = Calendar.getInstance().getTimeZone();
		System.out.println("Fuso :       " + tz.getDisplayName());
		System.out.println("TimeZone :   " +  tz.getID());
		
		Date date = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
		System.out.println("Data do JVM: "+ sdf.format(date));
	}

}
