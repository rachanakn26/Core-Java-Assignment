package javaclass;

import java.util.Scanner;

public class countside_by_side {
	public static void countAdjacent(int arr[]) {
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
		}
		System.out.println(count);
}	
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int arr[]=new int[6];
	System.out.println("Enter the array Elements");
	for (int i = 0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int result=countAdjacent(arr);
	System.out.println(results);
}
}
