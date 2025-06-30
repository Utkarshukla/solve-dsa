package dsa.Math;

/**
 * @id 007
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */

class Prime{
	
	// brute force
	public boolean isPrime2(int n) {
	    if (n <= 1) return false;
	    if (n == 2) return true;
	    if (n % 2 == 0) return false;

//	    for (int i = 3; i <= Math.sqrt(n); i += 2) {
	    	for (int i = 3; i*i <= n; i += 2) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	
	// brute force 2
		public boolean isPrime(int n) {
		    if (n <= 1) return false;
		    if (n == 2) return true;
		    if (n % 2 == 0 || n%3 ==0) return false;

//		    for (int i = 3; i <= Math.sqrt(n); i += 2) {
		    	for (int i = 5; i*i <= n; i += 6) {
		        if (n % i == 0 || (n+2)%i==0) return false;
		        System.out.println(i);
		    }
		    return true;
		}

	
	
}
public class PrimeNumber {
	public static void main(String[] args) {
		Prime p = new Prime();
		int n=1031;
		if(p.isPrime(n))
			System.out.print("Prime");
		else
			System.out.print("not prime");

	}

}
