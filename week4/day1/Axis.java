package week4.day1;

public class Axis implements RBI,HDFC {
	
	@Override
	public void kyc() {
		System.out.println("Pancard");
	}
	
	public void goldLoan() {
		System.out.println("GoldLoan");
	}
	
	


	public static void main(String[] args) {
		Axis axis = new Axis();
		axis.goldLoan();
		axis.withDrawalLimit();
		axis.kyc();
		axis.creditCard();

	}

	@Override
	public void creditCard() {
		System.out.println("limit is 50000");
		
	}

	
}
