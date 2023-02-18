public class Palindrome
{
public static void main(String args[])
{
String s="madam";
System.out.println("The string is:"+s);
String s1="";
for(int i=s.length()-1;i>=0;i--)
{
s1=s1+s.charAt(i);

}
System.out.println("The reversed string is:"+s1);	
if(s.equals(s1))
{
	System.out.println("The String is palindrome");
}
else
{
	System.out.println("the string is not palindrome:");
}
}
}

