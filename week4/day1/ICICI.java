package week4.day1;

public class ICICI extends SingaporeBank {
	

	public void kyc() {
		System.out.println("DrivingLicense");
	}
	
	public void cibilScore() {
		System.out.println("100");
	}
	
	public static void main(String[] args) {
		ICICI ic =new ICICI();
		ic.convertCurrency();
		ic.cibilScore();
	}

}
