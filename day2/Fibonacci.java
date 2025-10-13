package week1.day2;

public class Fibonacci{

	void fibonacciSeries(int n) {
		int n1=0,n2=1;

		for(int i=0;i<n;i++) {

			System.out.print(n1 + " ");
			int n3 = n2+ n1;
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {

		int n = 8;

		Fibonacci fibo = new Fibonacci();
		fibo.fibonacciSeries(n);

	}

}
