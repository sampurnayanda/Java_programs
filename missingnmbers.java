package ad_1;

import java.util.Scanner;

public class missingnmbers 
{
	public static  int findMissingNumber(int A[],int n)
	{
		int i,j, found=0;
		for(i=1;i<=n;i++)
		{
			found=0;
			for(j=0;j<n;j++)
			{
				if(A[j]==i)
				{
					found=1;
					break;
				}
			}
			if(found==0)
				return i;
		}
		return Integer.MAX_VALUE;
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
		int x=findMissingNumber(A1,n1);
		System.out.println();
		System.out.println("the missing element is:");
		System.out.println(x);


	}

}
