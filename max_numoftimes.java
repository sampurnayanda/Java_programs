package ad_1;

import java.util.Scanner;

public class max_numoftimes 
{
	public static int getMax(int A[],int n)
	{
		int i,j;
		int max=A[0],count=1,maxcount=1;
		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(A[i]==A[j])
				{
					count=count +1;
				}
			}
			if(count>maxcount)
			{
				max=A[i];
				maxcount=count;
			}
		}
		return max;
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
		int x=getMax(A1,n1);
		System.out.println();
		System.out.println("the maximum no. of times:");
		System.out.println(x);


	}

}
