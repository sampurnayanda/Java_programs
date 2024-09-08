package ad1;
import java.util.Scanner;
public class insertion 
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
		System.out.println("enter array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for (int j = 1; j < n; j++) 
		{  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) 
            {  
                arr[i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
		}
		System.out.println();
		System.out.println("insertion sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	


}
