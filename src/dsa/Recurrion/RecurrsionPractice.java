package dsa.Recurrion;

public class RecurrsionPractice {

	// Tail recursion examples ( to avoid stack overflow )

	// Traditional recursion example
	public static int factorialTreditional(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorialTreditional(n - 1);
	}

	// Tail recursion example
	public static int factorial(int n, int result) {
		if (n == 0) {
			return result;
		}
		return factorial(n - 1, n * result);
	}

	// Print 1 to n using recursion

	// Traditional recursion example
	public static void print1ToNTraditional(int n) {
		if (n == 0) {
			return;
		}
		print1ToNTraditional(n - 1);
		System.out.println(n);
	}

	// Tail recursion example
	public static void print1ToNTail(int n, int current) {
		if (current > n) {
			return;
		}
		System.out.println(current);
		print1ToNTail(n, current + 1);
	}

	// fibonacci series using recursion
	public static int fibonacciTraditional(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciTraditional(n - 1) + fibonacciTraditional(n - 2);
	}

	// Tail recursion example
	public static int fibonacciTail(int n, int a, int b) {
		if (n == 0) {
			return a;
		}
		if (n == 1) {
			return b;
		}
		System.out.println("Fibonacci: " + a + ", " + b);
		return fibonacciTail(n - 1, b, a + b);
	}

	//
	public static int sumOfNaturalNumber(int n, int k) {
		if (n < 1)
			return 1;
		if (n == 1)
			return k;
		return sumOfNaturalNumber(n - 1, k + n);
	}

	
	// tail recursive
	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty())
			return true;
		return isPalindromeTail(str, 0, str.length() - 1);
	}

	private static boolean isPalindromeTail(String str, int l, int r) {
		if (l >= r)
			return true;
		if (str.charAt(l) != str.charAt(r))
			return false;
		return isPalindromeTail(str, l + 1, r - 1); // ✅ Tail call
	}
	// non tail 
	public static boolean isPalindrome(String str, int l, int r) {
		if (str == null || str.isEmpty()) // handle the base case on even
			return true;
		// case when pointer cross
		if (l >= r)
			return true;
		return (str.charAt(l) == str.charAt(r) && isPalindrome(str, l + 1, r - 1));
	}
	
	
	
	
	// rope cutting problem 
	public static int maxCut(int n , int a, int b, int c) {
		if(n==0)
			return 0;
		if(n<1)
			return -1;
		int res =Math.max(maxCut(n-a,a,b,c),maxCut(n-b,a,b,c));
		res = Math.max(res,maxCut(n-c,a,b,c));
		if(res==-1)
			return -1;
		return res+1;
	}
	
	
	// Subsequences / subsets [3,1,2] = {},(3),(3),(1),(2),(3,1),...(3,1,2)
	public static void subSequence(String s, String cur, int i) {
		if(i>= s.length()) {
			if(cur==""){
				System.out.println("{}");				
			} else {				
				System.out.println(cur);
			}
			return;
		}
		
		subSequence(s,cur, i+1); // not take
		subSequence(s,cur+s.charAt(i),i+1); // take 
	}
	
	public static void hanoi(String source, String dest, String helper, int disk) {
	    if (disk == 1) {
	        System.out.println("Move disk 1 from " + source + " to " + dest);
	        return;
	    }

	    // Step 1: Move (n-1) disks from source to helper
	    hanoi(source, helper, dest, disk - 1);

	    // Step 2: Move largest disk from source to dest
	    System.out.println("Move disk " + disk + " from " + source + " to " + dest);

	    // Step 3: Move (n-1) disks from helper to dest
	    hanoi(helper, dest, source, disk - 1);
	}
	
	public static int josephusSurvivor(int n, int k) {
	    if (n == 1) {
	        return 0; // base case
	    }

	    return (josephusSurvivor(n - 1, k) + k) % n;
	}
	
	
	public static int sumOfSubsets(int[] A, int index, int currentSum) {
	    if (index == A.length) {
	        return currentSum;
	    }

	    // Exclude A[index]
	    int exclude = sumOfSubsets(A, index + 1, currentSum);
	    // Include A[index]
	    int include = sumOfSubsets(A, index + 1, currentSum + A[index]);
	    return include + exclude;
	}
	
	
	public static void printPermutations(char[] s, int index) {
        if (index == s.length) {
            System.out.println(new String(s));
            return;
        }

        for (int i = index; i < s.length; i++) {
            swap(s, i, index);
            printPermutations(s, index + 1);
            swap(s, i, index); // backtrack (original order)
        }
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }




	public static void main(String[] args) {
		// Example usage of the methods
		int n = 5;
		System.out.println("Factorial (Traditional): " + factorialTreditional(n));
		System.out.println("Factorial (Tail): " + factorial(n, 1));
		System.out.println("Print 1 to N (Traditional):");
		print1ToNTraditional(n);
		System.out.println("Print 1 to N (Tail):");
		print1ToNTail(n, 1);
		System.out.println("Fibonacci (Traditional): " + fibonacciTraditional(n));
		System.out.println("Fibonacci (Tail): " + fibonacciTail(5, 0, 1));

		System.out.println("Sum of " + n + " natural number (Tail): " + sumOfNaturalNumber(5, 1));
		String s = "ababa";
		System.out.println("isPalindrome : " + isPalindrome(s));
		
		
		System.out.println("max posible cut of length 5 "+maxCut(23,12,9,11));

		String ss = new String("ABC");
		subSequence(ss,"",0);
		
		hanoi("A", "C", "B", 2);
		
		// circle of 7 kill every next 3rd
		System.out.println(josephusSurvivor(7,3)+1 +" is the last servivor in the circle"); // 
		
		int[] A = {1, 2};
		int total = sumOfSubsets(A, 0, 0);
		System.out.println(total +" sum of subsets"); // Output: 6
		
		
		// permutations of string
		  printPermutations("abc".toCharArray(), 0);

	
	}

}
