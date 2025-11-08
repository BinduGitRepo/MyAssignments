package week4.day1;

public class Amazon extends CanaraBank {
	
	public static void main(String[] args) {
	
		Amazon az= new Amazon();
		az.cardPayments();
		az.cashOnDelivery();
		az.internetBanking();
		az.recordPaymentDetails();
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("pay cash On Delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("payment is through upiPayments");		
	}

	@Override
	public void cardPayments() {
		System.out.println("Payments is done using card");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking");
		
	}

}
