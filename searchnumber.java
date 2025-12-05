package javaclass;
import java.util.*;
public class searchnumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.println("Enter the array elements");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter array element to search");
	int search=sc.nextInt();
	boolean found=false;
	for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				found=true;
				break;
			}
	}
		if (found) {
			System.out.println(search+"element is in the array");
		}else {
			System.out.println("The" +search+" element is not in the array");
		}
	}
}

