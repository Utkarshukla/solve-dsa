/**
 * @id 008
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
package dsa.Math;
import java.util.ArrayList;
import java.util.List;
class PrimeF{
	private static boolean isPrime(int n) {
		if(n<=1) return false;
		if(n==2) return true;
		if(n==3) return true;
		if(n%2==0 || n%3==0) return false;
		for(int i=5;i*i<=n;i+=6) {
			if(n%i==0 ||  n % (i + 2) == 0) return false;
		}
		return true;
	}
	
	// nieve solution  
	public List<Integer> primeFactor(int n) {
		List<Integer> factors = new ArrayList<>();
		if (n <= 1) return factors;
		for(int i=2; i*i<=n;i++) {
			if(isPrime(i)) {
				int x=i;
				while(n%x==0) {
					factors.add(i);
					x=x*i;
				}
			}
		}
		return factors;
	}
	
	// efficient
	public List<Integer> primeFactorEfficient(int n) {
		List<Integer> factors = new ArrayList<>();
		if (n <= 1) return factors;
		while(n%2==0) {
			factors.add(2);
			n=n/2;
		}
		while(n%3==0) {
			factors.add(3);
			n=n/3;
		}
		for(int i=5; i*i<=n;i+=6) {
			while(n%i==0) {
				factors.add(i);
				n=n/i;
			}
			while(n%(i+2)==0) {
				factors.add(i+2);
				n=n/(i+2);
			}
			
		}
		if(n>3)
			factors.add(n);
		return factors;
	}
	
}
public class PrimeFactor {

	public static void main(String[] args) {
		PrimeF p= new PrimeF();
		System.out.println(p.primeFactor(13195));
		System.out.println(p.primeFactorEfficient(13195));

	}

}
