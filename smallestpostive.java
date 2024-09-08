package ad1;
import java.util.Scanner;
public class smallestpostive 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		int ptr = 0;
		 
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                ptr = 1;
                break;
            }
        }

        if (ptr == 0)
        {
            System.out.println(1);
        }
 
        for (int i = 0; i < n; i++)
        {
            if (arr[i] <= 0 || arr[i] > n)
                arr[i] = 1;
        }

        for (int i = 0; i < n; i++)
        {
            arr[(arr[i] - 1) % n] += n;
        }
 
        for (int i = 0; i < n; i++)
        {
            if (arr[i] <= n)
                System.out.println(i + 1);
            else
                System.out.println(n + 1);
        }
	}

}
