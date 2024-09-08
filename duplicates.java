package ad_1;

import java.util.Scanner;

public class duplicates 
{
	public static void printDuplicates()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter array and size");
		int n=in.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("the Duplicate element is:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(A[i]==A[j])
				System.out.println(" "+A[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		System.out.println();
		
		printDuplicates();


	}

}
