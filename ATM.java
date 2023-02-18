import java.util.Scanner;
public class ATM
{
	public static void main(String args[])
	{
	int balance =10000;int tot;int tot1;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=scan.next();
	System.out.println("HELLO" +name);
	System.out.println("WELCOME TO ATM TRANSACTION");
	System.out.println("    ");
	System.out.println("Enter the pin number");
	int p=scan.nextInt();
	switch(p)
	{
	case 12345:
	{
	System.out.println("YOU HAVE ENTERED THE VALID PIN \nYOU CAN CARRY ON WITH THE BELOW OPERATIONS");
	}
	while(true)
	{
		System.out.println("1.WITHDRAW AMOUNT \n2.DEPOSIT AMOUNT \n3.CHECK BALANCE \n4.EXIT FROM TRANSACTION");
		System.out.println("    ");
		System.out.println("ENTER THE OPERATION TO PERFORM 1. 2. 3. 4.");
		int options=scan.nextInt();
		switch(options)
		{
			case 1:
			System.out.println("ENTER THE WITHDRAW AMOUNT");
			int wit=scan.nextInt();
			System.out.println("YOUR TRANSACTION IS SUCCESSFUL");
			System.out.println("    ");
			tot=balance-wit;
			System.out.println("THE TOTAL BALANCE AFTER WIHTDRAW IS:"+tot);
			System.out.println("    ");
			break;
			
			case 2:
			System.out.println("ENTER THE DEPOSIT AMOUNT");
			int dep=scan.nextInt();
			tot1=balance+dep;
			System.out.println("DEPOSITED SUCCESSFULLY");
			System.out.println("THE TOTAL BALANCE AFTER DEPOSIT IS:"+tot1);
			System.out.println("    ");
			break;
			
			case 3:
		    System.out.println("CHECK THE BALANCE");
			System.out.println("THE AVAILABLE BALANCE YOU HAVE NOW IS:"+balance);
			System.out.println("    ");
			break;
			
			case 4:
			System.exit(0);
			
		}
			
		
	}
	    default:
		System.out.println("You have entered an invalid Password");
		break;
	}
}

}