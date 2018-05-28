package midterm;

import java.util.Scanner;

public class Exam2_54 {

	public String name;
	public int accNo, balance1, balance2, save, withdraw;
	
	public String toString() {
		String str = "";
		str += "예금주 이름: " + name +"\n";
		str += "계좌번호: " + accNo + "\n";
		str += "잔고: " + Integer.toString(balance2) + "\n";
		return str;
}


public class SaveMoney{
	public void main (String[] args) {
		Exam2_54 acc1 = new Exam2_54();
		acc1.name = "김의진";
		acc1.accNo = 1820340054;
		acc1.save = 8000;
		acc1.balance2 = balance1 + save;
		System.out.println(acc1.toString());
	}	
}

	