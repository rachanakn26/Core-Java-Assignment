package javaclass;
import java.util.*;
public class SecondProgramArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] myarr={12,32,42,14,56,78,98,45,98,12};

	System.out.println("Enter start index");
	int startindex=sc.nextInt();
	System.out.println("Enter end index");
	int endindex=sc.nextInt();
	SecondProgramArray.subArray(myarr,startindex,endindex);
}
public static void subArray(int myarr[], int startindex, int endindex) {
	for (int i=startindex; i<=endindex; i++) {
		System.out.println(myarr[i]);
	}
}
}




