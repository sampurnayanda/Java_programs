package ad1;

import java.util.Scanner;

public class bubblesort 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("entered array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int temp = 0;  
        for(int i=0; i < n; i++)
        {  
                for(int j=1; j < (n-i); j++)
                {  
                         if(arr[j-1] > arr[j])
                         {   
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                }
        }
                System.out.println();
        		System.out.println("bubble sorted array:");
        		for(int i=0;i<n;i++)
        		{
        			System.out.print(arr[i]+" ");
        		}

	}
}
