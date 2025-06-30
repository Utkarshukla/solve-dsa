/**
 * @id 011
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
package dsa.Math;

public class ComputePower {

	static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
	static int power2(int base, int exponent) {
         int result = 1;
         while (exponent > 0) {
             if ((exponent & 1) == 1) {
                 result *= base;
             }
             base *= base;
             exponent >>= 1;
         }
         return result;
     }
	public static void main(String[] args) {
		
		// 1. 
	     double base = 2.0;
	     double exponent = 3.0;
	     double result = Math.pow(base, exponent); // result will be 8.0
	     // 2.
	     int base2 = 2;
	     int exponent2 = 3;
	     int result2 = 1;
	     for (int i = 0; i < exponent2; i++) {
	         result2 *= base2;
	     } 
	     // 3.
	     int result3 = power(2, 3); 
	     //4.
	     int resul4 = power2(2, 3); // result will be 8
	     
//	     System.out.print

	}

}
