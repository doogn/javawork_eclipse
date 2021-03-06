package com.ejk;

public class MathFunction {

	// 표준편차 구하는 함수

	public static void validateNotNull(Object x) {
        if (x == null)
            throw new IllegalArgumentException("argument is null");
    }
	
	public static double sum(double[] a) {
        validateNotNull(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
	
	public static double mean(double[] a) {
        validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double sum = sum(a);
        return sum / a.length;
    }
	
	public static double var(double[] a) {
		validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (a.length - 1);
    }
	
	public static double stddev(double[] a){
        validateNotNull(a);
        return Math.sqrt(var(a));
	}
	

	// 예전 함수
	
	public static double ejRound(Double targetValue, int sequence){
		double decimal = Math.pow(10, sequence);
		double returnValue = Math.round(targetValue*decimal)/decimal;
		return returnValue;
	}
	
	public static void main(String[] args) {
		double testValue = 12.23522;
		double answer = ejRound(testValue, 2);
		System.out.println("The answer is " + answer);
	}

}
