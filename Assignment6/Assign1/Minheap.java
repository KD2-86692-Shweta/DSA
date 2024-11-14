package Heap;

public class Minheap {
private int SIZE;

	public Minheap() {
		SIZE=0;
	}
	
	public void createheap(int arr[]) {
		for(int i = 1 ; i <arr.length ; i++) {
		SIZE++;
		
		int ci=SIZE;
		int pi=ci/2;
		
		while(pi>=1) {
			if(arr[pi]<arr[ci])
				break;
			
			int temp=arr[pi];
			arr[pi]=arr[ci];
			arr[ci]=temp;
			
			ci=pi;
			pi=ci/2;
		}
	}
	}
	
	
}
