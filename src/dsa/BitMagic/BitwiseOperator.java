/**
 * @id 101
 * @topic Bit Magic
 * @difficulty Medium
 * @author Utkarsh Shukla
 */
package dsa.BitMagic;

public class BitwiseOperator {

	public static void main(String[] args) {
		System.out.println("== Bitwise Operation ==");
		int a = 5; // 0101
		int b = 3; // 0011
		System.out.println("a & b = " + (a & b)); // 0001
		System.out.println("a | b = " + (a | b)); // 0111
		System.out.println("a ^ b = " + (a ^ b)); // 0110
		System.out.println("~a = " + (~a)); // 1010 (in 32-bit representation, it's -6)
		System.out.println("a << 1 = " + (a << 1)); // 1010
		System.out.println("a >> 1 = " + (a >> 1)); // 0010
		System.out.println("a >>> 1 = " + (a >>> 1)); // 0010 (unsigned right shift, same as >> for positive numbers)
		System.out.println("b << 1 = " + (b << 1)); // 0110
		System.out.println("b >> 1 = " + (b >> 1)); // 0001
		System.out.println("b >>> 1 = " + (b >>> 1)); // 0001 (unsigned right shift, same as >> for positive numbers)
		
		int c = 0b1010; // 10 in binary
		int d = 0b1100; // 12 in binary
		
		System.out.println("c & d = " + (c & d)); // 1000 (8 in decimal)
		
		
		// bit masking example
		int e = 8;
		// chech kth bit is set or not
		int k = 3; // check 3rd bit (0-indexed)
		System.out.println("1 << k(3)   is " + (1 << k)); // 1000 (8 in decimal));
		if ((e & (1 << k)) != 0) {
			System.out.println("The " + k + "th bit of " + e + " is set.");
		} else {
			System.out.println("The " + k + "th bit of " + e + " is not set.");
		}
		
		// bit merging example
		int f =0;
		// let's add 5, 9 ....
		
		
	}

}
