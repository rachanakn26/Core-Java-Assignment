package javaclass;

import java.util.Scanner;

public class cricket {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  team1 score");
	int teamscore1=sc.nextInt();
	System.out.println("Enter team2 score");
	int teamscore2=sc.nextInt();
	
	if(teamscore1>200 && teamscore2<220){
		System.out.println("invalid input");
	}
	if(teamscore1<teamscore2) {
		System.out.println("teamscore2 won the match");
	}
	else if(teamscore1>teamscore2) {
		System.out.println("teamscore1 won the match");
	}
	else if(teamscore1==teamscore2) {
		System.out.println("The match is tie");
	}
}
}
