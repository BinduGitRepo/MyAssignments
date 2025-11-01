package week3.day2;

public class Chrome  extends Browser {
	
	
	public void openIncognito() {
		System.out.println("openIncognito  from Chrome class");
	}
	
	public void clearCahe() {
	  System.out.println("clear cache from chrome");	
	}
	
	

	public static void main(String[] args) {
		
		Chrome chrome = new Chrome();
		
		chrome.browserName="Chrome";
		System.out.println(chrome.browserName);
		
		chrome.browserVersion="141.0.7";
		System.out.println(chrome.browserVersion);
		
		chrome.openURL();
		chrome.clearCahe();
		chrome.openIncognito();
		

	}

}
