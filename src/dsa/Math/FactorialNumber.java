package dsa.Math;
/**
 * @id 003
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */

public class FactorialNumber {
	public static int facNum(int n) {
		
		// basic 
		int temp =1;
		while(n>1) {
			temp *= n;
			n--;
		}
		return temp;
		
		// recursion not recommend 
	}
	public static void main(String[] args) {

		System.out.println(facNum(3));
	}

}
