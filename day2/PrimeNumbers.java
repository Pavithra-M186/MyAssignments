package week1.day2;



public class PrimeNumbers {

	

	/*

	 * Goal: To find whether a number is a Prime number or not

	 * 

	 * input: 13

	 * output: 13 is a Prime Number

	 * 

	 * Shortcuts:

	 * 1) Print : type: syso, followed by: ctrl + space + enter

	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter

	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter

	 *   

	 * What are my learnings from this code?

	 * 1)

	 * 2)

	 * 3) 

	 * 

	 */
	public static void main(String[] args) {
		int Input=13;
		boolean flag=false;
		for (int i = 2; i <= Input/2; i++) {
			if (Input%i ==0) {
				flag=true;
				break;
			}
		}
	    if(flag==false) 
			System.out.println(Input+" is a prime number.");
		
		else 
			System.out.println(Input+" is not a prime number.");
		
   }

}