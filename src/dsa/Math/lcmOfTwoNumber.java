package dsa.Math;
/**
 * @id 006
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
class LCM{
	// brute force way 
	public int getLCM(int a, int b) {
		int res= Math.max(a, b);
		while(true) {
			if(res%a==0 && res%b==0) {
				return res;
			}
			res++;
		}
	}
	
	// a*b = gcd(a,b) * lcm(a,b)
	public int getFastLCM(int a,int b) {
		int x = a, y = b; 
		// cal gcd 
		while(b!=0) {
			int temp = b;
			b=a%b;
			a=temp;
		}
		// gcd =a;

	    int gcd = a;

		return (x*y)/gcd;
	}
	
}
public class lcmOfTwoNumber {
	public static void main(String[] args) {
		LCM l= new LCM();
		System.out.println(l.getLCM(12, 15));
		System.out.println(l.getFastLCM(12, 15));

	}

}
