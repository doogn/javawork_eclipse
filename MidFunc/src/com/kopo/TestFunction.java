package com.kopo;

public class TestFunction {

	public static int getLen(String inputData) {

		int returnValue = inputData.length();
		
		return returnValue;
	}
	
	
	
	//유틸리티 함수를 담는다
	public static void main(String[] args) {
		
		String testValue = "abcdefg";
		
		int resultValue = getLen(testValue);
		
		System.out.println(resultValue);
		
	}


	
}
