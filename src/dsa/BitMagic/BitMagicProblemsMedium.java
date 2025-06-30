package dsa.BitMagic;

public class BitMagicProblemsMedium {

	public static void main(String[] args) {
//		Q.1 count set bits 
//		10(1010) output:2
//		by traversing 
		int res =0;
		int n=10;
		while(n>0) {
			n= n&(n-1);
			res=res+1;
		}
		System.out.println("bit count:" +res);
//		lookup (O(1)) time count set bit but considering 32bit rep.
		
		
		//Q.2 tell given n is power of 2 or not 
		// 4 true
		// 6 false
		// hint : power of 2 number have only one set bit
		n=4;
		System.out.println((n&(n-1)) ==0);
		
		// Q.3 tell the n which appear in array odd time
		int a[]= {4,4,7,4,7,7,7,8,8};
		// output =4
		int result=0;
		for(int x:a) {
			result = result^x; 
//			4^4^4^7^7^7^7^8^8
//			4^4=0
//			7^7=0
//			0^0=0
//			4^0=4
					
		}
		System.out.println(result);
		
		
//		Q.4 // find the odd occuring number in array
		int arr[] = { 1, 2, 3, 2, 3, 1, 3 };
		int oddOccuring = 0;
		for (int num : arr) {
			oddOccuring ^= num; // XOR operation
		}
		System.out.println("Odd occurring number: " + oddOccuring);
		
		//		Q.5 find the two odd occuring number in array
		int arr2[] = { 1, 2, 3, 2, 3, 1, 4, 5 };
		int xor = 0;
		for (int num : arr2) {
			xor ^= num; // XOR operation
		}
		System.out.println("XOR of all numbers: " + xor);
		// Get the rightmost set bit
		int rightmostSetBit = xor & -xor;
		System.out.println("Rightmost set bit: " + rightmostSetBit);
		int num1 = 0, num2 = 0;
		for (int num : arr2) {
			if ((num & rightmostSetBit) == 0) {
				num1 ^= num; // First group
			} else {
				num2 ^= num; // Second group
			}
		}
		System.out.println("Two odd occurring numbers: " + num1 + ", " + num2);

		
		
		// Q.6 10/3 = 3.33 ==3 
		int dividend = 22;
		int divisor = 3;
		int store = 0; // to store the power of 2
		// expected output: 7
		
		// let's follow the approach 
		 // 3x7 
		// 3x(2^2 + 2^1 + 2^0)
		// (3*2^2) + (3*2) + (3*1)
		// ab isme se bigger number hata lete hai
		
		// phase 1: 
		 // so 3x2^0 = 3 (can be remove but we are looking bigger )
		// next is         // 3x2^1 = 6 
		// next is         // 3x2^2 = 12
		// next is         // 3x2^3 = 24 (bigger than 22 so we can remove previous 3x2^2)
		
		// 22 -12 = 10
		 // we have removed // 3x2^2 = 12 so store some where 2^2 = 4
//		store = 4; // store the power of 2
		
		// phase 2:
		// now we have 10
		// next is         // 3x2^0 = 3 (can be remove but we are looking bigger )
		// next is         // 3x2^1 = 6
		// next is         // 3x2^2 = 12 (bigger than 10 so we can remove previous 3x2^1)
		// 10 - 6 = 4
//		store = store + 2; // store the power of 2
		
		// phase 3:
		// now we have 4
		// next is         // 3x2^0 = 3 (can be remove but we are looking bigger )
		// next is         // 3x2^1 = 6 (bigger than 4 so we can remove previous 3x2^0)
		// 4 - 3 = 1
//		store = store + 1; // store the power of 2
//		NOW we have 1 WHICH IS LESS THAN 3 SO WE CAN'T GO FURTHER
		
		//CODE
		 int resutl = devide(22, 3);
		System.out.println("Result of division: " + resutl);
		
		
	}

	private static int devide(int i, int j) {
		if (i == j) return 1; // base case
		if (i < j) return 0; // base case for division
		// result sign +ive or negative 
		boolean sign = false;
		if (i < 0 && j > 0 || i > 0 && j < 0) {
			sign = true; // if one is -ve and other is +ve then result will be -ve
		}
		// convert both to +ve
		i = Math.abs(i);
		j = Math.abs(j);
		int result = 0;
		while (i >= j) {
			int count = 0;
			while (i >= (j << count)) {
				count++; // count how many times we can shift left
			}
			count--; // we need to decrement count because last shift will be greater than i
			result += (1 << count); // add 2^count to result
			i -= (j << count); // subtract j * 2^count from i
		}
		
		if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
			return Integer.MAX_VALUE; // handle overflow case
		} else if (result <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE; // handle underflow case
		}
		
		return sign ? -result : result; // return result with sign;
	}

}
