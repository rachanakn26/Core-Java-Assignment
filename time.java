package javaclass;
import java.util.*;
public class time {
public static void main(String[] args) {
	Scanner sc= new Scanner( System.in);
	System.out.println("enter the time");
	int n=sc.nextInt();
    printTime(1);
}
public static String printTime(int n) {
	if (n>=1&&n<=12) {
		return "am";
	}
	else if (n>=13&&n<=24){
		return "pm";
	}
	else
		return "invalid input";
	
}
}
