package dsa.Math;
/**
 * @id 004
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
public class FactorialTrailingZero {

	public static long basicWay(int n) { // overflow issues with this 
		 long startTime = System.nanoTime(); // Start timer
			// basic 
			long temp =1;
			while(n>1) {
				temp *= n;
				n--;
			}
			long zeros=0;
			while(temp%10 ==0) {
				zeros++;
				temp /=10;
			}
			

	        long endTime = System.nanoTime();   // End timer
	        long duration = endTime - startTime; // In nanoseconds
	        System.out.println("Time taken: " + (duration / 1_000_000.0) + " ms");
	        return zeros;
	}
	
	
	public static int advanceWay(int n) {
		long startTime = System.nanoTime(); // Start timer
		int res=0;
		for(int i=5;i<n; i*=5) {
			res = res+ n/i;
		}
		long endTime = System.nanoTime();   // End timer
        long duration = endTime - startTime; // In nanoseconds
        System.out.println("Time taken: " + (duration / 1_000_000.0) + " ms");
        
		return res;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(advanceWay(100));
		System.out.println(basicWay(100));

	}

}
