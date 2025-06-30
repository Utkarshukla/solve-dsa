/**
 * @id 009
 * @topic Math
 * @difficulty Easy
 * @author Utkarsh
 */
package dsa.Math;

import java.util.ArrayList;
import java.util.List;

class Divisors{
	
	public List<Integer> getDivisors(int n){
		List<Integer> div = new ArrayList<>();
		for(int i=1;i<=n/2; i++) {
			if(n%i==0)
				div.add(i);
		}
		div.add(n);
		return div;
	}
	
	public List<Integer> getDivisorsEffient(int n){
		List<Integer> div = new ArrayList<>();
		for(int i=1;i*i<=n; i++) {
			if(n%i==0)
				div.add(i);
				if(i != n/i)
					div.add(n/i);
		}
		return div;
	}
	
	public List<Integer> getDivisorsEffient2(int n){
		List<Integer> div = new ArrayList<>();
		int i;
		for(i=1;i*i<n; i++) {
			if(n%i==0)
				div.add(i);
				
		}
		for(i=i-1;i>=1; i--) {
			if(n%i==0)
				div.add(n/i);
		}
		return div;
	}
}
public class AllDivisorsOfNum {

	public static void main(String[] args) {
		Divisors d= new Divisors();
		System.out.println(d.getDivisors(12));
		System.out.println(d.getDivisorsEffient(12)); 
		System.out.println(d.getDivisorsEffient2(12)); 
		

	}

}
