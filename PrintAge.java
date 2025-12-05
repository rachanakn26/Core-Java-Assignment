package javaclass;
import java.util.*;
public class PrintAge {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Age");
	int age=sc.nextInt();
	if (age>=0 && age <=12) {
		System.out.println("kid");
	}
	else if(age>=13 && age<=19) {
		System.out.println("teenager");
	}
	else if(age>=20 && age<=40) {
		System.out.println("youngstar");
    }
	else if(age>=41 && age<=55) {
		System.out.println("aged man");
	}
	else if(age>=56 && age<=70) {
		System.out.println("teenager");
	}
}
}
