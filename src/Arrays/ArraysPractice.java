package Arrays;

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
	}

}
