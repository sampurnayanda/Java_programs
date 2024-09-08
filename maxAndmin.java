package ad1;
import java.util.Scanner;
public class maxAndmin 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<n;i++)
		{
			if(ar[i]>max)
				max=ar[i];
			else if(ar[i]<min)
				ar[i]=min;
		}
		System.out.println("max element is:"+max);
		System.out.println("min element is:"+min);
	}

}
