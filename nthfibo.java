package ad1;

import java.util.Scanner;

public class nthfibo 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the n");
		int n=in.nextInt();
		int f[] = new int[n + 1];
        int i;
  
        f[0] = 0;
  
        if (n > 0) {
            f[1] = 1;
  
            for (i = 2; i <= n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        System.out.println(f[n]);
  

	}

}
