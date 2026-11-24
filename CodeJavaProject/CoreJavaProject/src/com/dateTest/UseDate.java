package com.dateTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UseDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		LocalDate newDate = LocalDate.of(2026,02,14);
		System.out.println(newDate);
		
		
		System.out.println("Year: " + today.getYear());
		System.out.println("Month: " + today.getMonth());
		System.out.println("Day: " + today.getDayOfMonth());
		System.out.println("Day of week: " + today.getDayOfWeek());
		
		System.out.println("After 10 days: " + today.plusDays(10));
		System.out.println("Two months ago: " + today.minusMonths(2));
		System.out.println("After 1 year: " + today.plusYears(1));
		
		Period per = Period.between(newDate, today);
		System.out.println(per);
		System.out.println(per.getYears());
		System.out.println(per.getDays());
		System.out.println(per.getMonths());
		
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = today.format(outputFormatter);
		System.out.println(formattedDate);
		
		String inputDate = "02-11-2003";
		LocalDate dateFormat = LocalDate.parse(inputDate, outputFormatter);
		System.out.println(dateFormat);

		
	}

}
