package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Utkarsh Shukla
 */
public class ArraysPractice {
	
	// insert an element at a specific index in an array
	/**
	 * Best Case 1 when need to add at end 
	 * Worst Case theeta(n) when need to add at start
	 * Average O(n)
	 * @param arr
	 * @param index
	 * @param element
	 * @return
	 */
	public static int[] insertInArray(int[] arr, int index, int element) {
		if (index < 0 || index > arr.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}

		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}

		newArr[index] = element;

		for (int i = index + 1; i < newArr.length; i++) {
			newArr[i] = arr[i - 1];
		}

		return newArr;
	}
	
	// deletion of elements from the array 
	/**
	 * 
	 * @param args
	 */
	public static int[] deleteFromArray(int[] A, int element) {
		int i =0;
		for(i=0;i<A.length;i++) {
			if(A[i]==element) {
				break;
			}
		}
		// found ith position 
		
		if(i==A.length) {
			return A;
		}
		// adjust after it 
		for(int j=i;j<A.length-1;j++) {
			A[j]=A[j+1];
		}
		return A;
		
	}
	
	
	// largest element in the array 
	public static int maxElementInArray(int[] A) {
		if(A.length==0) {
			return 0;
		}
		int max = A[0];
		for(int x: A) {
			if(x>max) {
				max=x;
			}
		}
		return max;
	}
	
	// second largest element in the array 
	public static int secMaxElementInArray(int[] A) {
	    if (A.length < 2) {
	        throw new IllegalArgumentException("Array must have at least 2 elements");
	    }

	    int max = Integer.MIN_VALUE;
	    int sec = Integer.MIN_VALUE;

	    for (int x : A) {
	        if (x > max) {
	            sec = max;
	            max = x;
	        } else if (x > sec && x != max) {
	            sec = x;
	        }
	    }

	    return (sec == Integer.MIN_VALUE) ? -1 : sec; // return -1 if no second max
	}
	
	// check is the array sorted 
	public static boolean isShortedArray(int[] A) {
		if(A.length==1)
			return true;
		boolean flag= true;
//		for(int i=0;i<A.length-1;i++) {
//			if(A[i+1]<A[i]) {
//				flag=false;
//				break;
//			}
//		}
		int l =0;
		int r =A.length;
		while(l<r) {
			if(A[l+1] <A[l] || A[r-1] < A[r-2] ) {
				flag=false;
			}
			l++;
			r--;
		}
		return flag;
	}
	
	public static int[] reversedArray(int[] A) {
		if(A.length <2)
			return A;
		int l =0;
		int r =A.length;
		while(l<r) {
			int temp =A[l];
			A[l] = A[r-1];
			A[r-1]= temp;
			l++;
			r--;
		}
		return A;
	}
	
	public static int[] cleanDublicatesOfSorted(int[] A) {
		if(A.length<2)
			return A;
		
		int pointer= 1;
		for(int i=1;i<A.length-1;i++) {
			if(A[i] != A[pointer-1]) {
				A[pointer] = A[i];
				pointer++;
			}
		}
		// 1,2,3,4,5,8,4,5,8,8, let return actual size of array 
		 int[] result = new int[pointer];
		 for (int i = 0; i < pointer; i++) {
		        result[i] = A[i];
		 }
		 return result;
	}
	
	public static int[] cleanDublicatesOfUnsorted(int[] A) {
		if (A.length < 2)
            return A;
		
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : A) {
            set.add(num); // duplicates will be ignored
        }
		
		// Convert set back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
	}
	// {8,5,0,10,0,20};
	public static int[] moveZerosToEnd(int[] A) {
		int p=0;
		for(int i=0;i<A.length;i++) {
			if(A[i] !=0) {
				swap(i,p,A);
				p++;
			}
			System.out.println(i+" "+p);
		}
		// {8,5,10,20,0,0};
		return A;
	}
	public static void swap(int x, int y, int[] A){
		int tem = A[x];
		A[x] = A[y];
		A[y] = tem;
	}
	
	public static int[] leftRotateBy_N_Places(int[] A,int n) {
		int[] B = new int[A.length];
		int count =0;
		// 
		for(int i=n; i<A.length; i++) {
			B[count] = A[i];
			count++;
		}
		
		// put at end 
		for(int j=0; j<n;j++) {
			B[count] = A[j];
			count++;
		}
		
		return B;

	}
	
	// optimized rotate
	public static void leftRotateInPlace(int[] A, int n) {
	    n = n % A.length; // Handle n > A.length
	    // Step 1: Reverse first n elements
	    reverse(A, 0, n - 1);
	    // Step 2: Reverse remaining elements
	    reverse(A, n, A.length - 1);
	    // Step 3: Reverse the whole array
	    reverse(A, 0, A.length - 1);
	}
	private static void reverse(int[] A, int left, int right) {
	    while (left < right) {
	        int temp = A[left];
	        A[left] = A[right];
	        A[right] = temp;
	        left++;
	        right--;
	    }
	}

	
	public static void printLeaders(int[] A) {
	    int n = A.length;
	    int maxFromRight = A[n - 1];
	    System.out.print(maxFromRight + " ");

	    for (int i = n - 2; i >= 0; i--) {
	        if (A[i] > maxFromRight) {
	            System.out.print(A[i] + " ");
	            maxFromRight = A[i];
	        }
	    }
	}

	
	// {2,3,10,6,4,8,1}
	// tricky with O(n)
	public static int maxDifferenceProblem(int[] A) {
		if (A.length < 2) {
			throw new IllegalArgumentException("Array must have at least 2 elements");
		}
		int n = A.length;
		int min = A[0];
		int res = A[1]-A[0];
		for(int i=1;i<n;i++) {
			res = Math.max(res, A[i] - min);
			min = Math.min(min, A[i]);
			
		}
		return res;
	}
	
	public static Map<Integer, Integer> frequenciesInArray(int[] A) {
	    Map<Integer, Integer> freqMap = new HashMap<>();
	    for (int num : A) {
	        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	    }
	    return freqMap;
	}

	public static int maxStockProfit(int[] A) {
		int prof=0;
		for(int i=1;i<A.length;i++) {
			if(A[i]>A[i-1]) {
				prof+= A[i] -A[i-1];
				
			}
		}
		return prof;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int index = 2; // index where we want to insert
		int element = 10; // element to insert
		int[] newArr = insertInArray(arr, index, element);
		for(int x :newArr)
			System.out.print(x+",");
		System.out.println();
		
		int[] delArr = deleteFromArray(newArr, element);
		for(int x :delArr)
			System.out.print(x+",");
		System.out.println();
		
		int[] Arr = {-1,3,-6,5,4,3,1};
		int result = maxElementInArray(Arr);
		System.out.println("max is "+result);
		
		
		int result1 = secMaxElementInArray(Arr);
		System.out.println("2nd max is "+result1);
		
		int[] newAr = {1,2,3,4,5,6,8,7};
		System.out.println("is array shorted? " +isShortedArray(newAr));

		System.out.println("reversed array ");
		for(int x:reversedArray(newAr))
			System.out.print(x+",");
		System.out.println();
		
		
		int[] raw = {1,2,2,3,4,4,4,5,8,8};
		System.out.println("remove dublicates ");
		for(int x: cleanDublicatesOfSorted(raw))
			System.out.print(x+",");
		System.out.println();
		

		int[] raw2 = {1,4,3,2,2,3,4,8,4,5,8,8};
		System.out.println("remove unsorted dublicates ");
//		for(int x: cleanDublicatesOfUnsorted(raw2))
//			System.out.print(x+",");
//		System.out.println();
		System.out.println(Arrays.toString(cleanDublicatesOfUnsorted(raw2)));
		
		int[] raw3 = {7,10,4,3,6,5,2};
		// 8,5,0,10,0,20
		System.out.println(Arrays.toString(moveZerosToEnd(raw3)));
		
		System.out.println(Arrays.toString(leftRotateBy_N_Places(raw3,4)));
		int[] raw4 = {7,10,4,3,6,5,2};
		printLeaders(raw4);
		System.out.println();

		int[] raw5 = {2,3,10,6,4,8,1};
		System.out.println(maxDifferenceProblem(raw5));
		
		
		// frequency of elements in an array
		int[] raw6 = {1,2,1,3,2,4,3,2,4,5,6};
		Map<Integer,Integer> freq = frequenciesInArray(raw6);
		System.out.println(freq);

		int[] raw7 = {10,20,30};
		System.out.println(maxStockProfit(raw7));
		
	}

}
