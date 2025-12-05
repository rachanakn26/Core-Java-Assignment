package javaclass;

public class small_and_large {
	public static void main(String[] args) {
		int a=20, b=40, c=15;
		int smallest=findSmallest(a,b,c);
		int largest=findLargest(a,b,c);
		System.out.println("smallest number="+smallest);
		System.out.println("largest number"+largest);
	}
	    public static int findSmallest(int a,int b,int c) {
	    	return Math.min(a, Math.min(b, c));
	    }
	    public static int findLargest(int a,int b,int c) {
	    	return Math.max(a, Math.max(b, c));
	}
}
