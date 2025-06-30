package dsa.BitMagic;

public class BitMagicProblemsEasy {

	public static void printBitsNieveSolutions(int n) {
		if(n==0)
			System.out.println(0);
		while(n>0) {
			System.out.print(n%2 ==0 ? 1: 0);
			n=n/2;
		}
		
	}
	public static void printBitsByIngegerClass(int n) {
		System.out.print(Integer.toBinaryString(n));
	}
	
	static String getBinaryRep(int n) {

        String ans = "";
        // Check for each bit.
        for (int i = 31; i >= 0; i--) {
            // If i'th bit is set (Important expression)
            if ((n & (1 << i)) != 0) ans += '1';
            else ans += '0';
        }
        return ans;
    }
	
	static void unsetRightMostBit(int n ) {
		// Remove rightmost set bit
		int n2=n;
        n = n & (n - 1);
        System.out.println("disrect unset:"+ n);
        
        
	    for(int i=1; i<31; i++) {
	    		if((n2 &(1<<i)) !=0) {
	    			n2= (n2 ^ (1<<i));
	    			break;
	    		}
	    }
	    System.out.println("by shifting bit: "+n2);
        
	}
	private static void setKthBit(int n, int i) {
		System.out.println(n | (1<<i));
		
	}
	public static void main(String[] args) {

//		Q.1 Binary representation of a given number
		System.out.println("ans.1");
		printBitsNieveSolutions(10);
		System.out.println();
		printBitsByIngegerClass(10);
	    System.out.println(getBinaryRep(10));

//	    Q.2 3rd bit of number 10 is set or not 
	    System.out.println("ans.2");
	    System.out.println((10&(1<<3)) != 0);
	    
//	    Q.3 Given an integer n, turn remove turn off the rightmost set bit in it. 
//	    input: 12(1100), output: 8 (1000)
	    System.out.println("ans.3");
	    unsetRightMostBit(12);
	    
//	    Q.4 Set the K-th bit of a given number
//	    Input : n = 10, k = 2
//	    	Output : 14
//	    	(10)10 = (1010)2
//	    	Now, set the 2nd bit from right.
//	    	(14)10 = (1110)2
//	    	2nd bit has been set.
	    System.out.println("ans.4");
	    setKthBit(10,2);
	    
	    
//	    Q.5 Compute modulus division by a power-of-2-number
//	    Input: 6 4
//	    Output: 2 
//	    Explanation: As 6%4 = 2
//
//	    Input: 12 8
//	    Output: 4
//	    Explanation: As 12%8 = 4
//
//	    Input: 10 2
//	    Output: 0
//	    Explanation: As 10%2 = 0
	    System.out.println("ans.5");
	    System.out.println(12 & (8 - 1));
	    

	    
	    
	}
	

}
