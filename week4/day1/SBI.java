package week4.day1;

public class SBI implements RBI {

	@Override
	public void kyc() {
	System.out.println("Addhar card");		
	}
	
	public void goldLoan() {
		System.out.println("interest rate is 5%");
	}
	
	public static void main(String[] args) {
	SBI sb = new SBI();
	sb.kyc();
	sb.withDrawalLimit();
	}

}
