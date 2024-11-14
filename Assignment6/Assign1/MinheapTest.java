package Heap;

import java.util.Arrays;

public class MinheapTest {

	public static void main(String[] args) {
		
         int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		Minheap h = new Minheap();
		
		h.createheap(arr);
	
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

	}


