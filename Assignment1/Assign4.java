package Assign3;

import java.util.Scanner;

public class Assign4 {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr[]= {99,88,77,66,55,44,33,22,11};
		
		System.out.println("Enter Element to Search : ");
		int search=sc.nextInt();
		
		
		int flag=descending(arr,arr.length);
		if(flag==1) {
			BinarySearch(arr,search,arr.length);
		}
		else {
		    System.out.println("Not in Descending Order ");
		}
	
		
	}
	
	private static int descending(int arr[],int length) {
		int flag=1;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
				}else {
					flag=0;
				}
			}
		}
		return flag;
	}

	private static void BinarySearch(int arr[],int search, int length) {
		
		int left=0;
		int right=length-1;
		int mid;
		int flag=0;
		for(int i=0;i<length-1;i++)
		//while(left<=right)
		{
			mid=(left+right)/2;
			
			if(search==arr[mid]) {
				System.out.println("Element found at location : "+mid);
				flag=1;
				break;
			}else if(search>arr[mid]) {
				
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		
		if(flag==1) {
			
		}else {
			System.out.println("Element not found");
		}
		
	}

}



