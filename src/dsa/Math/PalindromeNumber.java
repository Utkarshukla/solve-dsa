package dsa.Math;
/**
 * @id 002
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
public class PalindromeNumber {
	public static boolean isPalindromeNum(int n) {
		// basic 
//		if(n==0)
//			return true;
//		int nEW =0;
//		int old=n;
//		while(n>0) {
//			nEW =nEW*10+ n%10;
//			n =(int) n/10;
//		}
//		if(old==nEW)
//			return true;
//		return false;
		
		// advance 
		 if (n < 0 || (n % 10 == 0 && n != 0)) {
		        return false;
		 }

		 int reversedHalf = 0;
		 while (n > reversedHalf) {
		     reversedHalf = reversedHalf * 10 + n % 10;
		     n /= 10;
		 }
//		 System.out.println(n + " " + reversedHalf); // 78 789
//		 System.out.println(reversedHalf/10 ); // 78 78
		return (n == reversedHalf || n == reversedHalf / 10);
		
	}
	public static void main(String[] args) {
		
		int n = 78987;
		System.out.println(isPalindromeNum(n));
	}

}
