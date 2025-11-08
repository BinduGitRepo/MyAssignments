package week4.day1;

public interface RBI {
	
	public void kyc();
	
	public  default void withDrawalLimit() {
		System.out.println("withdrawal limit is 100000");
		
	}
	public static void bankBalance() {
		System.out.println("balance is 2000");
	}

}
