package Assignment3;

import java.util.Arrays;

public class Assign1 {

	public static void main(String[] args) {
		
		
		Stack sn=new Stack(10);
		Stack s=new Stack(10);
		
		
		int j=10;
		for(int i=0;i<10;i++) {
			s.push(j);
			j=j+10;
		}

		for(int i=0;i<10;i++) {
			int show = s.pop();
			sn.push(show);
		}
	
		System.out.println("Array");
		s.display();
		System.out.println("Reverse Array ");
		sn.display();
	
	}

}
