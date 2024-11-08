package Assign3;

import java.util.Scanner;

public class Assign7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
		
		System.out.println("Enter Rank to find ");
		int rank=sc.nextInt();
		findRank(arr,rank);
	
	}
	
	public static void findRank(int arr[],int rank) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=rank) {
				
				count++;
			}
		}System.out.println(count);
	}
}




//. Find rank of an element in an array of integers. rank: rank of a given integer "x" in the array, is "total no.
//of ele's less than or equal to x (including x). Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4