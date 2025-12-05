package javaclass;
import java.util.*;
public class numberappears {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int myarr[]=new int[10];
	System.out.println("Enter the array elements");
	for(int i=0;i<myarr.length;i++) {
	myarr[]=sc.nextInt();
	if (myarr[0]==6&&myarr[10]==6) {
		System.out.println(true);
	}
}
}
