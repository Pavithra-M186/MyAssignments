package week1.day2;

public class NegnumtoPosnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=-40;
		if(number<1) {
			int x= number * -1;
			System.out.println("The number "+ number +" is converted to " +x);	
		}
		else {
			System.out.println(number +" is already a positive number.");
		}

	}

}
