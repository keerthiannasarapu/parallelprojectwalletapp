package com.capg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) {
		
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size of the array");

int i;
try {
	int sum=0;
	int product=1;
	i = Integer.parseInt(br.readLine());
	
	if(i%2==0) {
		System.out.println("array should be odd");
	}else {
		
		int a[]=new int[i];
		for(int n=0;n<i;n++) {
			
		
			
			a[n]=Integer.parseInt(br.readLine());
			
			
		}
		for(int n=0;n<i;n++) {
			System.out.println(+a[n]);
		}

int mid=i/2+1;
int a1[]=new int[mid];
		for(int k=0;k<mid;k++) {
		sum=sum+a[k];

		
		}
		System.out.println(sum);
		
		for(int j=i;j>mid;j--) {
			product=product*a[j];
		}
		System.out.println(product);
		
		int result=sum+product;
		
		
	}
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

}
