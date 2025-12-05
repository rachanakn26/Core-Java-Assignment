package javaclass;

public class print6Program {
public static void main(String[] args) {
	System.out.println(checkSix(6,8));
	System.out.println(checkSix(4,2));
	System.out.println(checkSix(8,2));
	System.out.println(checkSix(1,2));
	
}
public static boolean checkSix(int num1,int num2) {
	boolean condition1=(num1==6);
	boolean condition2=(num2==6);
	boolean condition3=(num1+num2==6);
	boolean condition4=(num1-num2==6);
	return condition1||condition2||condition3||condition4;
	
}
}
