package ad1;

import java.util.Scanner;

public class nthpower 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int num=in.nextInt();
		System.out.println("enter the nth power");
		int n=in.nextInt();
		int power = 1;  
		for (int i = 1; i <=n; i++)   
		{
		power = power * num;  
		} 
		System.out.println(power);  

	}

}
