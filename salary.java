package javaclass;

public class salary {
	public static void main(String[] args) {
		int HRA=20000; int DA=10000; int basic=20000;
		int totalsalary=HRA+DA+basic;
		double tax=totalsalary*15/100;
		double netsalary=totalsalary-tax;
		System.out.println("Total salary is"+totalsalary);
		System.out.println("Net salary is"+netsalary);
	}
}
