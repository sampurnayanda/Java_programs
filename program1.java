package ad_1;
import java.util.Scanner;
import java.util.Arrays;
//check reverse
public class program1 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		System.out.println("input array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		  int temp[] = new int[n]; 
	        for (int i = 0; i < n; i++) { 
	            temp[i] = ar[i]; 
	        } 
	    
	        Arrays.sort(temp); 
	  
	        int front; 
	        for (front = 0; front < n; front++) 
	        { 
	            if (temp[front] != ar[front]) 
	            { 
	                break; 
	            } 
	        } 
	   
	        int back; 
	        for (back = n - 1; back >= 0; back--) 
	        { 
	            if (temp[back] != ar[back]) 
	            { 
	                break; 
	            } 
	        } 
	  
	        if (front >= back) 
	        { 
	            System.out.println("true");
	        } 
	  
 
	        do { 
	            front++; 
	            if (ar[front - 1] < ar[front]) 
	            { 
	                System.out.println("false"); 
	            } 
	        } 
	        while (front != back); 
	  
	        System.out.println("true"); 
	    } 

	}

