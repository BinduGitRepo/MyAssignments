package week3.day2;

public class LoginTestData extends TestData{
	
String username, password;
	
	public void enterUserName(String username) {
		
		System.out.println("UserName:"+username);
		this.username = username;
	}
	
	public void enterPassword(String password) {
	
		System.out.println("password: "+ password);
		this.password = password;
	}

	public static void main(String[] args) {
		
		TestData testData = new TestData();
		LoginTestData loginTestData = new LoginTestData();
		
		testData.enterCredentials();
		loginTestData.enterUserName("TestLeaf");
		loginTestData.enterPassword("cms");
		
		testData.navigatToHomePage();

	}

}
