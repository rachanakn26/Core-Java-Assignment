package javaclass;

public class methoddemo {
	public static void main(String[] args) {
		boolean value =canVote(20);
		if(value)
			System.out.println("can vote");
		else
			System.out.println("cannot vote");
	}
	public static boolean canVote(int age)
	{
		if(age>18) {
			return true;
		}
		else {
			return false;
		}
	}
}