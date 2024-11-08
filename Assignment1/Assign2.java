package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {11,22,33,44,55,66,77,88,99};
		
		
		int choice;
		do{
			System.out.println(Arrays.toString(arr));
			System.out.println("0.Exit");
			System.out.println("1.Linear Search");
			System.out.println("2. Binary Search ");
			System.out.println("Enter choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Element to Search : ");
				int search=sc.nextInt();
			LinearSearch(arr,search);
			break;
			
			case 2:
				System.out.println("Enter Element to Search : ");
				int searc=sc.nextInt();
		    BinarySearch(arr,searc);
		    break;
		    default:
		    	System.out.println("Enter valid Choice ");
			}
		}while(choice!=0);
		

	}

	private static void LinearSearch(int arr[],int search) {
		int comp=-1;
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			comp++;
			if(search==arr[i]) {
				System.out.println("Element Found : "+i);
				flag=1;
				break;
			}
		}
		if(flag==1) {
		System.out.println("Number of Comparision Done is : "+comp);
		}
		else if(flag==0) {
			System.out.println("Element not found ");
		}
		
	}

	private static void BinarySearch(int arr[],int search) {
		int comp=0;
		
		int right=arr.length-1;
		int left=0;
		int mid;
		int flag=0;
		
		for(int i=0;i<arr.length;i++) {
			comp++;
			mid=(left+right)/2;
			
			if(search == arr[mid]) 
			{
				System.out.println("Element found "+mid);
				flag=1;
				break;
			}
			else if(search>arr[mid]) {
				
				left=mid+1;
			}
			else if(search<arr[mid]) {
				

				right=mid-1;
			}
		}
		
		if(flag==1) {
		System.out.println("Number of Comparision using binary search  "+comp);
		}
		else{
			System.out.println("Element not found ");
		}
		
	}

}
