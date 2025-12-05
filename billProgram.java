package javaclass;

import java.util.*;

public class billProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total amount");
		double amount = sc.nextDouble();
		double discount = 0;
		if (amount > 2000) {
			discount = amount * 15 / 100;
		} else if (amount > 1000) {
			discount = amount * 8 / 100;
		} else {
			discount = 0;
		}
		double finalamount = amount - discount;
		System.out.println("Original amount=" + amount);
		System.out.println("Discount applied=" + discount);
		System.out.println("final amount=" + finalamount);
	}
}
