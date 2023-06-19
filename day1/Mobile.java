package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="Oppo";
		double mobileWeight=8.5;
				
		System.out.println("Make call");
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=25000;
		System.out.println("Send Message");
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
		
	}

	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my Mobile");
	

	}

}
