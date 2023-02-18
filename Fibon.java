import java.util.Scanner;
public class Fibon
{
/*public static void main(String args[])
{
int n1=0;
int n2=1;
for(int i=0;i<=4;i++)
{
System.out.println(n1);
int n3=n1+n2;
n1=n2;
n2=n3;

}
}
}
*/

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of terms");
int a=s.nextInt();
int n1=0;
int n2=1;
for(int i=1;i<=a;i++)
{
	System.out.println(n1);
int n3=n1+n2;
n1=n2;
n2=n3;

}
}
}




 /*   public static void main(String[] args) {

        int count = 7, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
           /* int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
*/