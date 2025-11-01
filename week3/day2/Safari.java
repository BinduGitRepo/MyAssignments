package week3.day2;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("readerMode  from Safari class");
	}
	
	public void fullScreenMode() {
	  System.out.println("fullScreenMode from Safari class");	
	}

	public static void main(String[] args) {
		
		Safari safari = new Safari();
		
		safari.browserName = "Safari";
		safari.browserVersion = "18.4";
		
		System.out.println("browser name :" + safari.browserName + " browser Version : "+ safari.browserVersion);
				
		safari.openURL();
		safari.fullScreenMode();
		safari.readerMode();
		safari.closeBrowser();
		
	}

}
