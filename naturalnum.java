package ad1;

import java.util.Scanner;

public class naturalnum 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int s=0;
		System.out.println("enter n");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
      System.out.println("sum of n natural numbers are:"+s);  
	}

}
