package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int originalNum =34343;
		int num=originalNum;
		int temp=0;
		System.out.println(num);
		for (;num != 0;num=num/10) {
		      int rem = num % 10;
		      temp = temp * 10 + rem;     
		}
		if (originalNum == temp) {
		      System.out.println("The given number is Palindrome.");
		    }
		    else {
		      System.out.println( "The given number is not Palindrome.");
		    }			
			
		}
		
}


