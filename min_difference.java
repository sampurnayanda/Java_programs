package ad_1;

import java.util.Arrays;
import java.util.Scanner;

public class min_difference 
{
	public static int findMinDiff(int A[],int n)
	{
		int diff=9999999;
		int l=0;
		int u=0;
		Arrays.sort(A);
		for(int i=0;i<n-1;i++)
		{
			if((A[i+1]-A[i])<diff) 
			{
				diff=A[i+1]-A[i];
				l=A[i];
				u=A[i+1];
			}
		}
		System.out.println();
		System.out.println("the pair is:");
		System.out.print(l+" ");
		System.out.println(u);
		return diff;
	}

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter array and size");
		int n1=in.nextInt();
		int A1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			A1[i]=in.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			System.out.print(A1[i]+" ");
		}
		int x=findMinDiff(A1,n1);
		System.out.println();
		System.out.println("the minimum difference is:");
		System.out.println(x);


	}

}
