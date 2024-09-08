package ad_1;

import java.util.Scanner;

public class repeatedelement 
{
	public static int firstRepeated(int A[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(A[i]==A[j])
					return A[i];
			}
		}
		return 0;
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
		int x=firstRepeated(A1,n1);
		System.out.println();
		System.out.println("the repeated element is:");
		System.out.println(x);

	}

}
