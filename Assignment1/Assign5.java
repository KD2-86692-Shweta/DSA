package Assign3;

import java.util.Scanner;

public class Assign5 {

	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	int arr[]= {23,45,23,56,12,45,56,67,78,12,35,45};
	
	System.out.println("Enter the Element ");
	int element=sc.nextInt();
	
	System.out.println("Enter the Occurence of Element ");
	int occurence=sc.nextInt();
	
	
	int index=SearchByOccurence(arr,element,occurence);
	if(index ==0) {
		System.out.println("Occurence not exist");
	}else {
		System.out.println("Occurence exist");
	}

	
	
	
	
	}


public static int SearchByOccurence(int arr[],int element,int occurence) {
	int count=0;
	int flag=0;
	for(int i=0;i<arr.length;i++) {
		
		if(element==arr[i]) {
			if(count==occurence){
			System.out.println("Occurence found "+i);
			break;
			}else {
				count++;
			}
			flag=1;
			
		}else {
			flag=0;
			
		}
		
	}
	
	if(flag==0) {
		System.out.println("Element doesnt exist");	}
	else {
		System.out.println("Element Found ");

	}
	return count;
}
}