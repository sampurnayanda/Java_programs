package ad1;

import java.util.Scanner;

public class factorial 
{

	public static void main(String[] args) 
	{
		int f=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
       System.out.println("factorial is:"+f);
	}

}
