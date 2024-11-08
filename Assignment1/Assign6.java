package Assign3;

public class Assign6 {

	public static void main(String[] args) {
		//Find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3

		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		nonRepeating(arr);
		
		
	}

	public static void nonRepeating(int arr[]) {
		
		
		
      for(int i=0;i<arr.length;i++) {
    	  int flag=0;
	    	for(int j=i+1;j<arr.length;j++) {
	    		
	    		if(arr[i]==arr[j]) {
	    			System.out.println(arr[i]+"Element Repeat at "+j);
	    			flag=1;
	    			
	    			
	    		}
	    	
	    	}if(flag==0)
			{
				System.out.println("first Non Repeating Element is= "+arr[i]);
				break;
			}
	    	
	    }
	
	}
}
