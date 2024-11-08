package Assignment;

import java.util.Scanner;

public class Assign1 {
	
	public static int LinearSearch(int arr[],int key) 
	{ int maxindex=-1;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				maxindex=i;	
			}
		}
		return maxindex;
		
	}

	public static void main(String[] args) {
		
	 {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {23,45,23,67,34,23,45,78,67};
		System.out.println("Enter the Elemnt to search : ");
		int key=sc.nextInt();
		
		int index=LinearSearch(arr,key);
		
		if(index==-1) {
			System.out.println("Key Doesnt found");
		}else {
			System.out.println("Key Found at index "+index);
		}
	}
	}
}

