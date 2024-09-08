package ad1;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        System.out.println(result);
	}

}
