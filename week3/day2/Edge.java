package week3.day2;

public class Edge  extends Browser {
	
	public void takeSnap() {
		System.out.println("takeSnap");
	}
	
	public void clearCookies() {
	  System.out.println("clear cookies from Edge");	
	}

	public static void main(String[] args) {
		
		Edge edge = new Edge();
		
		edge.browserName = "Edge";
		edge.browserVersion = "141.0";
		
		System.out.println("browser name :" + edge.browserName + " browser Version : "+ edge.browserVersion);
				
		
		edge.openURL();
		edge.takeSnap();

	}

}
