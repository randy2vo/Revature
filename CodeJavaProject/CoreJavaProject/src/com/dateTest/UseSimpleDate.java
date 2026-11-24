package com.dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UseSimpleDate {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String FormattedDate = sdf.format(date);
		System.out.println(date);
		System.out.print(FormattedDate);
		
		
		

	}

}
