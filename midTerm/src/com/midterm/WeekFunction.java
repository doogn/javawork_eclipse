package com.midterm;

public class WeekFunction {

	public static int getWeekInfo(String yearWeek){
		String week = yearWeek.substring(4);
		int weekInfo = Integer.parseInt(week);
		return weekInfo;
	}

	public static void main(String[] args) {
		String testValue = "201612";
		int answer = getWeekInfo(testValue);
		System.out.println("The answer is " + answer);
	}

}