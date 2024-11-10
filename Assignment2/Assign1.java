package Assignment2;

import java.util.Arrays;

public class Assign1 {

	public static void main(String[] args) {
		int arr[]= {10,23,12,56,23,12,78};
		
		insertionSort(arr,arr.length);
		
		System.out.println(""+Arrays.toString(arr));

	}
	
	private static void insertionSort(int arr[],int length) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			
			for(int j=i-1;j>=0 && arr[j]<temp;j-- ) {
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}

}
