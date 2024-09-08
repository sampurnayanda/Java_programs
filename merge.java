package ad_1;
import java.util.Scanner;
import java.util.Arrays;
//merge array
public class merge 
{

	public static void main(String[] args) 
	{
		int i=0;int j=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=in.nextInt();
		int ar[]=new int[n];
		for(i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		System.out.println("input array:");
		for(i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("enter the size of an array:");
		int m=in.nextInt();
		int ar1[]=new int[n];
		for(j=0;j<m;j++)
		{
			ar1[j]=in.nextInt();
		}
		System.out.println("input array:");
		for(j=0;j<m;j++)
		{
			System.out.print(ar1[j]+" ");
		}
		System.out.println();
		int a=0;int b=0;
		int k = n - 1;
        while (a <= k && b < m) 
        {
            if (ar[a] < ar1[b])
                i++;
            else {
                int temp = ar1[b];
                ar1[b] = ar[k];
                ar[k] = temp;
                b++;
                k--;
            }
        }
        Arrays.sort(ar);
        Arrays.sort(ar1);
        System.out.print("After Merging \nFirst Array: ");
        System.out.println(Arrays.toString(ar));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(ar1));

	}

}
