package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("endpoint :"+ endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus ) {
		System.out.println("endpoint : "+endpoint + "\n" +  "requestBody : " + requestBody +"\n"+ "requestStatus : " + requestStatus);
	}
	
	

	public static void main(String[] args) {
		
		APIClient apiClient = new APIClient();
		
		apiClient.sendRequest(" http://api.TestLeaf.com/users");
		
		apiClient.sendRequest(" http://api.TestLeaf.com/companies", "status", true);		

	}

}
