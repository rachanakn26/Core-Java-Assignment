package javaclass;

public class year {
	public static void main(String[] args) {
		int year = 2006;
		if(isleapyear(year)) {
			System.out.println(year+"is a leap year");
		}
		else
			System.out.println(year+"is not leap year");
	}
	public static boolean isleapyear (int year) {
		return (year%4==0 && year%100!=0) || (year%400==0);
	}
}
