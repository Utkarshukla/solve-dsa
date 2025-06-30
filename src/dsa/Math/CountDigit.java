package dsa.Math;

/**
 * @id 001
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */

public class CountDigit {

	public static int countDigit(int n) {
		// basic 
//		int count = 0;
//		while (n > 0) {
//			n /= 10;
//			count++;
//		}
//		return count;
		
		// advanced
		if (n == 0) {
			return 1; // Special case for zero
		}
		return (int) Math.log10(Math.abs(n)) + 1;
	}
	public static void main(String[] args) {

		System.out.println(countDigit(12345)); // 5
		System.out.println(countDigit(-12345)); // 5
		System.out.println(countDigit(0)); // 1
		System.out.println(countDigit(1000000)); // 7
		System.out.println(countDigit(-1000000)); // 7
		System.out.println(countDigit(999999999)); // 9
		System.out.println(countDigit(-999999999)); // 9
		System.out.println(countDigit(1)); // 1
		System.out.println(countDigit(-1)); // 1
		System.out.println(countDigit(10)); // 2
		System.out.println(countDigit(-10)); // 2

	}

}
