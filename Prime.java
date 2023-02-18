import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number to check it is prime number:");
		int a=s.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
		if(a%i==0)
		{
			count++;
		}
		}
		if(count==2)
		{
			System.out.println(a+"-"+"The entered number is a prime number:");
		}
		else 
		{
			System.out.println(a+"-"+"The entered number is not a prime number:");
		}
	}
}

		