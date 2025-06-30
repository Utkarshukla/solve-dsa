package dsa.Math;
/**
 * @id 005
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
public class gcdOfTowNumbers {

	// Brute force 
	public static int getGCD(int a, int b) {
		int min =Math.min(a, b);
		int gsd=1;
		for(int i=1; i<=min/2;i++) {
			if(a%i==0 && b%i==0) {
				gsd=i;
			}
		}
		return gsd;
	}
	
	// Euclidean Algorithm ( O(log(min))
	public static int eaGetGCD(int a, int b) {
		while(b !=0) {
			int temp =b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(getGCD(20,30));
		System.out.println(eaGetGCD(30,20));
		System.out.println(eaGetGCD(20,30));

	}

}
